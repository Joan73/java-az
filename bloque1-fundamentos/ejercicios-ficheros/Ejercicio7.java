
package EjerciciosFicheros;

import java.io.FileReader;

/**
 * Dado un fichero de texto, de nombre nombres.txt, en el que cada linea esta 
 * constituida por un nombre y un apellido terminado en '.'. El programa debe 
 * visualizar en cada linea el nombre y apellido precedidos por los literales nombre: 
 * y apellido: respectivamente.
 * 
 * @author joanpont
 */

public class Ejercicio7 {
    
    static boolean finSecuencia = false;
    
    public static void main(String[] args) throws Exception{
        
        // Declaraciones
        FileReader entrada = new FileReader("nombres.txt");
        int contadorPalabras = 0;
        
        // Tratamiento del problema
        while(!finSecuencia){
            
            // Leemos una palabra del fichero
            String palabraPuntero = lecturaPalabra(entrada);
            
            // Imprimimos la palabra según sea un nombre o un apellido
            if(palabraPuntero.length()!=0){
                if(contadorPalabras %2 == 0){
                    System.out.print("Nombre: "+palabraPuntero+" ");
                }else{
                    System.out.print("Apellidos: "+ palabraPuntero+"\n");
                } 
            }
            
            contadorPalabras++;
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
