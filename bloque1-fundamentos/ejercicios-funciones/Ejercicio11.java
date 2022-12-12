
package EjerciciosFunciones;

import java.util.Scanner;

/**
 * Modifica el ejercicio anterior para optimizar el almacenamiento. El objetivo 
 * es usar un solo array en lugar de dos arrays para codificar el texto. Notemos 
 * que el ejercicio anterior se codifica con tres desplazamientos posicionales 
 * del alfabeto. El programa debería tener una variable constante para que se 
 * pueda modificar si se desea el número de desplazamientos para la codificación.
 * 
 * @author joanpont
 */

public class Ejercicio11 {
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        
        // Lectura de datos
        System.out.print("Introduce secuencia: ");
        String texto = sc.nextLine();
        char caracteres [] = texto.toCharArray();
        
        // Codificación de todos los caracteres del texto. 
        // Si el carácter no es del alfabeto, no se codifica y se deja igual
        for (char car:caracteres){
            System.out.print(codificacion(car));
        }
        
    }
    
    public static char codificacion(char caracter){
        // Declaraciones
        final char alfabeto [] = "abcdefghijklmnñopqrstuvwxyz".toCharArray();
        final int desplazamiento = 3;
        
        // Codificamos el carácter
        for(int i = 0; i<alfabeto.length; i++){
            if(caracter == alfabeto[i]){
                return alfabeto[(i+desplazamiento)%alfabeto.length];
            }
        }
        
        /*
        Si terminamos el bucle y no hemos devuelto ningún carácter, significa
        que el caracter no es del alfabeto (será un carácter especial como un 
        punto, una coma, un espacio, etc). Por tanto lo devolvemos sin codificar
        */
        
        return caracter;
    }
}
