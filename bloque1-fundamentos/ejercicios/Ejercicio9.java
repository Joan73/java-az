
package Ejercicios;

import java.util.Scanner;

/**
 * Dada una combinación de quiniela introducida por el usuario, a demanda del
 * programa, se visualiza el número de aciertos de dicha combinación. Supon que 
 * la combinación ganadora es:
 * '1','x','2','1','1','2','2','2','x','x','1','2','2','2','x'
 * @author joanpont
 */

public class Ejercicio9 {
    public static void main(String[] args){
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        char combinacionGanadora [] = {'1','x','2','1','1','2','2','2','x','x','1','2','2','2','x'};
        int aciertos = 0;
        // También podríamos aprovechar las funcionalidades de la clase String
        //char combinacionGanadora [] = "1x211222xx1222x".toCharArray();
        
        // Lectura de la secuencia de caracteres
        System.out.print("Introduce la combinación de la quiniela: ");
        String palabra = sc.nextLine();
        char [] combinacionUsuario = palabra.toCharArray();
        
        // Contamos el número de aciertos
        for(int i = 0; i<combinacionGanadora.length; i++ ){
            if(combinacionGanadora[i] == combinacionUsuario[i]){
                aciertos++;
            }
        }
        
        System.out.print("Número de aciertos: "+aciertos);
    }
}
