
package Ejercicios;

import java.util.Scanner;

/**
 * Dada una secuencia de caracteres introducida por teclado 
 * visualiza el número de parejas de caracteres 'ib' contenidos en la secuencia.
 * @author joanpont
 */

public class Ejercicio6 {
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int numSecuencia = 0;
        
        // Lectura de la secuencia de caracteres
        System.out.print("Introduce la secuencia de caracteres: ");
        String texto = sc.nextLine();
        char caracteres [] = texto.toCharArray();
        
        // Búsqueda del número de parejas caracteres 'ib' en la secuencia
        
        // Iteramos sobre cada carácter
        for(int i = 0; i<caracteres.length; i++){
            // Comprobamos si el carácter es 'i' y el siguiente es 'b'
            if(i+1<caracteres.length && caracteres[i] == 'i' && caracteres[i+1] == 'b'){
                numSecuencia++;
                // Si queremos ser más eficientes, aumentamos en una unidad el 
                // índice de control cuando encontramos una secuencia 'ib'
                i++;
            }
        }
        // Imprimimos el resultado
        System.out.println("El número de parejas 'ib' es de: "+numSecuencia);
    }
}
