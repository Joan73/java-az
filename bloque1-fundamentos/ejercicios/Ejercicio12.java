
package Ejercicios;

import java.util.Scanner;

/**
 * Teniendo los nombres de 10 estudiantes e introduciendo la nota final de cada 
 * uno de ellos, visualiza el porcentaje de aprobados.
 * @author joanpont
 */

public class Ejercicio12 {
    
    public static void main(String [] args){
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        String  [] estudiantes={"Juan Gabriel Gomila",
                            "María Santos",
                            "Joan Pont",
                            "Ricardo Alberich",
                            "Arnau Mir",
                            "Lorenzo Valverde",
                            "Esperança Lopez Bermejo",
                            "Antoni Gelabert Pons",
                            "Lara Minguez Patiño",
                            "Mercedes Barcelona Pons"};
        
        double notas [] = new double[estudiantes.length];
        int aprobados = 0;
        
        // Lectura de notas
        for(int i = 0; i< estudiantes.length; i++){
            System.out.print("Introduce la nota del estudiante "+estudiantes[i]+ ": ");
            notas[i] = sc.nextDouble();
        }
        
        // Relación de aprobados
        for(double nota: notas){
            if(nota>=5) aprobados ++;
        }
        double porcentaje = (double) 100*aprobados/estudiantes.length;
        
        System.out.println("Ha aprobado el "+porcentaje+" % de la clase");
        
    }
}
