
package criollo;
import java.util.Scanner;


public class Criollo {

    
    public static void main(String[] args) {
        //realizar un proceso de suma//
        int a = 6;
        int b = 4; 
        int c;
        c = a+b; 
        System.out.println(c);
        
       // System.out.println(a+b);//
        
        estandar objeto = new estandar(6, 8); //creacion de un objeto//
        objeto.suma();
        
        estandar objeto2 = new estandar ();        
        Scanner entrada=new Scanner (System.in);
        System.out.println("Ingresa el valor de a");
        objeto2.a=entrada.nextInt(); 
        System.out.println("Ingresa el valor de B");
        objeto2.b=entrada.nextInt();
        objeto2.suma();
        
        
              
        
        
        
        
    }
    
}
