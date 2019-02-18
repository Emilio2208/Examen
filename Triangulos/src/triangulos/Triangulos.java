
package triangulos;
import java.io.*; 
public class Triangulos {

    public static BufferedReader entrada = new BufferedReader  (new InputStreamReader(System.in)); 
  public static void main(String[] args) throws IOException 
  {
   //datos para ingresar para el tringulo, como las medidas 
      
      double a,b,c;
      
      
      System.out.println("Introduce el lado '1'"); //esto es lo que el usurio vera//
      a = Double.parseDouble(entrada.readLine()); 
      
      System.out.println("Introduce el lado '2'"); //esto es lo que el usurio vera//
      b = Double.parseDouble(entrada.readLine()); 
            
      System.out.println("Introduce el lado '3'"); //esto es lo que el usurio vera//
      c = Double.parseDouble(entrada.readLine()); 
      
      
      if ( ((a+b)>c) && ((a+c)>b) && ((b+c)>a)  ) //datos con los que trabajara el software// 
      {
          System.out.println("Si es un tringulo");
          
         
      if (a==b && b==c)
     {
         System.out.println("El triágulo es equilátero");
     }
     else
     {
         if (a==b || a==c || b==c)
         {
             System.out.println("El triángulo es isósceles");
         }
         else
         {
         if( a!=b && a!=c && c!= b )
                 System.out.println("El triágulo es escaleno");
      
      }
      
         }
        
      }
  
   else 
          
      {
      
          System.out.println("No es un trianguloo");
          
      }
  }


}
      
       
       
    
     

      
    
    
    

