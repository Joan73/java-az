
package EjerciciosFicheros;

import java.io.FileWriter;
import java.io.FileReader;

/**
 * Dado un fichero de texto, palabras.txt, graba las palabras de éste de la 
 * siguiente forma: todas las palabras de 1 carácter en un fichero de nombre 
 * palabras1.txt, las de dos en un fichero palabras2.txt, ..., y las palabras de 15  
 * caracteres en un fichero palabras15.txt.
 * @author joanpont
 */

public class Ejercicio6 {
    
    static boolean finSecuencia = false;
    
    public static void main(String[] args) throws Exception{
        
        // Declaraciones
        FileReader entrada = new FileReader("palabras.txt");
        FileWriter [] salidas = new FileWriter[15];
        
        // Inicializar ficheros de salida
        for(int i = 0; i<salidas.length; i++){
            String nombreFichero = "palabras"+(i+1)+".txt";
            salidas[i] = new FileWriter(nombreFichero);
        }
        
        // Tratamiento del problema
        while(!finSecuencia){
            // Leemos la palabra
            String palabra = lecturaPalabra(entrada);
            int longitud = palabra.length();
            
            // Escribimos la palabra en el fichero correpondiente
            if(longitud!=0){
                salidas[longitud-1].write(palabra+" ");
            } 
        }
        
        // Cerramos los ficheros
        entrada.close();
        for (FileWriter salida: salidas) {
            salida.close();
        }
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
