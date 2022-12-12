
package EjerciciosFunciones;

import java.util.Scanner;

/**
 * Dado un texto introducido por teclado, visualiza dicho texto codificado en 
 * función del criterio de codificación por tres desplazamientos posicionales 
 * del alfabeto. Es decir, el alfabeto y alfabeto codificado serían respectivamente:
 * ALFABETO={a,b,c,d,e,f,g,h,i,j,k,l,m,n,ñ,o,p,q,r,s,t,u,v,w,x,y,z}
 * ALFCOD={d,e,f,g,h,i,j,k,l,m,n,ñ,o,p,q,r,s,t,u,v,w,x,y,z,a,b,c}
 * Programa una función que dado un carácter devuelva el carácter codificado. 
 * Si el carácter no es alfabético, la función debería devolver el mismo carácter.
 * Usa dicha función para resolver el problema del enunciado.
 * @author joanpont
 */

public class Ejercicio10 {
    
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
        final char alfcod [] ="defghijklmnñopqrstuvwxyzabc".toCharArray();
        
        // Codificamos el carácter
        for(int i = 0; i<alfabeto.length; i++){
            if(caracter == alfabeto[i]){
                return alfcod[i];
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
