
package repaso2;

public class Repaso2 {


    public static void main(String[] args) 
    
                
    {
      char departamento = 'B';
      
      switch (departamento)
          
      {
          
          case 'A' :
              System.out.println("Desarrollo");
              break;
          case 'B' :
              
      
              System.out.println("Recursos humanos");
              break;
          case 'C' :
              
                System.out.println("Finanzas");
              break;
          case 'D' :
              
               System.out.println("Mercadeo");
          default :
              
              System.out.println("Departamneto Invalido");
                    
      }
          
         System.out.println("Codigo para el departamento es " + departamento);
              
    }
    
}
