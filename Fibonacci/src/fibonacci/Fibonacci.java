
package fibonacci;
import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {
        int fibonacci; 
        int fibo=15;
        // TODO code application logic hereFibonacci objfibo = new  Fibonacci ();
        Fibonacci objfibo = new Fibonacci();
        System.out.println("Introduce el numero Fibonacci 10 " );
       
        
        
        System.out.println("El numeor fibonacci es:" );
        System.out.println(objfibo.fibonacciRdecursivo(fibo));
    }
    
    public int fibonacciRdecursivo (int n) {
        
    
    if (n==1 || n ==2) {
    
    return 1;
            
            } else{
    
    
    return fibonacciRdecursivo (n-1) + fibonacciRdecursivo(n-2);
    }
    
    }
    
}
