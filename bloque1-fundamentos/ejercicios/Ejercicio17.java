
package Ejercicios;

import java.util.Scanner;

/**
 * Dada una secuencia de caracteres introducida por teclado, visualizar el número 
 * de palabras con 5 caracteres vocales.
 * @author joanpont
 */

public class Ejercicio17 {
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int numPalabras = 0;
        
        // Lectura de la secuencia de caracteres
        System.out.print("Introduce la secuencia de caracteres: ");
        String texto = sc.nextLine();
        char caracteres [] = texto.toCharArray();
        
        // Búsqueda del número de palabras con 5 caracteres vocales
        
        // Iteramos sobre cada carácter
        String palabra = "";
        int numVocales = 0;
        
        for(int i = 0; i<caracteres.length; i++){
            // Buscamos cuando tendremos el fin de una palabra
            if(!(caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',' || 
                    caracteres[i] == ';' || caracteres[i] == ':' || caracteres[i] == '?' ||
                    caracteres[i] == '¿' || caracteres[i] == '!' || caracteres[i] == '¡') && 
                    i<caracteres.length-1){
                
                // Comprobamos si el carácter de la palabra es vocal
                if(caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' ||
                        caracteres[i] == 'o' || caracteres[i] == 'u'){
                    numVocales++;
                }
                palabra = palabra+caracteres[i];
            }else if(i < caracteres.length-1 && !palabra.isEmpty()){
                
                // Comprobamos si la palabra tiene 5 caracteres vocales
                if(numVocales == 5){
                    numPalabras++;
                }
                
                // Preparamos para la siguiente palabra
                palabra = "";
                numVocales = 0;
                
            }else if(i == caracteres.length-1 && !palabra.isEmpty()){
                // Si estamos en la última iteración y la palabra no es vacía
                // entonces hay una palabra más
                
                // Comprobamos si el último carácter de la última palabra es vocal
                if(caracteres[i] == 'a' || caracteres[i] == 'e' || 
                        caracteres[i] == 'i' || caracteres[i] == 'o' || caracteres[i] == 'u'){
                    numVocales++;
                }
                
                //Comprobamos si la última palabra tiene 5 caracteres vocales
                if(numVocales == 5){
                    numPalabras++;
                }
            }
        }
        
        // Imprimimos el resultado
        System.out.println("El número de palabras con 5 caracteres vocales es: "+numPalabras);
    }
}
