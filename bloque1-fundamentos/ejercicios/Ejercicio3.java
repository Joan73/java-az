
package Ejercicios;

import java.util.Scanner;

/**
 * Dada una secuencia de caracteres introducida por teclado, visualiza el primer
 * carácter vocal contenido en dicha secuencia. Usa el bucle while para resolver el problema
 * @author joanpont
 */

public class Ejercicio3 {
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        
        // Lectura de la secuencia de caracteres
        System.out.print("Introduce la secuencia de caracteres: ");
        String texto = sc.nextLine();
        char caracteres [] = texto.toCharArray();
        
        
        // Búsqueda del primer carácter vocal
        
        // Iteramos sobre cada carácter
        int contador = 0;
        while(flag){
            // También podríamos escribir while(flag == true){...}
            // Buscamos el primer carácter vocal
            if(caracteres[contador] == 'a' || caracteres[contador] == 'e' || 
                    caracteres[contador] == 'i' || caracteres[contador] == 'o' || 
                    caracteres[contador] == 'u'){
                
                // Imprimimos el carácter vocal por pantalla
                System.out.println("El primer carácter vocal de la secuencia es: "+ caracteres[contador]);
                // Actualizamos la variable booleana que permite salir del bucle
                flag = false;
            }
            // Aumentamos contador en una unidad
            contador++;
        }
        
        // Otra solución válida (si nos permitiese el enunciado) sería usar el bucle 
        // for con la sentencia break.
        
        /*
        for(int i = 0; i<caracteres.length;i++){
            // Comprobamos si el carácter es 'a'.
            if(caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || 
                    caracteres[i] == 'o' || caracteres[i] == 'u'){
                
                System.out.println("El primer carácter vocal de la secuencia es: "+caracteres[i]);
                break;
            }
        }
        */
        
        // Otra solución válida (si el enunciado lo permitiese) sería usar el 
        // bucle for-each con la sentencia break.
        
        /*
        for(char car: caracteres){
            // Comprovamos si el carácter es vocal.
            if(car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u'){
                System.out.println("El primer carácter vocal de la secuencia es: "+car);
                break;
            }
        }
        */
    }
}
