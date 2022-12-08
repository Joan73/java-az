
package lenguaje.fundamentos;

import java.io.FileReader;
// import java.io.*;

/**
 * Ejemplo de lectura de un fichero de texto.
 * @author joanpont
 */

public class Lectura {
    
    public static void main(String[] args) throws Exception{
        
        // Declaraciones
        FileReader fichero = new FileReader("ejemploLectura.txt");
        
        // Lectura del primer carácter
        int codigo = fichero.read();
        
        while(codigo != -1){
            char caracter = (char) codigo;
            System.out.print(caracter);
            codigo = fichero.read();  
        }
        
        // Cierre del fichero
        fichero.close();
    }

}
