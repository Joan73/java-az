
package lenguaje.fundamentos;

/**
 * Practicando la sentencia switch
 * @author joanpont
 */

public class SentenciaSwitch {
    
    public static void main(String[] args){
        // Ejemplo 1. Caracteres vocales
        char caracter = 'e';
        
        switch(caracter){
            case 'a': System.out.println("Es un carácter voacl. En particual es el carácter 'a'. ");
                      break;
            case 'e': System.out.println("Es un carácter voacl. En particual es el carácter 'e'. ");
                      break;
            case 'i': System.out.println("Es un carácter voacl. En particual es el carácter 'i'. ");
                      break;
            case 'o': System.out.println("Es un carácter voacl. En particual es el carácter 'o'. ");
                      break;
            case 'u': System.out.println("Es un carácter voacl. En particual es el carácter 'u'. ");
                      break;
            default: System.out.println("No es un cácter vocal");
        }
        
        // Ejemplo 1 con la nuva sentencia switch (arrow case)
        
        char caracter2 = 'b';
        
        switch(caracter2){
            case 'a' -> System.out.println("Es un carácter voacl. En particual es el carácter 'a'. ");
            case 'e' -> System.out.println("Es un carácter voacl. En particual es el carácter 'e'. ");
            case 'i' -> System.out.println("Es un carácter voacl. En particual es el carácter 'i'. ");
            case 'o' -> System.out.println("Es un carácter voacl. En particual es el carácter 'o'. ");
            case 'u' -> System.out.println("Es un carácter voacl. En particual es el carácter 'u'. ");
            default -> System.out.println("No es un cácter vocal");
        }
        
        // Ejemplo 1. Solamente imprimimos si es un carácter vocal
        System.out.println("\n\n");
        switch(caracter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': System.out.println("Es un carácter vocal");
                      break;
            default: System.out.println("No es un carácter vocal");
        }
        
        switch(caracter2){
            case 'a', 'e', 'i', 'o', 'u'-> System.out.println("Es un carácter vocal");
            default -> System.out.println("No es un carácter vocal");
        }
        // Ejemplo 2. Imprimir las letras que tiene un cierto día de la semana
    
        String dia = "martes";
        int numeroCaracteres = 0;

        switch(dia){
            case "lunes": numeroCaracteres = 5;
                          break;
            case "martes":
            case "jueves":
            case "sabado": numeroCaracteres = 6;
                           break;
            
            case "viernes": numeroCaracteres = 7;
                            break;
            case "miercoles": numeroCaracteres = 9;
                              break;
            
            default: numeroCaracteres = 0;
                     System.out.println("Día incorrecto");
        }
        
        System.out.println("\n\n");
        System.out.println("El día "+ dia+ " tiene "+numeroCaracteres+ " caracteres");
        
        // Mismo ejemplo 2 pero con la nueva sentencia switch (arrow case)
        String dia2 = "miercoles";
        switch(dia2){
            case "lunes" -> numeroCaracteres = 5;
            case "martes", "jueves", "sabado" -> numeroCaracteres = 6;
            case "viernes" -> numeroCaracteres = 7;
            case "miercoles" -> numeroCaracteres = 9;
            default -> {numeroCaracteres = 0;
                        System.out.println("No es un día válido");}
        }
        System.out.println("El día "+ dia+ " tiene "+numeroCaracteres+ " caracteres");
        
        
    }
    
}
