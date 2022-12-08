
package lenguaje.fundamentos;

import java.util.Scanner;

/**
 * Ejercicio para practicar los bucles. Especialmente el bucle while 
 * @author joanpont
 */

public class EjercicioBucleWhile {
    
    public static void main(String[] args){
        
        // Ejercicio: Queremos encontrar el siguiente número primo al número dado.
        // ¿Qué es un número primo? Un número es primo si solo es divisible entre él mismo y 1.
        // Ejemplos de números primos: 2, 3, 5, 7, 9, ...
        // Si un usuario introduce el número 5, queremos econtrar el número 7.
        
        System.out.print("Introduce el número: ");
        
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        
        // Variable booleana de salida del bucle while. Inidica cuando hemos encontrado un número primo
        boolean primo = false;
        
        // Variable que almacena el número el cual estamos comprobando si es primo o no
        int contador = numero+1;
        
        /*
        while(!primo){
             
            // comprobar si contador es o no es primo
            boolean encontrado = true;
            
            for(int i = 2; i<contador; i++){
                if(contador%i==0){
                    encontrado = false;
                    break;
                }
            }
            
            if(encontrado){
                primo = true;
            }else{
                contador += 1;
                //contador = contador+1;
            }
            
        }*/
        
        do{
             
            // comprobar si contador es o no es primo
            boolean encontrado = true;
            
            for(int i = 2; i<contador; i++){
                if(contador%i==0){
                    encontrado = false;
                    break;
                }
            }
            
            if(encontrado){
                primo = true;
            }else{
                contador += 1;
                //contador = contador+1;
            }
            
        }while(!primo);
        
        
        System.out.println("El siguiente número primo es: "+contador);
        
    }
}
