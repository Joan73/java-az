
package EjerciciosFicheros;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * Dado un fichero, de nombre entrada.txt, lleva a cabo la escritura de todos 
 * los caracteres vocales contenidos en dicho fichero en un fichero de nombre 
 * vocales.txt, y la escritura de todos los caracteres consonantes en un fichero 
 * de nombre consonantes.txt.
 * 
 * @author joanpont
 */

public class Ejercicio2 {
    
    public static void main(String[] args) throws Exception{
        
        // Declaraciones
        final int FINAL_SECUENCIA = -1;
        FileReader entrada = new FileReader("entrada.txt");
        FileWriter vocales = new  FileWriter("vocales.txt");
        FileWriter consonantes = new FileWriter("consonantes.txt");
        
        //Lectura del primer caracter
        int codigo = entrada.read();
        
        // Escribimos las vocales en el fichero de vocales y las consonantes en el fichero de consonantes
        while(codigo != FINAL_SECUENCIA){
            char puntero = (char) codigo;
            if(puntero == 'a' || puntero == 'e' || puntero == 'i' || puntero == 'o' ||
               puntero == 'u'){
                vocales.write(puntero);
            }else if(puntero != ' ' && puntero != '.' && puntero != ':' && puntero != ',' &&
                    puntero != ';' && puntero != '¿' && puntero!= '?' && puntero != '¡' && 
                    puntero != '!' && puntero != '\n' ){
                consonantes.write(puntero);
            }
            codigo = entrada.read();
        }
        
        // Cierre de los ficheros
        entrada.close();
        vocales.close();
        consonantes.close();
    }
}
