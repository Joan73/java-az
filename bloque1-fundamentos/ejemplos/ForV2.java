
package lenguaje.fundamentos;

/**
 * Ejemplos del bucle for
 * @author joanpont
 */

public class ForV2 {
    
    public static void main(String[] args){
        
        // Ejemplo 1. Iterar los elementos de un array en orden inverso
        char vocales [] = "aeiou".toCharArray();
        
        for(int i = vocales.length-1; i>=0; i--){
            System.out.println(vocales[i]);
        }
        
        // Ejemplo 2. Iterar de dos en dos en orden inverso los elementos de un array
        
        char abecedario [] = "abcdefghijklmnñopqrstuvwxyz".toCharArray();
        System.out.print("\n\n");
        for(int i = abecedario.length-1; i>=0; i = i-2){
            System.out.print(abecedario[i]);
        }
        
    }
}
