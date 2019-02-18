
package fiboexa;
import java.util.Scanner; 



public class FiboExa {
    private static int fibo1;


  
    public static void main(String[] args){
        int fibo=0;
        int fibo2=1,i;
      for(i=1;i<=15;i++){
          System.out.print(fibo2+ " ");
          fibo2= fibo1 + fibo2;
          fibo1 = fibo2 - fibo1;
          
      }
       
      System.out.println();
    }
}