
package Ejercicios;

import java.util.Scanner;

/**
 * Dada una secuencia de caracteres introducida por teclado, visualizar el número 
 * de palabras con un número impar de caracteres vocales y el número de palabras 
 * con un número par de caracteres vocales.
 * @author joanpont
 */

public class Ejercicio19 {
    
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int numPalabrasPares = 0, numPalabrasImpares = 0;
        
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
            }else if(i < caracteres.length-1 && !palabra.isEmpty()){            
                // Comprobamos si la palabra tien 5 caracteres
                if(palabra.length()%2 == 0){
                    numPalabrasPares++;
                }else{
                    numPalabrasImpares++;
                }
                // Preparamos para la siguiente palabra
                palabra = "";
            }else if(i == caracteres.length-1 && !palabra.isEmpty()){
                // Añadimos el carácter faltante
                palabra = palabra+caracteres[i];
                
                // Comprobamos si tiene 5 caracteres
                if(palabra.length()%2 == 0){
                    numPalabrasPares++;
                }else{
                    numPalabrasImpares++;
                }
            }
        }
        
        // Imprimimos el resultado
        System.out.println("El número de palabras con un número par de letras es: "+numPalabrasPares);
        System.out.println("El número de palabras con un número impar de letras es: "+numPalabrasImpares);
    }
}
