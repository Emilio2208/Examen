
package imcevi;
import java.util.Scanner;

public class IMCevi {


    public static void main(String[] args) {
        datos evi3 = new datos ();
        Scanner entrada=new Scanner (System.in);
        System.out.println("Introduce el Peso");
        evi3.p=entrada.nextDouble();
        System.out.println("Introdusca la altura ");
        evi3.a=entrada.nextDouble();
        System.out.println("Tu IMC ES:");evi3.imc1();
        System.out.println("Por debajo de 18.5-Por debajo del peso");
        System.out.println("18.5 a 24.9-Saludable");
        System.out.println("25.0 a 29.9-Con sobrepeso");
        System.out.println("30.0 a 39.9-Obeso");
        System.out.println("Más de 40-Obesidad extrema o de alto riesgo");
        
        
        
 



}
}
b