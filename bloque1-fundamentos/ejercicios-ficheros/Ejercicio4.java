
package EjerciciosFicheros;

import java.util.Scanner;
import java.io.FileWriter;

/**
 * Dado un texto introducido por teclado, graba todas las palabras del texto 
 * (una por línea) en un fichero de salida con el nombre salida.txt. 
 * 
 * @author joanpont
 */

public class Ejercicio4 {
    
    public static void main(String[] args) throws Exception{
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        FileWriter salida = new FileWriter("salida.txt");
        int temp = 0;
        
        // Lectura del texto
        System.out.print("Introduce el texto: ");
        String texto = sc.nextLine();
        char caracteres [] = texto.toCharArray();
        
        // Tratamiento del problema    
        while(temp<caracteres.length){
            // Leemos la palabra
            String output [] = lecturaPalabra(temp, caracteres);
            String palabra = output[0];
            temp = Integer.parseInt(output[1]);
            
            // Escribimos la palabra en el fichero de salida
            if(!palabra.isEmpty()){
                salida.write(palabra);
                salida.write("\n");
            }
        }
        
        //Cerramos el fichero
        salida.close();  
        
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
