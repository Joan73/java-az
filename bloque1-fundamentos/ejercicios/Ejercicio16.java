
package Ejercicios;

import java.util.Scanner;

/**
 * Dada una secuencia de caracteres introducida por teclado, visualiza el número 
 * de palabras cuyos caracteres sean todos caracteres vocales.
 * @author joanpont
 */
public class Ejercicio16 {
    
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int numPalabras = 0;
        
        // Lectura de la secuencia de caracteres
        System.out.print("Introduce la secuencia de caracteres: ");
        String texto = sc.nextLine();
        char caracteres [] = texto.toCharArray();
        
        // Búsqueda del número de palabras con todos los caracteres vocales
        
        // Iteramos sobre cada carácter
        String palabra = "";
        boolean flag = true;
        
        for(int i = 0; i<caracteres.length; i++){
            // Buscamos cuando tendremos el fin de una palabra
            if(!(caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',' || 
                    caracteres[i] == ';' || caracteres[i] == ':' || caracteres[i] == '?' ||
                    caracteres[i] == '¿' || caracteres[i] == '!' || caracteres[i] == '¡') && 
                    i<caracteres.length-1){
                
                // Comprobamos si la palabra tiene algún carácter consonante
                if(caracteres[i] != 'a' && caracteres[i] != 'e' && caracteres[i] != 'i' &&
                        caracteres[i] != 'o' && caracteres[i] != 'u'){
                    // Si entramos en esta bifurcación entonces no es una palabra 
                    // con todos los caracteres vocales
                    flag = false;
                }
                palabra = palabra+caracteres[i];
            }else if(i < caracteres.length-1 && !palabra.isEmpty()){
                // Si la cadena 'palabra' NO es vacía, entonces hay una palabra
                
                // Comprobamos si la palabra tiene todos los caracteres vocales
                if(flag){
                    numPalabras++;
                }
                
                // Preparamos para la siguiente palabra
                palabra = "";
                flag = true;
                
            }else if(i == caracteres.length-1 && !palabra.isEmpty()){
                // Si estamos en la última iteración y la palabra no es vacía
                // entonces hay una palabra más
                
                // Comprobamos si la última palabra tiene todos los caracteres vocales
                if(flag && (caracteres[i] == 'a' || caracteres[i] == 'e' || 
                        caracteres[i] == 'i' || caracteres[i] == 'o' || caracteres[i] == 'u')){
                    numPalabras++;
                }
            }
        }
        
        // Imprimimos el resultado
        System.out.println("El número de palabras con todos los caracteres vocales de la secuencia es: "+numPalabras);
    }
}
