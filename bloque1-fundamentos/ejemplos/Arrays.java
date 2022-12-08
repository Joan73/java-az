
package lenguaje.fundamentos;

import java.util.Scanner;

/**
 * Practicar los conocimientos adquiridos sobre los arrays
 * @author joanpont
 */
public class Arrays {
    
    public static void main(String [] args){
        
        // Ejemplo 1. Array de enteros
        // Declarar un array de enteros
        int arrayEnteros [] = new int[3];
        // int arrayEnteros [];
        // arrayEnterors = new int[3];
        
        // Asignamos valores al array
        arrayEnteros[0] = 1;
        arrayEnteros[1] = 2;
        arrayEnteros[2] = 3;
        
        // Consultar los valores de un array
        System.out.println("En la primera posición hay el valor "+ arrayEnteros[0]);
        System.out.println("En la segunda posición hay el valor "+ arrayEnteros[1]);
        System.out.println("En la tercera posición hay el valor "+ arrayEnteros[2]);
        
        // Ejemplo 2. Array de caracteres
        char vocales [] = {'a','e','i','o','u'};
        
        // Modificamos los valores iniciales del array de vocales
        vocales[0] = vocales[1];
        vocales[1] = vocales[2];
        vocales[2] = vocales[3];
        vocales[3] = vocales[4];
        vocales[4] = 'a';
        
        // Accedemos a todas las posiciones
        System.out.println("El carácter que está en posición 1 (índice 0) es: "+ vocales[0]);
        System.out.println("El carácter que está en posición 2 (índice 1) es: "+ vocales[1]);
        System.out.println("El carácter que está en posición 3 (índice 2) es: "+ vocales[2]);
        System.out.println("El carácter que está en posición 4 (índice 3) es: "+ vocales[3]);
        System.out.println("El carácter que está en posición 5 (índice 4) es: "+ vocales[4]);
        
        // Ejemplo del alfabeto
        char abecedario [] = "abcdefghijklmnñopqrstuvwxyz".toCharArray();
        
        System.out.println("La longitud del abecedario español es de: "+abecedario.length);
        
        // Array de información introducida por el usuario
        Scanner sc = new Scanner(System.in);
        String informacionUsuario [] = new String[3];
        
        System.out.print("Introduce la cadena 1: ");
        informacionUsuario[0] = sc.nextLine();
        
        System.out.print("Introduce la cadena 2: ");
        informacionUsuario[1] = sc.nextLine();
        
        System.out.print("Introduce la cadena 3: ");
        informacionUsuario[2] = sc.nextLine();
        
        // Imprimimos la información alamacenada en el array
        System.out.println("La primera cadena introducida por el usuario es: "+informacionUsuario[0]);
        System.out.println("La segunda cadena introducida por el usuario es: "+informacionUsuario[1]);
        System.out.println("La tercera cadena introducida por el usuario es: "+informacionUsuario[2]);
        
    }
}
