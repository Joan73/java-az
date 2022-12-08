
package lenguaje.fundamentos;

import java.util.Scanner;

/**
 * Ejemplos de bucles while y do while
 * @author joanpont
 */

public class While {
    
    public static void main(String [] args){
        
        // Ejemplo de hucha
        final int total = 5000;
        int ahorrado = 0;
        
        Scanner sc = new Scanner(System.in);
        /*
        while(ahorrado<total){
            System.out.print("Introduce la cantidad de dinero para ahorrar: ");
            ahorrado += sc.nextInt();
        }
        System.out.println("Ya has llegado al objetivo, ¡Enhorabuena!");
        */
        
        // Mimo ejemplo de la hucha con el bucle do while
        do{
           System.out.print("Introduce la cantidad de dinero para ahorrar: ");
           ahorrado += sc.nextInt(); 
        }while(ahorrado<total);
        
        System.out.println("Ya has llegado al objetivo, ¡Enhorabuena!");
    }
}
