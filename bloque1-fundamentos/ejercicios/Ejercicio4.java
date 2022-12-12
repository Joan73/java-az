
package Ejercicios;

import java.util.Scanner;

/**
 * Dada una secuencia de caracteres introducida por teclado, visualiza el número 
 * de caracteres consonantes que van seguidos de un carácter vocal.
 * @author joanpont
 */

public class Ejercicio4 {
    
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int numSecuencia = 0;
        
        // Lectura de la secuencia de caracteres
        System.out.print("Introduce la secuencia de caracteres: ");
        String texto = sc.nextLine();
        char caracteres [] = texto.toCharArray();
        
        // Búsqueda del número de caracteres consonantes seguidos de un carácter vocal.
        
        // Iteramos sobre cada carácter
        for(int i = 0; i<caracteres.length; i = i+2){
            // Comprobamos si el carácter es consonante
            if(!(caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || 
                    caracteres[i] == 'o' || caracteres[i] == 'u' || caracteres[i] == ' ' || 
                    caracteres[i] == ',' || caracteres[i] == ';' || caracteres[i] == '.' ||
                    caracteres[i] == ':' || caracteres[i] == '\n' || caracteres[i] == '?' ||
                    caracteres[i] == '¿' || caracteres[i] == '!'|| caracteres[i] == '¡')){
                // Comprobamos si el siguiente carácter es vocal (siempre que haya siguiente carácter)
               if((i+1<caracteres.length)&&(caracteres[i+1] == 'a' || 
                       caracteres[i+1] == 'e' || caracteres[i+1] == 'i' || 
                       caracteres[i+1] == 'o' || caracteres[i+1] == 'u')){
                   numSecuencia++;
               }
            }
        }
        
        System.out.println("El número de caracteres vocales en la secuencia es: "+numSecuencia);
    }
}
