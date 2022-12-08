
package lenguaje.fundamentos;

/**
 * Practicar el operador condicional ternario '?'
 * @author joanpont
 */

public class OperadorTernario {
    public static void main(String [] args){
        
        // Número mayor
        int a = 4, b = 7;
        // cond ? valorTrue:valorFalse
        int numeroMayor = (a>b) ? a:b;
        
        System.out.print("El número mayor es: ");
        System.out.println(numeroMayor);
        
        // Ejemplo de constraseñas
        String password = "aprenderJava";
        String passwordUsuario = "aprenderJava";
        
        String mensaje = password.equals(passwordUsuario) ? "CONTRASEÑA CORRECTA": "CONTRASEÑA INCORRECTA";
        System.out.println(mensaje);
    }
}