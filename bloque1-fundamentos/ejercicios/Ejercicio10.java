
package Ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Dadas las precipitaciones de lluvia introducidas por el usuario, a petición 
 * del programa, correspondientes a los meses del último año, visualiza la 
 * media de estas precipitaciones y califica el año en función de los 
 * siguientes niveles: 
 *  - seco: menor a 100 mm, 
 *  - normal: mayor 100 mm y menor 500 mm
 *  - húmedo: mayor a 500mm 
 * Además también se calificarán los meses en función de seco, normal o húmedo
 * 
 * @author joanpont
 */

public class Ejercicio10 {
    public static void main(String[] args){
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        final int numeroMeses = 12;
        double precipitaciones [] = new double[numeroMeses]; 
        double sumaPrecipitaciones = 0, media;
        final String seco = "Seco", normal = "normal", humedo = "humedo";
        
        // Lectura de las precipitaciones
        // Comentar la siguiente línea si se quiere usar la coma como separador decimal
        sc.useLocale(Locale.ENGLISH);
        for(int i=0; i<numeroMeses; i++){
            System.out.print("Precipitaciones del mes "+(i+1)+": ");
            precipitaciones[i] = sc.nextDouble();
        }
        
        // Calculo de la media   
        for(double precip: precipitaciones) sumaPrecipitaciones += precip;
        media = sumaPrecipitaciones/numeroMeses;
        System.out.println("La media de precipitaciones es: "+media);
        
        // Calificación del año
        if(media > 500){
            System.out.println("El año es: "+humedo);
        }else if(media > 100){
            System.out.println("El año es "+normal);
        }else{
            System.out.print("El año es: "+seco);
        }
        
        // Calificación de los meses
        for(double precip: precipitaciones){
            if(precip > 500){
                System.out.println("El mes es: "+humedo);
            }else if(precip > 100){
                System.out.println("El mes es: "+normal);
            }else{
                System.out.println("El mes es: "+seco);
            }
        }
    }
}
