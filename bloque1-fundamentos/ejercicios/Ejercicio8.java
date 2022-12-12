
package Ejercicios;

import java.util.Scanner;

/**
 * Dados 10 números enteros introducidos por teclado, visualiza aquellos que son pares.
 * @author joanpont
 */

public class Ejercicio8 {
    
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        final int iteraciones = 10;
        int numeros [] = new int[iteraciones];
        
        // Lectura y almacenamiento de los 10 números enteros introducidos por teclado
        for(int i = 0; i<iteraciones; i++){
            System.out.print("Introduce el "+(i+1)+" número: ");
            numeros[i] = sc.nextInt();
        }
        
        // Visualizar números pares
        for(int num: numeros){
            if(num%2 == 0){
                System.out.print(num+" ");
            }
        }
    }
}
