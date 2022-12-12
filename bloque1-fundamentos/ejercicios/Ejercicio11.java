
package Ejercicios;

import java.util.Scanner;

/**
 * Visualizar de manera invertida 10 números introducidos por teclado.
 * @author joanpont
 */

public class Ejercicio11 {
    
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int numeros [] = new int[10];
        
        // Guardamos los datos introducidos por teclado
        for(int i = 0; i<10; i++){
            System.out.print("Introduce el número "+(i+1)+": ");
            numeros[i] = sc.nextInt();
        }
        
        // Imprimimos los números de forma invertida
        for(int i = 10-1; i>=0; i--){
            System.out.println(numeros[i]);
        }
    }
}
