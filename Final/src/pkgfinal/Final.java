
package pkgfinal;

 import java.util.*;
public class Final {

   
    
        


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
      int n1, n2, n3, n4, n5;
      
          
      
      System.out.print("Numero 1: "); //numero 1//
      n1 = sc.nextInt();
      
    System.out.print("Numero 2: "); //numero 2//
      n2 = sc.nextInt();
      
      while(n2==n1)
      {
          System.out.print("Ingrese algun otro numero ");
      n2 = sc.nextInt();
      }
      
      
      
      
      
      
      System.out.print("Pon numero 3: "); //numero 3//
        n3 = sc.nextInt();
        
         while(n3==n1 || n3==n2)
      {
          System.out.print("Ingrse algun otro: ");
      n3 = sc.nextInt();
      
      
      }
        
        
         
         
        
    System.out.print("Ponga el numero 4: "); //numero 4//
        n4 = sc.nextInt();
        
         while(n4==n1 || n4==n2 ||n4==n3)
      {
          System.out.print("Ingrse algun otro: ");
      n4 = sc.nextInt();
      }
        
         
         
         
         
         
        
    System.out.print("Ponga el numero 5: "); //numero 5//
        n5 = sc.nextInt();
        
         while(n5==n1 || n5==n2 || n5==n3 || n5==n4)
      {
          System.out.print("Ingrse algun otro: ");
      n5 = sc.nextInt();
      }
        
         
         
         
         //cuál es mayor//
        if((n1 > n2)&&(n1>n3) &&(n1>n4) && (n1>n5))
              System.out.println("El mayor es: " + n1);
        
           
        if((n2 > n1)&&(n2>n3) &&(n2>n4) && (n2>n5))
              System.out.println("El mayor es: " + n2);
        
        if((n3 > n1)&&(n3>n2) &&(n3>n4) && (n3>n5))
              System.out.println("El mayor es: " + n3);
        
        if((n4 > n1)&&(n4>n2) &&(n4>n3) && (n4>n5))
              System.out.println("El mayor es: " + n4);
        
        if((n5 > n1)&&(n5>n2) &&(n5>n3) && (n5>n4))
              System.out.println("El mayor es: " + n5);
        
        
        
            
        
        
        //cuál es menor//
        if((n1 < n2)&&(n1<n3) &&(n1<n4) && (n1<n5))
              System.out.println("El menor es: " + n1);
        
           
        if((n2 < n1)&&(n2<n3) &&(n2<n4) && (n2<n5))
              System.out.println("El mejor es: " + n2);
        
        if((n3 < n1)&&(n3<n2) &&(n3<n4) && (n3<n5))
              System.out.println("El menor es: " + n3);
        
        if((n4 < n1)&&(n4<n2) &&(n4<n3) && (n4<n5))
              System.out.println("El menor es: " + n4);
        
        if((n5<  n1)&&(n5<n2) &&(n5<n3) && (n5<n4))
              System.out.println("El menor es: " + n5);
        

        
    }
}
    
    

