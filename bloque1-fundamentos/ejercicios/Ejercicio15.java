
package Ejercicios;

import java.util.Scanner;

/**
 * Dada una secuencia de caracteres introducida por teclado, visualiza el número 
 * de palabras con 5 caracteres contenidas en dicha secuencia.
 * @author joanpont
 */
public class Ejercicio15 {
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int numPalabras = 0;
        
        // Lectura de la secuencia de caracteres
        System.out.print("Introduce la secuencia de caracteres: ");
        String texto = sc.nextLine();
        char caracteres [] = texto.toCharArray();
        
        // Búsqueda del número de palabras con 5 caracteres
        
        // Iteramos sobre cada carácter
        String palabra = "";
        for(int i = 0; i<caracteres.length; i++){
            // Buscamos cuando tendremos el fin de una palabra
            if(!(caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',' || 
                    caracteres[i] == ';' || caracteres[i] == ':' || caracteres[i] == '?' ||
                    caracteres[i] == '¿' || caracteres[i] == '!' || caracteres[i] == '¡') && 
                    i<caracteres.length-1){
                palabra = palabra+caracteres[i];
            }else if(i < caracteres.length-1 && !palabra.isEmpty()){
                // Si la cadena 'palabra' NO es vacía, entonces hay una palabra              
                // Comprobamos si la palabra tiene 5 caracteres
                if(palabra.length() == 5){
                    numPalabras++;
                }
                // Preparamos para la siguiente palabra
                palabra = "";
            }else if(i == caracteres.length-1 && !palabra.isEmpty()){
                // Si estamos en la última iteración y la palabra no es vacía
                // entonces hay una palabra más
                
                // Añadimos el carácter faltante
                palabra = palabra+caracteres[i];
                
                // Comprobamos si tiene 5 caracteres
                if(palabra.length() == 5){
                    numPalabras++;
                }
            }
        }
        
        // Imprimimos el resultado
        System.out.println("El número de palabras de 5 letras de la secuencia es: "+numPalabras);
    }
}
