
package lenguaje.fundamentos;

//Para importar todo el paquete java.util: import java.util.*;
import java.util.Locale;
import java.util.Scanner;

/**
 * Practiar la lectura de datos con la clase Scanner
 * @author joanpont
 */
public class ClaseScanner {
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        
        // Ejemplo 1: Lectura de un string
        System.out.print("Introducir cadena: ");
        String cadena = sc.nextLine();
        System.out.print("La cadena que ha introducido el usuario es: ");
        System.out.println(cadena);
        
        // Lectura de un carácter
        System.out.print("Introducir carácter: ");
        char caracter = sc.next().charAt(0);
        System.out.print("El carácter introducido por el usuario es: ");
        System.out.println(caracter);
        
        // Lectura de un número entero
        System.out.print("Introducir un número entero: ");
        long entero = sc.nextLong();
        System.out.print("El entero que ha introducido el usuario es: ");
        System.out.println(entero);
        
        // Lectura de un número real
        System.out.print("Introducir un número real: ");
        double real = sc.nextDouble();
        System.out.print("El número real que ha introducido el usuario es: ");
        System.out.println(real);
    }
}
