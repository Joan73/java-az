
package lenguaje.fundamentos;

import java.util.Scanner;

/**
 * Practicar los bucles for: el bucle for clásico y el bucle for-each
 * @author joanpont
 */

public class For {
    
    public static void main(String [] args){
        
        // Ejemplo 1. Almacenar la información introducida por el usuario en un array
        // usando el bucle for
        
        Scanner sc = new Scanner(System.in);
        int arrayEnteros [] = new int[5];
        
        for(int i = 0; i<arrayEnteros.length; i++){
            System.out.print("Introduce el entero en posición "+i+": ");
            arrayEnteros[i] = sc.nextInt();
            
        }
        
        
        // Ejemplo 2: Iterar los elementos de un array. Empecemos con el bucle for clásico
        for(int i = 0; i<arrayEnteros.length; i++){
            System.out.println(arrayEnteros[i]);
        }
        
        // Ejemplo 2 con el bucle for each
        System.out.println("\n\n");
        
        for(int numero: arrayEnteros){
            System.out.println(numero);
        }
        
    }
}
