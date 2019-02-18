//Emilio Abreu Morales 
//2756175
package examen;
import java.io.*; 
public class Examen {

    public static BufferedReader entrada = new BufferedReader  (new InputStreamReader(System.in)); 
  public static void main(String[] args) throws IOException 
  {
      //datos del cliente (atributos)//
     int videojuego;
     String nombre; 
         System.out.println("Videojuego");
         nombre = entrada.readLine(); 
         System.out.println("El videojuego seleccionado es: " + nombre );
          
         switch (nombre)
       
        {
                case "PLANTAS VS ZOMBIES": 
                    System.out.println("Nombre: PLANTAS VS ZOMBIES ");
                System.out.println("Codigo:001 ");
                System.out.println("Precio:$500.00");

                break;
                
              case "Call of Duty":
                  System.out.println("Nombre: Call of Duty  ");
             System.out.println("Codigo:002 ");
                System.out.println("Precio:$600.00");
              break; 
              
              case "Super Mario Car":
                  System.out.println("Nombre: Super Mario Car ");
             System.out.println("Codigo:003 ");
                System.out.println("Precio:$450.00");
              break;   
              
               case "Marvel vs Capcom 3":
                   System.out.println("Nombre: Marvel vs Capcom 3 ");
             System.out.println("Codigo:004 ");
                System.out.println("Precio:$350.00");
              break;  
              
              case "Mortal Kombat ":
                  System.out.println("Nombre: Mortal Combat ");
              System.out.println("Codigo:005 ");
                System.out.println("Precio:$1050.00");
              break;  
              
              default:
              
              System.out.println("El juego que has seleccionado no pertenece a ningun registro en la tienda ");
        
                  System.out.println("Mortal Kombat");
                  System.out.println("Codigo:005");
                  System.out.println("Marvel vs Capcom 3 004");
                  System.out.println("Codigo:004");
                  System.out.println("Super Mario Car");
                  System.out.println("Codigo:003");
                  System.out.println("Call of Duty");
                  System.out.println("Codigo:002");
                  System.out.println("PLANTAS VS ZOMBIES");
                  System.out.println("Codigo:001");
         
         }
     
    
        
        
        
       
  }
  
  
  }
    

