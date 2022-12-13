
package EjerciciosFicheros;

import java.io.FileWriter;
import java.io.FileReader;

/**
 * Dado un fichero de texto, entrada.txt, copia su contenido en un fichero 
 * de nombre salida.txt
 * 
 * @author joanpont
 */

public class Ejercicio1 {
    
    public static void main(String [] args) throws Exception{
        
        // Declaraciones
        final int FINAL_SECUENCIA = -1;
        FileReader entrada= new FileReader("entrada.txt");
        FileWriter salida = new FileWriter("salida.txt");
        
        // Leemos el primer carácter
        int codigo = entrada.read();
        
        // Escribimos cada carácter en el fichero de salida mientras no terminemos 
        // de leer el fichero de entrada
        while(codigo!=FINAL_SECUENCIA){
            char puntero = (char) codigo;
            salida.write(puntero);
            codigo = entrada.read();
        }
        
        // Cerramos los ficheros de entrada y salida
        entrada.close();
        salida.close();
    }
}
