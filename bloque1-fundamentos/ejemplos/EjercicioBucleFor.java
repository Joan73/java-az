
package lenguaje.fundamentos;

/**
 * Ejemplo de ejercicio con bucles anidados
 * @author joanpont
 */

public class EjercicioBucleFor {
    
    public static void main(String[] args){
        
        // Ejercicio: Cálculo de la suma de los 10 primeros números factoriales, empezando por el número 1.
        // n! = n*(n-1)*(n-2)*(n-3)*...*2*1
        // 5! = 5*4*3*2*1
        // Queremos obtener: 1!+2!+3!+...+10!
        
        int suma = 0;
        
        for(int i = 1; i<=10; i++){
            int factorial = 1;
            
            for(int j = 2; j<=i; j++){
                factorial*=j;
                // factorial = factorial*j;
            }
            suma += factorial;
            // suma = suma+factorial;
        }
        
        System.out.println("El resultado de la suma de los 10 primeros números factoriales es: "+suma);
        
    }
}
