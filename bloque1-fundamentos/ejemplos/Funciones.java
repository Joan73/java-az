
package lenguaje.fundamentos;

import java.util.Scanner;

/**
 * Ejemplo de una calculadora.
 * @author joanpont
 */

public class Funciones {
    
    public static void main(String[] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        
        while(flag){
            
            // Menú
            menu();
            int opcion = sc.nextInt();
            
            switch(opcion){
                case 1 -> { int sum = suma(sc);
                            System.out.println("EL RESULTADO DE LA SUMA ES: "+sum);}
                case 2 -> {int mult = multiplicacion(sc);
                            System.out.println("EL RESULTADO DE LA MULTIPLICACIÓN ES: "+mult);}
                case 3 -> {String div = division(sc);
                            System.out.println("EL RESULTADO DE LA SUMA ES: "+div);}
                case 4 -> { int [] pares = numerosPares(sc);
                            System.out.print("LOS NÚMEROS PARES SON: ");
                            for(int par: pares){
                                System.out.print(par+ " ");
                            }
                            System.out.println();
                            }
                case 5 -> { borrarPantalla();
                            System.out.println(" HAS ESCOGIDO LA OPCIÓN SALIR. HASTALUEGO! ");
                            flag = false;}
                default -> System.out.println(" HAS ESCOGIDO UNA OPCIÓN NO VÁLIDA ");
            }
        }
        
    }
    
    public static void menu(){
        System.out.println("     CALCULADORA        ");
        System.out.println("1. SUMA");
        System.out.println("2. MULTIPLICACIÓN");
        System.out.println("3. DIVISIÓN");
        System.out.println("4. NÚMEROS PARES");
        System.out.println("5. SALIDA");
        System.out.print("INTRODUCE LA OPCIÓN DESEADA: ");
    }
    
    public static void borrarPantalla(){
        System.out.println("\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n");
    }
    
    private static int suma(Scanner sc){
        
        // Declaraciones
        int longitud, suma = 0;
        int numeros [];
        
        // Lectura
        System.out.print("¿Cuántos números quires sumar?");
        longitud = sc.nextInt();
        numeros = new int[longitud];
        
        // Introducción de los números a sumar
        for(int i = 0; i<numeros.length; i++){
            System.out.print("Introduce el número "+ i + ": ");
            numeros[i] = sc.nextInt();
        }
        
        // Suma de los números
        for(int num: numeros){
            suma += num;
            // suma = suma + num;
        }
        
        // Devolver el resultado
        return suma;
    }
    
    private static int multiplicacion(Scanner sc){
        
        // Declaraciones
        int longitud, multiplicacion = 1;
        int numeros [];
        
        // Lectura de los datos
        System.out.print(" ¿Cuántos números quieres multiplicar? ");
        longitud = sc.nextInt();
        numeros = new int[longitud];
                
        for(int i =  0; i<longitud; i++){
            System.out.print("Introduce el " + (i+1) +" número: ");
            numeros[i] = sc.nextInt();
        }
        
        // Multiplicación de los números introducidos por el usuario
        for(int num: numeros){
            multiplicacion *= num;
            // multiplicacion = multiplicacion*num;
        }
        
        // Devolver el resultado
        return multiplicacion;
    }
    
    private static String division(Scanner sc){
        
        // Declaraciones
        int a,b, division, modulo;
        String mensaje;
        
        // Lectura de los datos
        System.out.print(" Introduce el dividendo: ");
        a = sc.nextInt();
        System.out.print("Introduce el divisor: ");
        b = sc.nextInt();
        
        // Cómputo de la división entera
        division = a/b;
        modulo = a%b;
        
        // Construimos y devolvemos el resultado
        mensaje = "El cociente vale "+ division+ " y el residuo vale: "+modulo;
        return mensaje;
    }
    
    private static int [] numerosPares(Scanner sc){
        
        // Declaraciones
        int longitud, numeroPares = 0;
        int numeros[];
        
        // Lectura de datos
        System.out.print("¿Cuántos números quieres introducir? ");
        longitud = sc.nextInt();
        numeros = new int[longitud];
        
        for(int i = 0; i<longitud; i++){
            System.out.print("Introduce el número: ");
            numeros[i] = sc.nextInt();
        }
        
        // Cantidad de números pares de la secuencia
        for(int num: numeros){
            if(num%2 == 0){
                numeroPares++;
                // numeroPares = numeroPares+1;
                // numeroPares += 1;
            }
        }
        
        // Solucion
        int output [] = new int[numeroPares];
        int indice = 0;
        for(int num:numeros){
            if(num%2 == 0){
                output[indice] = num;
                indice++;
            }
            
        }
        /*
        // ESTE PROCEDIMIENTO ES INCORRECTO: 
        
        for(int i = 0; i<numeros.length; i++){
            
            if(numeros[i]%2 ==0){
                output[i] = numeros[i];
             }
        }
        */
        
        return output;
    }
    
}