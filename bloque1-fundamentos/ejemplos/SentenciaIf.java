
package lenguaje.fundamentos;
import java.util.Scanner;

/**
 * Ejemplos de práctica de las bifurcaciones if, if-else, if-else if
 * @author joanpont
 */
public class SentenciaIf {
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        // Comprobar contraseñas
        String password = "aprendeJava123";
        System.out.print("Introduce contraseña: ");
        String contraseñaIntroducida = sc.next();
        
        if(password.equals(contraseñaIntroducida)){
            System.out.println("CONTRASEÑA CORRECTA");
        } else{
            System.out.println("CONTRASEÑA INCORRECTA");
        }
        
        // Valor del valor absoluto
        System.out.print("Introduce un número entero: ");
        int numeroIntroducido = sc.nextInt(), valorAbsoluto;
        
        if(numeroIntroducido>=0){
            valorAbsoluto = numeroIntroducido;
        }else{
            valorAbsoluto = -numeroIntroducido;
        }
        System.out.println("El valor absoluto del número "+numeroIntroducido+" es: "  +valorAbsoluto);
        
        /*
        //MANERA ALTERNATIVA PARA CALCULAR EL VALOR ABSOLUTO
        System.out.print("Introduce un número entero: ");
        int numeroIntroducido = sc.nextInt();
        
        
        if(numeroIntroducido<0){
            numeroIntroducido = -numeroIntroducido;
        }
        
        System.out.println("El valor abolsuto es: "+numeroIntroducido);
        */
        
        // Días de la semana
        System.out.print("Introduce el día: ");
        String dia = sc.next();
        
        if(dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes") || 
                dia.equalsIgnoreCase("miercoles") || dia.equalsIgnoreCase("jueves") ||
                dia.equalsIgnoreCase("viernes")){
            System.out.println("Es un día laboral. Ánimo ya queda menos para el fin de semana");
        }else if(dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("domingo")){
            System.out.println("¡Estamos a fin de semana :) !");
        }else{
            System.out.println("Día introducido es incorrecto");
        }
        
        // Alerta de temperatura
        int temperatura = 3;
        if(temperatura>15){
            if(temperatura >35) System.out.println("Alerta por temperaturas extremadamente altas");
            else if (temperatura >25) System.out.println("Temperatura de verna");
            else System.out.println("Temperatura ambiente ideal");
        }else{
            if(temperatura < -5) System.out.println("Alerta por temperatura extremadamente bajas");
            else if (temperatura <5) System.out.println("Alerta por temperatura baja");
            else System.out.println("Temperatura de invierno");
        }
    }
}
