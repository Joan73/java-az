
package lenguaje.fundamentos;
import java.util.Scanner;
import java.util.Locale;

/**
 * Practicar la salida de datos. Imprimir por pantalla
 * @author joanpont
 */

public class EntradaSalidaV2 {
    public static void main(String[] args){
        
        /*
        El operador '+' nos puede servir para concatenar strings. Por ejemplo:
        cad1 + cad2 concatena las dos cadenas.
        
        String cadena1 = "hola", cadena2 = " adios", cadena3 = cadena1+cadena2;
        */
        
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        
        // Ejemplo 1: Lectura de un string
        System.out.print("Introducir cadena: ");
        String cadena = sc.nextLine();
        System.out.println("La cadena "+cadena + " ha sido introducida por el usuario");
        
        // Lectura de un carácter
        System.out.print("Introducir carácter: ");
        char caracter = sc.next().charAt(0);
        System.out.println("El caracter "+caracter+" ha sido introducido por el usuario");
        
        // Lectura de un número entero
        System.out.print("Introducir un número entero: ");
        long entero = sc.nextLong();
        System.out.println("El número entero "+entero+" ha sido introducido por el usuario");
        
        // Lectura de un número real
        System.out.print("Introducir un número real: ");
        double real = sc.nextDouble();
        System.out.println("El número real "+real+" ha sido introducido por el usuario");
        
    }
}
