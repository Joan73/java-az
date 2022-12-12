
package EjerciciosFunciones;

import java.util.Scanner;

/**
 * Dada una secuencia de caracteres introducida por teclado, visualiza todas las 
 * palabras de la secuencia precedidas del literal 'Palabra: '. Para resolver el 
 * ejercicio usa una función de nombre 'lecturaPalabras' que devuelva un array 
 * de Strings con dos valores: 
 *  - La palabra que se acaba de leer 
 *  - El índice de la secuencia en el que hemos encontrado el final de la palabra.
 * 
 * Esta función nos servirá para leer secuencialmente (en cada invocación se 
 * leerá una palabra de la secuencia) todas las palabras de la secuencia 
 * introducida por teclado.
 * 
 * PISTA: En el método main, cuando invoquemos a la función 'lecturaPalabras' 
 * deberemos realizar un casteo (transformación) del índice (que es un String) a 
 * un tipo de dato entero. Podemos realizar el casteo con la función parseInt(<cadena>) 
 * de la clase Integer. 
 * 
 * @author joanpont
 */

public class Ejercicio1 {
    
    public static void main(String[] args){
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        
        // Lectura de la secuencia de caracteres
        System.out.print("Introduce la secuencia de caracteres: ");
        String texto = sc.nextLine();
        char caracteres [] = texto.toCharArray();
        
        // Búsqueda de las palabras    
        while(temp<caracteres.length){
            // Leemos la siguiente palabra
            String output [] = lecturaPalabra(temp, caracteres);
            String palabra = output[0];
            temp = Integer.parseInt(output[1]);
            
            // Imprimimos la palabra
            if(!palabra.isEmpty()){
                System.out.println("Palabra: "+palabra);
            }
        }
        
    }
    
    public static String[] lecturaPalabra(int indice, char[] caracteres){
        // Declaraciones
        String palabra  = "";
        boolean finPalabra = false;
        int i = indice;
        
        // Leemos la palabra
        while(!finPalabra && i<caracteres.length){
            // Buscamos cuando tendremos el fin de una palabra
            if(!(caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',' || 
                    caracteres[i] == ';' || caracteres[i] == ':' || caracteres[i] == '?' ||
                    caracteres[i] == '¿' || caracteres[i] == '!' || caracteres[i] == '¡')){
                palabra = palabra+caracteres[i];
            }else if(!palabra.isEmpty()){
                // Si la cadena 'palabra' NO es vacía, entonces hemos terminado de leer la palabra
                finPalabra = true;
            }
            // Actualizamos índice
            i++;
        }
        
        // Devolvemos resultado
        String output [] = {palabra,""+i};
        return output;
    }
}
