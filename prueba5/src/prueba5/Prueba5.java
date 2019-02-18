
package prueba5;

import java.io.*; /*libreria */

public class Prueba5 

{
    
    public static BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in)); /*lector de entrada, va arecibir lo que el usuario ponga con el teclado*/
            public static void main(String[] args) throws IOException 
            {
                    int seguro;
                    System.out.println("¿Cuantos años tiene su seguro de su automovil?");
                    seguro = Integer.parseInt(entrada.readLine());
                    System.out.println("El timepo que lleva vigente el seguro de su automovil es: " + seguro);
    if (seguro <=5)
    {
        System.out.println("Su automovil esta protegido");
    }
    else
    { 
        System.out.println("Su automovil no tiene el seguro vigente");
        
    }
    
    }
       
}
