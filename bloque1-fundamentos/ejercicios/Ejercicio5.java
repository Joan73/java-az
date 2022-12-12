
package Ejercicios;

import java.util.Scanner;

/**
 *  Dada una secuencia de caracteres introducida por teclado, 
 *  visualiza el número de caracteres consonantes, vocales y espacios en blanco 
 *  contenidos en dicha secuencia.
 * @author joanpont
 */

public class Ejercicio5 {
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int numVocales = 0, numConsonantes = 0, numEspacios = 0;
        
        // Lectura de la secuencia de caracteres
        System.out.print("Introduce la secuencia de caracteres: ");
        String texto = sc.nextLine();
        char caracteres [] = texto.toCharArray();
        
        // Búsqueda del número de caracteres consonantes seguidos de un carácter vocal.
        
        // Iteramos sobre cada carácter
        for(char car: caracteres){
            // Comprobamos si el carácter es vocal, consonante o un espacio
            if(car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u'){
                numVocales++;
            } else if(car == ' '){
                numEspacios++;
            }else if(!(car == '.' || car == ',' || car == ';' || car == ':' || car == '\n' ||
                    car == '?' || car == '¿' || car == '!' || car=='¡')){
                numConsonantes++;
            }
        }
        
        // Otra solución sería usar la bifurcación switch
        /*
        for(char car:caracteres){
            switch(car){
                case 'a', 'e', 'i', 'o','u' -> numVocales++;
                case ' ' -> numEspacios++;
                case 'b', 'c', 'd' ,'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 
                        'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' -> numConsonantes++; 
            }
        }
        */
        
        System.out.println("El número de caracteres vocales en la secuencia es: "+numVocales);
        System.out.println("El número de caracteres consonantes en la secuencia es: "+numConsonantes);
        System.out.println("El número de caracteres espacio en la secuencia es: "+numEspacios);
    }
}
