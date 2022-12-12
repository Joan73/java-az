
package EjerciciosFunciones;

import java.util.Scanner;

/**
 * Dadas una palabra y una secuencia de caracteres introducidas por teclado, 
 * visualiza el número de veces que la palabra introducida aparece en la secuencia.
 * @author joanpont
 */

public class Ejercicio9 {
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int temp = 0, cantidad = 0;
        
        // Lectura de datos
        System.out.print("Introduce palabra: ");
        String palabraUsuario = sc.nextLine();
        System.out.print("Introduce secuencia: ");
        String texto = sc.nextLine();
        
        char caracteres [] = texto.toCharArray();
        
        // Búsqueda de las palabras    
        while(temp<caracteres.length){
            // Leemos la siguiente palabra
            String output [] = lecturaPalabra(temp, caracteres);
            String palabra = output[0];
            temp = Integer.parseInt(output[1]);
            
            // Contamos el número de veces que la palabra introducida por el usuario 
            // aparece en la secuencia
            if(palabraUsuario.equals(palabra)){
                cantidad += 1;
            }
        }
        
        System.out.println("El número de veces que la palabra "+palabraUsuario+ " aparece en la secuencia es: "+cantidad);
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
    
    public static String alReves(String palabra){
        // Declaraciones
        char caracteres [] = palabra.toCharArray();
        String palabraAlReves = "";
        
        // Componemos la palabra al revés
        for(int i = (caracteres.length-1); i>=0; i--) palabraAlReves = palabraAlReves+caracteres[i];
        
        // Devolvemos la palabra al revés
        return palabraAlReves; 
    }
}
