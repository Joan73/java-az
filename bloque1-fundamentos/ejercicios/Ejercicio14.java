
package Ejercicios;

import java.util.Scanner;

/**
 * Dada una secuencia de caracteres introducida por teclado, visualiza el número 
 * de palabras contenidas en dicha secuencia.
 * @author joanpont
 */

public class Ejercicio14 {
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int numPalabras = 0;
        
        // Lectura de la secuencia de caracteres
        System.out.print("Introduce la secuencia de caracteres: ");
        String texto = sc.nextLine();
        char caracteres [] = texto.toCharArray();
        
        // Búsqueda del número de palabras
        
        // Iteramos sobre cada carácter
        String palabra = "";
        for(int i = 0; i<caracteres.length; i++){
            // Buscamos cuando tendremos el fin de una palabra
            if(!(caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',' || 
                    caracteres[i] == ';' || caracteres[i] == ':' || caracteres[i] == '?' ||
                    caracteres[i] == '¿' || caracteres[i] == '!' || caracteres[i] == '¡') && 
                    i<caracteres.length-1){
                palabra = palabra+caracteres[i];
            }else if(!palabra.isEmpty()){
                // Si la cadena 'palabra' NO es vacía, entonces hay una palabra
                numPalabras++;
                palabra = "";
            }else if(i == caracteres.length-1 && !palabra.isEmpty()){
                // Si hemos terminado de recorrer toda la cadena de caracteres y la palabra 
                // no es vacía entonces hay una palabra más
                numPalabras++;
            }
        }
        
        // Imprimimos el resultado
        System.out.println("El número de palabras de la secuencia es: "+numPalabras);
    }
    
}
