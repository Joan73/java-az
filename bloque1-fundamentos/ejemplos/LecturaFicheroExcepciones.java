
package lenguaje.fundamentos;

// Imports del programa
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Ejemplo de lectura de un fichero de texto tratando las excepciones pertienetes 
 * de entrada y salida
 * @author joanpont
 */

public class LecturaFicheroExcepciones {
    
    public static void main(String[] args){
        // Declaraciones
        FileReader fichero;
        
        // Intentar abrir el fichero
        while(true){
            try{
                fichero = apertura();
                break;
            }catch(FileNotFoundException exec){
                System.out.println("El fichero no existe.");
            }
        }
        
        // Lectura 
        lectura(fichero);
    }
    
    public static FileReader apertura() throws FileNotFoundException{
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        // Pedimos al usuario que introduzca el nombre del fichero
        System.out.print("Introduce el nombre del fichero: ");
        String nombre = sc.nextLine();
        FileReader fichero = new FileReader(nombre);
        return fichero;
    }
    
    public static void lectura(FileReader fichero){
        
        // Lectura
        try{
            int codigo = fichero.read();
            while(codigo != -1){
                System.out.print((char) codigo);
                codigo = fichero.read();
            }
        }catch(IOException exec){
            System.out.println("Error leyendo el fichero: "+exec.getMessage());
        }finally{
            try{
                fichero.close();
            }catch(IOException exec){
                System.out.println("Error al cerrar el fichero: "+exec.getMessage());
            }
        }
        
    }
}
