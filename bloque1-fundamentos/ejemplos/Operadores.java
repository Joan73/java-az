
package lenguaje.fundamentos;

/**
 * Ejemplos de operadores
 * @author joanpont
 */
import java.util.Scanner;
public class Operadores {
    
    public static void main(String[] args){
        
        // Operadores aritméticos
        int a = +4, b = 2, c = 5;
        float d = 7, e = 12;
        
        // Suma de dos números enteros
        int suma = a+b;
        System.out.print("La suma de 4 y 2 vale: ");
        System.out.println(suma);
        
        // Resta de dos números enteros
        int resta = c-b;
        System.out.print("La resta de 5 y 2 es: ");
        System.out.println(resta);
        
        // Multipicación de dos número enteros
        int multiplicacion = a*c;
        System.out.print("La multiplicación de 4 y 5 vale: ");
        System.out.println(multiplicacion);
        
        // División de números enteros
        int divisionEntera = c/b;
        System.out.print("La división entera de 5 entre 2 es: ");
        System.out.println(divisionEntera);
        
        // División real de números enteros
        float divisionReal = e/d;
        System.out.print("La división real de 12 y 7 es de : ");
        System.out.println(divisionReal);
        
        // Módulo de dos números enteros
        int modulo = c%b;
        System.out.print("El módulo de la división de 5 entre 2 es de : ");
        System.out.println(modulo);
        
        // Operadores aritméticos incrementales 
        a++;
        // Sería equivalente a la siguiente sentencia: a = a+1;
        a++;
        ++a;
        System.out.print("El valor de la variable a tras incrementarlos tres veces vale: ");
        System.out.println(a);
        
        // Diferenciación entre el operador post y pre incremento
        // Operador postincremento
        int variableAuxiliar = b++;
        System.out.print("El operador postincremento: ");
        System.out.println(variableAuxiliar);
        System.out.print("El valor de b es: ");
        System.out.println(b);
        
        // Operador preincremento
        int variableAuxiliar2 = ++c;
        System.out.print("El operador preincremento: ");
        System.out.println(variableAuxiliar2);
        System.out.print("El valor de c es: ");
        System.out.println(c);
        
        // Operadores relacionales
        int entero1 = 345, entero2 = 345;
        System.out.print("¿Son iguales los contenidos de las variables entero1 y entero2? ");
        System.out.println(entero1 == entero2);
        
        String cadena1 = "hola", cadena2 = "hola";
        System.out.print("¿Son iguales las cadenas cadena1 y cadena2? ");
        System.out.println(cadena1 == cadena2);
        
        String cadena3 = new String("hola");
        System.out.print("¿Son iguales las cadenas cadena1 y cadena3? ");
        System.out.println(cadena1 == cadena3);
        
        String subcadena = cadena1.substring(0,3);
        String against = "hol";
        System.out.print("¿Son iguales las cadenas subcadena y against? ");
        System.out.println(subcadena == against);
        
        // Operador relacional de desigualdad: !=
        System.out.print("¿Son distintos los contenidos de las variables entero1 y entero2? ");
        System.out.println(entero1 != entero2);
        
        // Operador relacionales >, <, >=, <=
        System.out.print("¿4>4? ");
        System.out.println(4>4);
        
        System.out.print("¿4>=4? ");
        System.out.println(4>=4);
        
        System.out.print("¿5<15? ");
        System.out.println(5<15);
        
        char caracter1 = 'a', caracter2 = 'a', caracter3 = 'b', caracter4 = 'A';
        System.out.print("¿a>b? ");
        System.out.println(caracter1>caracter3);
        
        System.out.print("¿A>a? ");
        System.out.println(caracter4>caracter1);
        
        //System.out.println(true>false);
        
        // Operadores asignación
        
        int x = 10, y = 5;
        
        // Operador de asignación += (suma y asignación)
        x+=3;
        // Es equivalente: x = x+3;
        System.out.print("La suma de 10 y 3 vale: ");
        System.out.println(x);
        
        // Operación de asignación -= (resta y asignación)
        y-=x;
        // Equivalente: y = y-x;
        System.out.print("La resta de 5 y 13 vale: ");
        System.out.println(y);
        
        // Operador de asignación *= (multiplicación y asignación)
        int z = 70, w = 10;
        z *= w;
        // Equivalente: z = z*w;
        System.out.print("La multiplicación de 70 y 10 vale: ");
        System.out.println(z);
        
        // Operador de asignación /= (división y asignación)
        w /= 2;
        // Equivalente a: w = w/2;
        System.out.print("La división de 10 entre 2 vale: ");
        System.out.println(w);
        
        // Operador de asignación %= (módulo y asingación)
        w %= 2;
        System.out.print("El residuo de la división de 5 entre 2 vale: ");
        System.out.println(w);
        
    }

}
