
package EjerciciosFunciones;

import java.util.Scanner;

/**
 * Realiza un programa con un menú de tres opciones: codificar, descodificar y 
 * salir. Si el usuario selecciona la opción de codificar o descodificar, entonces 
 * el programa deberá codificar o descodificar el texto introducido por el 
 * usuario. Puedes aprovechar todas las funciones que ya tenemos, solo faltaría 
 * una función que descodifique. Tanto la función de codificación como la de 
 * descodificación solamente pueden usar un array con el alfabeto para optimizar 
 * el almacenamiento. Se debe usar el criterio de 7 desplazamientos para 
 * codificar y descodificar.
 * 
 * @author joanpont
 */

public class Ejercicio12 {
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean flag = true;
        
        while(flag){
            menu();
            opcion = sc.nextInt();
            switch(opcion){
                case 1 -> encrypt();
                case 2 -> decrypt();
                case 3 -> {System.out.println("HAS ESCOGIDO LA OPCIÓN DE SALIDA. HASTALUEGO.");
                            flag = false;}
                default -> System.out.println("OPCIÓN NO VÁLIDA");
            }
        }
        
    }
    
    public static void menu(){
        System.out.println("\n\n\n");
        System.out.println("            CODIFICACIÓN / DESCODIFICACIÓN            ");
        System.out.println("       1. CODIFICACIÓN.");
        System.out.println("       2. DECODIFICACIÓN.");
        System.out.println("       3. SALIDA. \n");
        System.out.print("OPCIÓN ELEGIDA: ");
    }
    
    public static void encrypt(){
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        
        // Lectura de datos a cifrar
        System.out.print("Introduce secuencia: ");
        String textoCodificado = sc.nextLine();
        char caracteres [] = textoCodificado.toCharArray();
        
        // Codificación del texto
        System.out.print("codificación: ");
        for (char car:caracteres){
            System.out.print(codificacion(car));
        }
    }
    
    public static void decrypt(){
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        
        // Lectura de datos a cifrar
        System.out.print("Introduce secuencia: ");
        String textoCodificado = sc.nextLine();
        char caracteres [] = textoCodificado.toCharArray();
        
        // Descodificación del texto
        System.out.print("codificación: ");
        for (char car:caracteres){
            System.out.print(descodificacion(car));
        }
    }
    
    public static char codificacion(char caracter){
        // Declaraciones
        final char alfabeto [] = "abcdefghijklmnñopqrstuvwxyz".toCharArray();
        final int desplazamiento = 7;
        
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
    
    public static char descodificacion(char caracter){
        // Declaraciones
        final char alfabeto [] = "abcdefghijklmnñopqrstuvwxyz".toCharArray();
        final int desplazamiento = 7;
        
        // Descodificamos el carácter
        for(int i = 0; i<alfabeto.length; i++){
            if(caracter == alfabeto[i]){
                return alfabeto[(i+alfabeto.length-desplazamiento)%alfabeto.length];
            }
        }
        
        return caracter;
    }
}
