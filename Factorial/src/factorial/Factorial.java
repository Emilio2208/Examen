package factorial;
import java.util.Scanner;
/**
 * @author emilio
 */
public class Factorial {

    public static void main(String[] args) {
        int numero;
        Factorial object1 =  new Factorial();
         Scanner entrada = new Scanner(System.in);
         
        System.out.println("Numero entero que se convertira a factorial:");
        numero = (int) entrada.nextDouble();
        System.out.println(object1.NumeroFactorial(numero));
    }
    //Metodo de manera recursiva
    public double NumeroFactorial (double numero){
        if (numero < 0) {
            return 0;
        } else {
            if (numero == 0){
                return 1;
            } else {
                
                return numero * NumeroFactorial(numero-1);
                
            }
        }
        }
    }
