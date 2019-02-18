
package arrivestarea;
import java.util.Scanner;


public class ArrivesTarea {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int tamaño = 0;
        int counter = 0 ;//contador//
        System.out.println("Ingrese el tamaño del arreglo");
        tamaño = entrada.nextInt();
        int a [] = new int [tamaño]; 
        System.out.println("El tamaño del arreglo es " +  tamaño);
     
      
      for(int i=0;i<tamaño;i++){
      
          System.out.println("Ingresa el valor " + i);
          a[i]=entrada.nextInt();
      }
      
      
      }
        
        
    }
    

