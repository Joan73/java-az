
package Ejercicios;

import java.util.Scanner;

/**
 * Dada una secuencia de caracteres introducida por teclado, visualizar el número 
 * de palabras con un número de caracteres introducido por el usuario a 
 * petición del programa.
 * @author joanpont
 */

public class Ejercicio18 {
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int numPalabras = 0, numCaracteres;
        
        // Lectura de la secuencia de caracteres
        System.out.print("Introduce la secuencia de caracteres: ");
        String texto = sc.nextLine();
        char caracteres [] = texto.toCharArray();
        
        // Lectura del número de caracteres
        System.out.print("Número de caracteres: ");
        numCaracteres = sc.nextInt();
        
        // Búsqueda del número de palabras con el número de caracteres introducido por el usuario       
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
                // Comprobamos si la palabra tiene 'numCaracteres' caracteres
                if(palabra.length() == numCaracteres){
                    numPalabras++;
                }
                // Preparamos para la siguiente palabra
                palabra = "";
            }else if(i == caracteres.length-1 && !palabra.isEmpty()){
                // Añadimos el carácter faltante
                palabra = palabra+caracteres[i];
                
                // Comprobamos si tiene 'numCaracteres' caracteres
                if(palabra.length() == numCaracteres){
                    numPalabras++;
                }
            }
        }
        
        // Imprimimos el resultado
        System.out.println("El número de palabras de "+ numCaracteres+ " letras de la secuencia es: "+numPalabras);
    }
}
