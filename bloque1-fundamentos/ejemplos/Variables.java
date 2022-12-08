
package lenguaje.fundamentos;

/**
 * Practicar la declaración de variables en java
 * @author joanpont
 */
public class Variables {
    
    public static void main(String[] args){
        
        // Declaramos una variable entera y la inicializamos
        int varEntera = 7;
        System.out.println(varEntera);
        
        // Declaramos una variable entera y no la inicializamos
        short varEnteraNoInicializada;
        //System.out.println(varEnteraNoInicializada);
        varEnteraNoInicializada = 314;
        System.out.println(varEnteraNoInicializada);
        
        //Declaramos otra variable entera de tipo long
        long varEnteraLarga = -9876543;
        System.out.println(varEnteraLarga);
        
        // Declaramos una variable real
        float varReal = 5.698f;
        System.out.println(varReal);
        
        // Declaramos una variable real de tipo double
        double varRealPrecisa = 179.7539832;
        System.out.println(varRealPrecisa);
        
        // Declaramos una variable de tipo carácter
        char caracter1 = 'a';
        System.out.println(caracter1);
        
        // Declaramos múltiples variables de tipo carácter
        char caracter2 = 'b', caracter3 = 'c', caracter4, caracter5 = 'd';
        System.out.println(caracter2);
        System.out.println(caracter3);
        System.out.println(caracter5);
        
        // Declaramos nuestra primera variable booleana
        boolean miPrimerBooleano = true;
        System.out.println(miPrimerBooleano);
        
        // Declaramos una constante
        final double numeroPi = 3.141592653;
        System.out.println(numeroPi);
        
    }
}
