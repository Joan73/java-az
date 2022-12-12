
package EjerciciosFunciones;

import java.util.Scanner;

/**
 * Dada una palabra introducida por teclado visualiza si es un palíndromo o no. 
 * Crea una función que devuelva un true si la palabra es un palíndromo y false en
 * caso contrario.
 * NOTA: Una palíndromo es una palabra que se lee igual de derecha a izquierda, que
 * de izquierda a derecha. Por ejemplo: radar, ama, ana, salas, setas, etc.
 * @author joanpont
 */

public class Ejercicio2 {
    public static void main(String[] args){
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        
        // Lectura de la secuencia de caracteres
        System.out.print("Introduce la palabra: ");
        String palabra = sc.nextLine();
        
        if(palindromo(palabra)){
            System.out.println("La palabra es un palíndromo");
        }else{
            System.out.println("La palabra no es un palíndromo");
        }
        
        
    }
    
    public static boolean palindromo(String palabra){
        
        // Declaraciones
        char caracteres [] = palabra.toCharArray();
        int inicio = 0, fin = caracteres.length-1, mod = caracteres.length%2;
        
                
        // Comprobamos si es un palíndromo
        while (caracteres[inicio]==caracteres[fin] && inicio<(fin+mod)) {
            // Mientras entremos en este bucle, los caracteres coinciden dos a dos
            inicio++;
            fin--;
        }
        /*Podemos salir del bucle por dos condiciones: por la 1 o 2 condición.
        Si salimos por la primera condición, la palabra no es un palíndromo.
        Si salimos por la segunda condición, la palabra es un palíndromo*/
        
        // Devolvemos si la palabra es un palíndromo comprobando la 2 condición 
        // del bucle anterior
        return inicio>fin+mod;
    }
}
