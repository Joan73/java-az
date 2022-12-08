
package lenguaje.fundamentos;
import java.util.Scanner;

/**
 * Ejemplo de menú por consola
 * @author joanpont
 */
public class Menu {
    
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        
        // MENÚ
        System.out.print("EJEMPLO DE MENÚ CON OCPCIONES \n\n");
        System.out.println("1. OPCIÓN 1.");
        System.out.println("2. OPCIÓN 2.");
        System.out.println("3. OPCIÓN 3.");
        System.out.println("4. OPCIÓN 4.");
        System.out.println("5. OPCIÓN 5.");
        System.out.println("6. OPCIÓN DE SALIDA.");
        System.out.print("INTRODUCE LA OPCIÓN ESCOGIDA: ");
        
        // Lectura de la opción escogida por el usuario
        int opcion = sc.nextInt();
        
        switch(opcion){
            case 1 -> System.out.println("Has escogido la opción 1.");
            case 2 -> System.out.println("Has escogido la opción 2.");
            case 3 -> System.out.println("Has escogido la opción 3.");
            case 4 -> System.out.println("Has escogido la opción 4.");
            case 5 -> System.out.println("Has escogido la opción 5.");
            case 6 -> System.out.println("Has escogido la opción de salida. Hasta luego!");
            default -> System.out.println("La opción introducida no es válida");
        }
        
    }
}
