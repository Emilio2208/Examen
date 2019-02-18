
package arrives;


public class Arrives {

    
    public static void main(String[] args) {
        int x[]; 
        x = new int[5];
        
        x[0] = 8; 
        x[1] = 7;
        x[2] = 45;
        x[3] = 877;
        x[4] = 23;
        //ciclo for//
        for (int r=0;r<x.length;r++) //length te da el tamaño automatico del areglo//
        
     {
         System.out.println("Arreglo en indice:"+r+" es igual a:"+ x[r]);   
     }
    
    
}
}