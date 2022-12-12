
package Ejercicios;

import java.util.Scanner;

/**
 * Dada una secuencia de caracteres introducida por teclado, visualiza el número 
 * de caracteres 'a', de caracteres ‘e', de caracteres 'i', de caracteres 'o', 
 * de caracteres 'u' y de caracteres consonantes contenidos en dicha secuencia 
 * de entrada.
 * @author joanpont
 */

public class Ejercicio7 {
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int numA = 0, numE = 0, numI = 0, numO =0, numU=0, numConsonantes =0;
        
        // Lectura de la secuencia de caracteres
        System.out.print("Introduce la secuencia de caracteres: ");
        String texto = sc.nextLine();
        char caracteres [] = texto.toCharArray();
        
        // Búsqueda del número de consonantes y caracteres vocales individuales
        
        // Iteramos sobre cada carácter y comprobamos el caso en el que entra
        for(char car: caracteres){
            switch(car){
                case 'a' -> numA+=1;
                case 'e' -> numE+=1;
                case 'i' -> numI+=1;
                case 'o' -> numO+=1;
                case 'u' -> numU+=1;
                case ' ', ',', ';', ':', '.', '?', '¿', '!', '¡' -> {}
                default -> numConsonantes+=1;
            }
        }
        
        // Imprimimos los resultados
        System.out.println("El número de caracteres 'a' de la secuencia es: "+numA);
        System.out.println("El número de caracteres 'e' de la secuencia es: "+numE);
        System.out.println("El número de caracteres 'i' letras de la secuencia es: "+numI);
        System.out.println("El número de caracteres 'o' letras de la secuencia es: "+numO);
        System.out.println("El número de caracteres 'u' letras de la secuencia es: "+numU);
        System.out.println("El número de caracteres consonantes letras de la secuencia es: "+numConsonantes);
    }
}
