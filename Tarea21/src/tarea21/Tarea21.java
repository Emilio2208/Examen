
package tarea21;
import java.io.*; 
public class Tarea21 
{
    public static BufferedReader entrada = new BufferedReader  (new InputStreamReader(System.in)); //lector de entrada// 
  public static void main(String[] args) throws IOException 
  
  {
  int seguro;  
      System.out.println("¿Cuantos años tiene el seguro de su automovil?"); //esto es lo que el usurio vera//
      seguro = Integer.parseInt(entrada.readLine()); 
      System.out.println("Su seguro tiene: " + seguro);
      
      if (seguro <=5) //datos con los que trabajara el software// 
      {
          System.out.println("Su automovil esta protegido contra daños");
      }
      else //sino pasa lo anterior entonces// 
      {
          System.out.println("Su seguro ya vencio, favor de reactivar");
      }
    }
    
}
