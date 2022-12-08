
package lenguaje.fundamentos;

/**
 * Practicar los operadores lógicos
 * @author joanpont
 */
public class OperadoresLogicos {
    
    public static void main(String [] args){
        
        // Divisibilidad entre 4
        // Un número es divisible entre 4 si sus dos últimas cifras son 0 o son un múltiplo de 4
        
        int numero = 100;
        int ultimasDosCifras = numero%100;
        boolean divisionEntre4 = (ultimasDosCifras == 0) || (ultimasDosCifras%4 == 0);
        System.out.print("¿Es 100 divisible entre 4? ");
        System.out.println(divisionEntre4);
        
        // Ejemplo de año bisisesto
        // Un año es bisiesto si es divisible por 4 y no por 100 o si es divisible por 400
        
        int año = 1972;
        boolean bisiesto = ((año%4 == 0)&&(año%100 != 0)) || (año%400 == 0);
        System.out.print("¿Es el año 1972 es bisiesto? ");
        System.out.println(bisiesto);
        
        // Ejemplo número par mayor a 10
        // Un número es par si es divisible entre 2
        int numero2 = 18;
        boolean parMayorDiez = (numero2%2 == 0) && (numero2>10);
        System.out.print("¿Es el número 8 un número par mayor a 10? ");
        System.out.println(parMayorDiez);
        
        // Carácter vocal
        // Un carácter es vocal cuando es uno de los siguientes: a, e, i, o, u.
        char caracter = 'a';
        boolean esVocal = (caracter == 'a') || (caracter == 'e') || (caracter == 'i') || 
                (caracter == 'o') || (caracter == 'u');
        
        System.out.print("¿Es 'a' un carácter vocal? ");
        System.out.println(esVocal);
    }
}
