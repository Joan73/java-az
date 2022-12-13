
package EjerciciosFicheros;

import java.io.FileReader;

/**
 * Dado un fichero de texto visualiza todas las palabras contenidas en él. 
 * Programa una función que lea secuencialmente las palabras del fichero.
 * Es decir, en cada invocación se leerá una palabra del fichero. 
 * Usa esta función para resolver el problema. 
 * 
 * PISTA: Se usará la función en el método main. Y se debe controlar cuando 
 * hemos terminado de leer el fichero. Por tanto, necesitaremos una variable 
 * que debe ser accesible por el método main y la función que programarás para 
 * controlar cuando hemos terminado de leer el fichero. Con este fin, se puede 
 * declarar una variable fuera de cualquier función o método (pero dentro de la 
 * clase Java) para que sea accesible para todas las funciones o métodos. Para 
 * ello simplemente se declara una variable con el modificador static. Por 
 * ejemplo: static int test = 0; es una declaración de una variable que es 
 * accesible desde cualquier método o función (la declaración debe estar fuera 
 * de cualquier método o función y dentro de la clase Java).
 * 
 * @author joanpont
 */

public class Ejercicio3 {
    
    static boolean finSecuencia = false;
    
    public static void main(String[] args) throws Exception{
        
        // Declaraciones
        FileReader entrada = new FileReader("entrada.txt");
        
        // Lectura de palabras
        while(!finSecuencia){
            String palabra = lecturaPalabra(entrada);
            
            // Imprimimos la palabra
            if(!palabra.isEmpty()){
                System.out.println(palabra);
            }
        }
        
        // Liberamos los recursos
        entrada.close();
    }
    
    public static String lecturaPalabra(FileReader fichero) throws Exception{
        
        // Declaraciones
        final int FINAL_SECUENCIA = -1;
        String palabra = "";
        boolean flag = false;
        
        // Lectura
        while(!flag){
            
            int codigo = fichero.read();
            while(codigo!=FINAL_SECUENCIA && (char)codigo!=' ' && (char)codigo != '\n'
                    && (char)codigo != ',' && (char)codigo != ';' && (char)codigo != ':'
                    && (char) codigo != '\n'){
                palabra = palabra+(char)codigo;
                codigo = fichero.read();
            }
            if (palabra.length()!=0){
                flag = true;
            }
            if(codigo == FINAL_SECUENCIA){
                flag = true;
                finSecuencia = true;
            }
        }
        return palabra;
    }
    
}
