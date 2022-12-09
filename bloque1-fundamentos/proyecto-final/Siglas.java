
package fundamentos.lenguajejava.ficheros.proyecto;

/**
 *
 * @author joanpont
 */

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


public class Siglas {
    
    static boolean finSiglas, finFichero = false;
    
    public static void main(String[] args){
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        
        while(!flag){
            
            // Imprimir menú
            menu();
            
            //Leer opción escogida por el usuario
            int opcion = 0;
            try{
                opcion = Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException e){
                System.out.println("LA OPCIÓN DEBE SER UN NÚMERO ENTRE 1 Y 2.");
            }
            
            // Actuar según la decisión del usuario
            
            switch(opcion){
                case 0 ->{}
                case 1 -> {
                    try{
                        procesar();
                    }catch(IOException e){
                        System.out.println("ERROR DE PROCESAMIENTO: "+e.getMessage());
                    }
                }
                case 2 -> {System.out.println("HAS ESCOGIDO LA OPCIÓN DE SALIDA. HASTALUEGO.");
                           flag = true;}
                default -> System.out.println("OPCIÓN ELEGIDA INCORRECTA");
            }
                    
        }
    }
    
    public static void menu(){
        System.out.print("TRADUCCIÓN DE SIGLAS \n\n\n");
        System.out.print("ELIGE ENTRE LAS SIGUIENTES OPCIONES \n");
        System.out.print("OPCIÓN 1: PROCESAR. \n");
        System.out.print("OPCIÓN 2: SALIR. \n\n\n");
        System.out.print("INTRODUCE LA OPCIÓN ELEGIDA: ");
    }
    
    public static void procesar() throws IOException{
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        FileReader entrada;
        FileWriter salida;
        
        // Leemos y parseamos nombre del archivo
        System.out.print("INTRODUZCA EL NOMBRE DEL ARCHIVO: ");
        String nombre = sc.nextLine();
        while(verificarNombre(nombre)==false){
            System.out.println("LOS CARACTERES ',', ';', ':' Y '/' ESTÁN PROHIBIDOS Y LA EXTENSIÓN DEBE SER .TXT");
            System.out.print("INTRODUZCA EL NOMBRE DEL ARCHIVO: ");
            nombre = sc.nextLine();
        }
        String nombreFichero = obtenerNombreSinExtension(nombre);

        // Intentamos abrir el fichero
        try{
            entrada = new FileReader(nombreFichero+".txt");
        }catch(FileNotFoundException e){
            throw new FileNotFoundException("EL FICHERO "+nombreFichero+" NO ESTÁ DISPONIBLE.");
        }
        
        
        // Fichero de salida
        salida = new FileWriter(nombreFichero+"PR.txt");
        
        
        // Procesado
        while(!finFichero){
            
            // Leemos palabra
            String palabra = lecturaPalabra(entrada, false);
            
            // Comprobamos si la palabra es una sigla
            if(isSigla(palabra)){
                // Declaramos el fichero de siglas
                FileReader siglas = new FileReader("siglas.txt");
                // Leemos el fichero de siglas
                boolean encontrada = false;
                while(!finSiglas){
                    String palabraSigla = lecturaPalabra(siglas, true);
                    
                    // comprobamos si la siglas coinciden
                    if(palabraSigla.equals(palabra)){
                        encontrada = true;
                        String traduccion = lecturaCentinela(siglas,'\n');
                        salida.write(traduccion+" ");
                    }else{
                        // Leemos hasta un salto de línea
                        String drop = lecturaCentinela(siglas,'\n');
                    }
                }
                // Si no encontramos la sigla en el fichero la copiamos igual en
                // el fichero de salida
                if(!encontrada){
                    salida.write(palabra+" ");
                }
                
                // Cerramos el fichero de siglas
                siglas.close();
                finSiglas = false;
            }else{
                salida.write(palabra+" ");
            }
        }
        
        // Cerramos los ficheros
        entrada.close();
        salida.close();
        
    }
    
    public static boolean verificarNombre(String nombre){
        
        char [] partes = nombre.toCharArray();
                
        for (int i = 0; i<partes.length; i++){
            if(partes[i] == ',' || partes[i] == ';' || partes[i] == ':' || partes[i] == '/'){
                return false;
            }
            if(partes[i] == '.'){
                // Comprobamos que la extensión es txt
                if(i+3 != partes.length-1){
                    return false;
                }
                if(partes[i+1]!= 't' || partes[i+2]!= 'x' || partes[i+3]!= 't'){
                    return false;
                }
                break;
            }
        }
        return true;
    }
    
    public static String obtenerNombreSinExtension(String nombre){
        
        char[] partes = nombre.toCharArray();
        String nombreSinExtension = "";
        
        for(char caracter:partes){
            if (caracter == '.'){
                break;
            }
            nombreSinExtension = nombreSinExtension+caracter;
        }
        
        return nombreSinExtension;
    }
    
    public static String lecturaPalabra(FileReader fichero, boolean siglas) throws IOException{
        
        // Declaraciones
        final int FINAL_SECUENCIA = -1;
        String palabra = "";
        boolean flag = false;
        
        // Lectura
        while(!flag){
            
            int codigo = fichero.read();
            while(codigo!=FINAL_SECUENCIA && (char)codigo!=' ' && (char)codigo != '.' 
                  && (char)codigo != ',' && (char)codigo != ';' && (char)codigo != ':'){
                palabra = palabra+(char)codigo;
                codigo = fichero.read();
            }
            if (palabra.length()!=0){
                flag = true;
            }
            if(codigo == FINAL_SECUENCIA){
                flag = true;
                // Comprobamos qué fichero hemos terminado de procesar
                if(siglas){
                   finSiglas = true; 
                }else{
                    finFichero = true;
                }
                
            }
        }
        return palabra;
    }
    
    public static String lecturaCentinela(FileReader fichero, char centinela) throws IOException{
        
        // Declaraciones
        final int FINAL_SECUENCIA = -1;
        String traduccionSigla = "";
        // Lectura
        int codigo = fichero.read();
        while(codigo!=FINAL_SECUENCIA && (char)codigo != centinela){
            traduccionSigla = traduccionSigla+(char)codigo;
            codigo = fichero.read();
            if((char) codigo == '.'){
                codigo = fichero.read();
            }
        }
        if(codigo == FINAL_SECUENCIA){
            finSiglas = true;  
        }
        return traduccionSigla;
    }
    
    public static boolean isSigla(String palabra){
        
        char [] caracteres = palabra.toCharArray();
        char [] alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ".toCharArray();
        
        for(char caracter: caracteres){
            boolean encontrada = false;
            for(char letra: alfabeto){
                if(caracter == letra){
                    encontrada = true;
                    break;
                }
            }
            if(!encontrada){
                return false;
            }
        }
        return true;
    }
}
