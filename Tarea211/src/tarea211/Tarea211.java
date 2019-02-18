
package tarea211;
import java.io.*;
public class Tarea211 
{
     public static BufferedReader entrada = new BufferedReader  (new InputStreamReader(System.in)); //lector de entrada// 
  public static void main(String[] args) throws IOException 
  {
// de esta manera el susrio lo podra hacer desde su interfaz// 
  int cancion; 
      System.out.println("Ingrese un numero del 1 al 5 para seleccionar la cancion deseda");
      cancion = Integer.parseInt(entrada.readLine()); 
      System.out.println("La cancion seleccionada es " + cancion);
      
      switch (cancion)
       // que sucedera para cada numero que seleccione//    
      {
          case 1:
                System.out.println("Madonna Like a Vigin");
                break;
                
          case 2:
              System.out.println("Michael Jackson Thriller");
              break;
              
          case 3:
              System.out.println("Lady GaGa Bad Romance");
              break;
              
          case 4:
              System.out.println("Katy Perry Dark Horse");
              break;
              
          case 5:
              System.out.println("PitBull International Love");
          default:
              
              System.out.println("No exixte cancion seleccionada para este numero");
              
          
      }
  
    }
    
}
