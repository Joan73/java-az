
package EjerciciosFicheros;

import java.util.Scanner;
import java.io.FileReader;

/**
 * Dado un fichero de palabras de texto llamado entrada.txt, lleva a 
 * término la visualización del mensaje de haber localizado o no la palabra 
 * introducida por el usuario, a petición del programa, dentro del fichero palabras.txt.
 * 
 * @author joanpont
 */

public class Ejercicio5 {
    
    static boolean finSecuencia = false;
    
    public static void main(String[] args) throws Exception{
        
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        FileReader entrada = new FileReader("entrada.txt");
        boolean palabraEncontrada = false;
        
        // Lectura de la palabra a buscar
        System.out.print("Introduce la palabra a buscar en el fichero: ");
        String palabra = sc.nextLine();
        
        // Buscamos la palabra en el fichero de texto
        while(!finSecuencia){
            if(palabra.equals(lecturaPalabra(entrada))){
                System.out.println("La palabra está en el fichero");
                palabraEncontrada = true;
                break;
            }
            
        }
        
        // Si no la encontramos informamos al usuario
        if(!palabraEncontrada){
            System.out.println("La palabra no está en el fichero");
        }
        
        //Cerramos el fichero
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
