
package lenguaje.fundamentos;

/**
 * Ejemplos de funciones que pueden tomar una cantidad variable de parámetros (varargs)
 * @author joanpont
 */

public class VarArgs {
    
    public static void main(String[] args){
        // Ejemplo ilustrativo
        parametrosVariables(10,20,30);
        parametrosVariables(3);
        parametrosVariables(1,2,3,4,5,6,7,8,9);
        
        // Ejemplo 2: Suma 
        System.out.println("Suma: "+suma(4,6,9,10));
        System.out.println("Suma2: "+suma(1,2,3));
        
        // Ejemplo de conteo de caracteres dentro de un conjunto de palabras
        System.out.println("¿Cuántas palabras contienen el carácter 'a'? "+Conteo('a',"hola", "adios", "curso"));
    }
    
    public static void parametrosVariables(int ... enteros){
        System.out.println("Número de argumentos: "+enteros.length);
        
        for(int i=0; i<enteros.length; i++){
            System.out.println(" arg "+i+": "+enteros[i]);
        }
    }
    
    public static int suma(int ... numeros){
        int suma = 0;
        for(int num: numeros) suma += num;
        return suma;
        
    }
    
    public static int Conteo(char caracter, String ... cadenas){
        int num = 0;
        
        for(String cad: cadenas){
            char [] array = cad.toCharArray();
            for(char car: array){
                if(caracter == car){
                    num++;
                    break;
                }
            }
        }
        
        return num;
    }
}
