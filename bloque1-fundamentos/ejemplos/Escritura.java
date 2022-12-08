
package lenguaje.fundamentos;

import java.io.FileWriter;
import java.util.Scanner;
// import java.io.*;

/**
 * Ejemplo de escritura en un fichero. REalizaremos la escritura de los datos
 * introducidos por el usuario en consola en un fichero de texto
 * @author joanpont
 */

public class Escritura {
    
    public static void main(String[] args) throws Exception{
        
        // Declaraciones
        FileWriter fichero = new FileWriter("ejemploEscritura.txt");
        Scanner sc = new Scanner(System.in);
        
        // Mensaje de inicio
        System.out.println("INTRODUCE EL TEXTO QUE QUIERAS ALMACENAR EN UN FICHERO.");
        System.out.println("TERMINA CON UN PUNTO: '.' ");
        
        // Tratmiento del programa
        System.out.print("Introduce nueva línea: ");
        String cadena = sc.nextLine();
        
        while(true){
            if(!cadena.endsWith(".")){
                fichero.write(cadena+"\n");
                System.out.print("Introduce nueva línea: ");
                cadena = sc.nextLine();
            }else{
                fichero.write(cadena);
                break;
            }
        }
        
        // Cierre del fichero
        fichero.close();
        
    }
}
