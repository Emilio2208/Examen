
package evidencia;
import java.io.*; 
public class Evidencia {

    public static BufferedReader entrada = new BufferedReader  (new InputStreamReader(System.in)); 
  public static void main(String[] args) throws IOException 
  {
      //datos del cliente (atributos)//
     int edad;
     String nombre;
     String reservacion; 
      System.out.println("'''HOLYDAY INN'''");
      System.out.println("'''Since 1997'''");
         System.out.println("Introduzca el numero de reservacion");
         reservacion = entrada.readLine(); 
         System.out.println("El numero de reservacion seleccionado es: " + reservacion );
         
         
        
         switch (reservacion)
       
        {
                case "001": 
                    System.out.println("Reservacion a nombre de:*Nombre* ");
                System.out.println("Cama Matrimonial");
                System.out.println("Baño");
                System.out.println("Television");
                System.out.println("Mini Bar");
                break;
                
              case "002":
                  System.out.println("Reservacion a nombre de:*Nombre* ");
               System.out.println("Cama Matrimonial");
                System.out.println("Baño");
                System.out.println("Television");
                System.out.println("Mini Bar");
              break; 
              
              case "003":
                  System.out.println("Reservacion a nombre de:*Nombre* ");
               System.out.println("Cama Matrimonial");
                System.out.println("Baño");
                System.out.println("Television");
                System.out.println("Mini Bar");
              break;   
              
               case "004":
                   System.out.println("Reservacion a nombre de:*Nombre* ");
             System.out.println("Cama Matrimonial");
                System.out.println("Baño");
                System.out.println("Television");
                System.out.println("Mini Bar");
              break;  
              
              case "005":
                  System.out.println("Reservacion a nombre de:*Nombre* ");
              System.out.println("Cama Matrimonial");
                System.out.println("Baño");
                System.out.println("Television");
                System.out.println("Mini Bar");
              break;  
              
               case "006":
                   System.out.println("Reservacion a nombre de:*Nombre* ");
               System.out.println("Cama Matrimonial");
                System.out.println("Baño");
                System.out.println("Television");
                System.out.println("Mini Bar");
              break; 
              
               case "007":
                   System.out.println("Reservacion a nombre de:*Nombre* ");
               System.out.println("Cama Matrimonial");
                System.out.println("Baño");
                System.out.println("Television");
                System.out.println("Mini Bar");
              break; 
              
               case "008":
                   System.out.println("Reservacion a nombre de:*Nombre* ");
              System.out.println("Cama Matrimonial");
                System.out.println("Baño");
                System.out.println("Television");
                System.out.println("Mini Bar");
              break; 
              
               case "009":
                   System.out.println("Reservacion a nombre de:*Nombre* ");
    System.out.println("Cama Matrimonial");
                System.out.println("Baño");
                System.out.println("Television");
                System.out.println("Mini Bar");
              break; 
              
               case "0010":
                   System.out.println("Reservacion a nombre de:*Nombre* ");
               System.out.println("Cama Matrimonial");
                System.out.println("Baño");
                System.out.println("Television");
                System.out.println("Mini Bar");
              break;  
              
              default:
              
              System.out.println("El numero de reservacion selecionado no esta en el sistema.");
        }
     
    
        
        
        
       
  }
  
  
  }
    

