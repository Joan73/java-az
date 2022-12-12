
package Ejercicios;

import java.util.Scanner;

/**
 * Dada una secuencia de caracteres introducida por teclado, visualiza el número 
 * de caracteres 'a' contenidos en dicha secuencia.
 * @author joanpont
 */

public class Ejercicio1 {
    
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int numCaracteresA = 0;
        
        // Lectura de la secuencia de caracteres
        System.out.print("Introduce la secuencia de caracteres: ");
        String texto = sc.nextLine();
        char caracteres [] = texto.toCharArray();
        
        // Búsqueda de la cantidad de caracteres 'a'
        
        // Iteramos sobre cada carácter
        for(int i = 0; i<caracteres.length;i++){
            // Comprobamos si el carácter es 'a'.
            if(caracteres[i] == 'a'){
                numCaracteresA++;
            }
        }
        
        // Otra solución válida:
        /*
        for(char car: caracteres){
            if(car == 'a'){
                numCaracteresA++;
            }
        }
        */
        
        System.out.println("El número de caracteres 'a' en la secuencia es: "+numCaracteresA);
    }

}
