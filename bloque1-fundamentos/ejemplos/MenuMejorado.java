
package lenguaje.fundamentos;

import java.util.Scanner;

/**
 * Ejemplo de menú donde el usuario selecciona cuando terminar la ejecución del 
 * programa
 * @author joanpont
 */

public class MenuMejorado {
    
    public static void main(String[] args){
        
        // ejemplo de menú
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        
        while(flag){
            System.out.println("       EJEMPLO DE MENÚ        ");
            System.out.println("1. OPCIÓN 1");
            System.out.println("2. OPCIÓN 2");
            System.out.println("3. OPCIÓN 3");
            System.out.println("4. OPCIÓN SALIDA");
            System.out.print("INTRODUCE LA OPCIÓN DESEADA: ");
            
            int opcion = sc.nextInt();
            
            switch(opcion){
                case 1 -> System.out.println("HAS ELEGIDO LA OPCIÓN 1");
                case 2 -> System.out.println("HAS ELEGIDO LA OPCIÓN 2");
                case 3 -> System.out.println("HAS ELEGIDO LA OPCIÓN 3");
                case 4 -> {System.out.println("HAS ELEGIDO LA OPCIÓN DE SALIDA. HASTA LA PRÓXIMA ");
                            flag = false;}
                default -> System.out.println("OPCIÓN NO VÁLIDA");
            }
            
        }
        
        /*
        //La condición del bucle while también podría representarse del siguiente modo, aunque es más tedioso
        while(flag == true){
            System.out.println("       EJEMPLO DE MENÚ        ");
            System.out.println("1. OPCIÓN 1");
            System.out.println("2. OPCIÓN 2");
            System.out.println("3. OPCIÓN 3");
            System.out.println("4. OPCIÓN SALIDA");
            System.out.print("INTRODUCE LA OPCIÓN DESEADA: ");
            
            int opcion = sc.nextInt();
            
            switch(opcion){
                case 1 -> System.out.println("HAS ELEGIDO LA OPCIÓN 1");
                case 2 -> System.out.println("HAS ELEGIDO LA OPCIÓN 2");
                case 3 -> System.out.println("HAS ELEGIDO LA OPCIÓN 3");
                case 4 -> {System.out.println("HAS ELEGIDO LA OPCIÓN DE SALIDA. HASTA LA PRÓXIMA ");
                            flag = false;}
                default -> System.out.println("OPCIÓN NO VÁLIDA");
            }
            
        }*/
        
    }
}
