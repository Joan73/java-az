
package Ejercicios;

import java.util.Scanner;

/**
 * Dada una secuencia de caracteres introducida por teclado, visualiza el número 
 * de caracteres vocales contenidos en dicha secuencia.
 * @author joanpont
 */
public class Ejercicio2 {
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int numCaracteresVocales = 0;
        
        // Lectura de la secuencia de caracteres
        System.out.print("Introduce la secuencia de caracteres: ");
        String texto = sc.nextLine();
        char caracteres [] = texto.toCharArray();
        
        // Búsqueda de la cantidad de caracteres vocales
        
        // Iteramos sobre cada carácter
        for(char car: caracteres){
            // Comprobamos si el carácter es vocal
            if(car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u'){
                numCaracteresVocales++;
            }
        }
        
        // Otra solución válida:
        /*
        for(int i = 0; i<caracteres.length;i++){
            // Comprobamos si el carácter es vocal
            if(caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || 
                    caracteres[i] == 'o' || caracteres[i] == 'u'){
                numCaracteresVocales++;
            }
        }
        */
        
        System.out.println("El número de caracteres vocales en la secuencia es: "+numCaracteresVocales);
    }
}
