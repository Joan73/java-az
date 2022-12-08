
package lenguaje.fundamentos;

// Importar toda la librería java.io
import java.io.*;

/**
 * Practicar la entrada de datos por teclado
 * @author joanpont
 */
public class EntradaSalida {
    
    public static void main(String[] args) throws Exception{
        
        // Lectrua de un carácter por teclado
        char caracter = (char) System.in.read();
        System.out.print("El caracter leído es: ");
        System.out.println(caracter);
        
        /*
        Cuando un usuario introduce un caracter por teclado. En realidad en el
        buffer se almacena el carácter introducido por el usuario. Y el caracter 
        salto de línea ('\n'). Por ejemplo, si el usuario introduce el carácter 'a'.
        En el buffer tendremos almacenado: {'a','\n'}. Por tanto necesitamos vaciar 
        el buffer para leer otro carácter diferente.
        */
        
        //char caracter2 = (char) System.in.read();
        //System.out.print("El 2 caracter leído es: ");
        //System.out.println(caracter2); 
        
        // Vaciar el buffer
        System.in.read();
        System.out.print("Introduce un carácter: ");
        char caracter2 = (char) System.in.read();
        System.out.print("El 2 caracter leído es: ");
        System.out.println(caracter2); 
        
        // Vaciar el buffer
        System.in.read();
        
        // Lectura de un string
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Introduce la cadena de texto: ");
        String cadena = in.readLine();
        System.out.print("La cadena introducida por el usuario es: ");
        System.out.println(cadena);
        
        // Lectura de un número entero
        System.out.print("Introduce el número entero: ");
        String cadenaEntera = in.readLine();
        int entero = Integer.parseInt(cadenaEntera);
        System.out.print("El número entero introducido por el usuario es: ");
        System.out.println(entero);
        
        // Lectura de un número real
        System.out.print("Introduce el número real: ");
        String cadenaReal = in.readLine();
        double real = Double.parseDouble(cadenaReal);
        //Equivalentea a: double real = Double.parseDouble(in.readLine());
        System.out.print("El número real introducido por el usuario es: ");
        System.out.println(real);
    }
}
