/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.io.*; /*libreria */

public class Repaso 

{
    
    public static BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in)); /*lector de entrada, va arecibir lo que el usuario ponga con el teclado*/
            public static void main(String[] args) throws IOException 
            {
                    int edad;
                    System.out.println("Edad ?");
                    edad = Integer.parseInt(entrada.readLine());
                    System.out.println("Tu edad es " + edad);
    if (edad >=18)
    {
        System.out.println("Puedes bailar");
    }
    else
    { 
        System.out.println("No puedes bailar");
        
    }
    
    }
       
}
