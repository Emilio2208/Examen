
package tarea.pkg4;
import java.util.Scanner; 



public class Tarea4 {

    
    public static void main(String[] args) {
        
        int a = 5;
        int b = 7;
        int c = 9;
        double x = 89; 
        double r;
        r= a * (Math.pow(x, 2));
        
        
        trinomio objeto2 = new trinomio ();        
        Scanner entrada=new Scanner (System.in);
        System.out.println("Ingresa el valor de a");
        objeto2.a=entrada.nextInt(); 
        System.out.println("Ingresa el valor de b");
        objeto2.b=entrada.nextInt();
        System.out.println("Ingresa el valor de c");
        objeto2.c=entrada.nextInt(); 
        System.out.println("Ingresa el valor de x");
        objeto2.x=entrada.nextInt();
        objeto2.trinomioop();
        
        
    }
    
}
