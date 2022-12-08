
package lenguaje.fundamentos;

/**
 * práctica de la clase String
 * @author joanpont
 */
public class Cadenas {
    
    public static void main(String [] args){
        
        // Declarar un string en java. OPCIÓN 1
        String cadena = new String("hola");
        System.out.println(cadena);
        
        // Declarar un string en java. OPCIÓN 2
        String nuevaCadena = "hola";
        System.out.println(nuevaCadena);
        
        // Declarar un string vacío
        String stringVacio = "";
        System.out.println(stringVacio);
        
        // MÉTODOS MÁS UTILIZADOS DE LA CLASE STRING
        
        // Longitud de una cadena
        String texto = "Cadena";
        System.out.print("La longitud de la cadea 'Cadena' es de: ");
        System.out.println(texto.length());
        
        // Índice de un carácter
        System.out.print("Índice del carácter 'a': ");
        System.out.println(texto.indexOf("a"));
        
        // Último carácter 
        System.out.print("Último índice del carácter 'a': ");
        System.out.println(texto.lastIndexOf("a"));
        
        // Carácter ubicado en el indice indicado
        System.out.print("Caracter ubicado en la 3 índice: ");
        System.out.println(texto.charAt(3));
        
        // Convertir todo el string a mayúscula
        System.out.print("La cadena de texto 'Cadena' en mayúscula es : ");
        System.out.println(texto.toUpperCase());
        
        // Convertir todo el string a minúscula
        System.out.print("La cadena texto 'Cadena' en minúscula es: ");
        System.out.println(texto.toLowerCase());
        
        // Obtener un subtring
        System.out.print("Sucadena 'ade': ");
        System.out.println(texto.substring(1,4));
        
        // Comprobar si una cadena empieza por una determinada expresión
        System.out.print("¿Empieza la cadena por 'Cad'? ");
        System.out.println(texto.startsWith("Cad"));
        
        // Comprobar si una cadena termina por una determinada expresión
        System.out.print("¿?La cadena termina en 'ena'? ");
        System.out.println(texto.endsWith("ena"));
        
        // Sustituir todas las ocurrencias del carácter viejo por el carácter nuevo
        System.out.print("Suistituir el carácter 'a' por el carácter 'e' : ");
        System.out.println(texto.replace('a', 'e'));
        
        // Sustituir todas las ocurrencias de una expresión vieja por una expresión nueva
        System.out.print("Sustituir la cadena 'Cad' por 'Fa' " );
        System.out.println(texto.replaceAll("Cad", "Fa"));
        
        // Concatener dos texto
        System.out.print("Concatenar a la cadena 'Cadena' con la cadena ' de texto' ");
        System.out.println(texto.concat(" de texto"));
        
        // Comparar dos strings
        System.out.print("¿ Son las cadenas 'Cadena' y 'cadena' iguales? ");
        System.out.println(texto.equals("cadena"));
        
        // Comaprar dos strings sin tener en cuenta ni mayúsculas ni minúsculas
        System.out.print("¿Son iguales las cadenas 'Cadena' y 'cAdEnA' ?");
        System.out.println(texto.equalsIgnoreCase("cAdEnA"));
        
        // Eliminar espacios del inicio y final de la cadena
        String textoNuevo = "   Cadena de texto  ";
        System.out.print("Eliminar espacios en blanco del inicio y el final: ");
        System.out.println(textoNuevo.trim());
        
        // Proporcionar la representación a string de un entero
        int num = 7890;
        System.out.print("Representación a string de el número 7890: ");
        String representacionNumero =  String.valueOf(num);
        System.out.println(representacionNumero);
    }
}
