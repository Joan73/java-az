
package lenguaje.fundamentos;

/**
 * Ejemplo ilustrativo del tratamiento y propagación de excepciones
 * @author joanpont
 */

public class PropagacionExcepciones {
    
    public static void main(String[] args){
        System.out.println("MÉTODO MAIN");
        metodo1();
        System.out.println("FIN MAIN");
    }
    
    public static void metodo1(){
        System.out.println("MÉTODO 1");
        try{
            metodo2();
        }catch(ArithmeticException exec){
            System.out.println();
            System.out.println("MENSAJE DE ERROR: "+exec.getMessage());
            System.out.println();
            System.out.println("ÁRBOL STACK: ");
            exec.printStackTrace();
        }
        
        System.out.println("FIN MÉTODO 1");
    }
    
    public static void metodo2() throws ArithmeticException{
        System.out.println("MÉTODO 2");
        metodo3();
        System.out.println("FIN MÉTODO 2");
    }
    
    public static void metodo3() throws ArithmeticException{
        System.out.println("MÉTODO 3");
        metodo4();
        System.out.println("FIN MÉTODO 3");
    }
    
    public static void metodo4() throws ArithmeticException{
        System.out.println("EMPIEZA EL MÉTODO 4");
        System.out.println("FORZAMOS A QUE OCURRA UNA EXCEPCIÓN");
        int valor = 10/0;
        System.out.println("FIN MÉTODO 4");
    }
    
}
