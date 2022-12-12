
package Ejercicios;

import java.util.Scanner;

/**
 * Dada una secuencia de caracteres introducida por teclado, visualizar el número 
 * de veces que aparece la primera palabra en dicha secuencia.
 * @author joanpont
 */

public class Ejercicio20 {
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int numPalabras = 0;
        
        // Lectura de la secuencia de caracteres
        System.out.print("Introduce la secuencia de caracteres: ");
        String texto = sc.nextLine();
        char caracteres [] = texto.toCharArray();
        
        // Búsqueda del número veces que aparece la primera palabra en la secuencia
        
        // Iteramos sobre cada carácter
        String palabra = "", palabraInicial = "";
        boolean flag = true;
        
        for(int i = 0; i<caracteres.length; i++){
            // Buscamos cuando tendremos el fin de una palabra
            if(!(caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',' || 
                    caracteres[i] == ';' || caracteres[i] == ':' || caracteres[i] == '?' ||
                    caracteres[i] == '¿' || caracteres[i] == '!' || caracteres[i] == '¡') && 
                    i<caracteres.length-1){
                palabra = palabra+caracteres[i];
                
            }else if(i < caracteres.length-1 && !palabra.isEmpty()){
                // Guardamos la primera palabra
                if(flag){
                    palabraInicial = palabra;
                    flag = false;
                }
                
                // Vemos si la palabra coincide con la palabra inicial
                if(palabraInicial.equals(palabra)){
                    numPalabras++;
                }
                // Preparamos para la siguiente palabra
                palabra = "";
                
            }else if(i == caracteres.length-1 && !palabra.isEmpty()){
                
                // Añadimos el último carácter a la última palabra
                palabra = palabra + caracteres[i];
                // Comprobamos si la última palabra coincide con la primera
                if(palabraInicial.equals(palabra)){
                    numPalabras++;
                }
            }
        }
        
        // Imprimimos el resultado
        System.out.println("El número de veces que aparece la primera palabra es: "+numPalabras);
    }
}
