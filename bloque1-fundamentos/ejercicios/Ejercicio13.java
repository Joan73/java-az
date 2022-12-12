
package Ejercicios;

import java.util.Scanner;

/**
 * Dado un texto introducido por teclado, visualiza la frecuencia de aparición 
 * de los caracteres alfabéticos contenidos en dicho texto.
 * @author joanpont
 */

public class Ejercicio13 {
    
    public static void main(String [] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        final char alfabeto [] = "abcdefghijklmnñopqrstuvwxyz".toCharArray();
        int frecuencia [] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        
        // Lectura de datos
        System.out.print("Introduce secuencia: ");
        String textoCodificado = sc.nextLine();
        char caracteres [] = textoCodificado.toCharArray();
        
        // Comprovamos si todos y cada uno de los caracteres del texto es un carácter alfabético
        for(int i = 0; i<caracteres.length; i++){
            for(int j = 0; j<alfabeto.length; j++){
                if(caracteres[i] == alfabeto[j]){
                    frecuencia[j] += 1;
                    break;
                }
            }
        }
        
        // Imprimir resultados
        for (int i = 0; i<frecuencia.length; i++){
            System.out.println("El carácter "+ alfabeto[i] + " aparece "+ frecuencia[i]+ " veces en el texto.");
        }
    }
    
   
}
