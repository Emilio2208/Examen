packageMax_miN;

public class Main {
     public static void main(String[] args) {
         int may =-10000,men=10000;
         String cad="";
         int Num[]=new int[100];
         for(int i=0;i<100;i++){
           Num[i]=(int) (Math.random() * 500);
           if(Num[i]>may){
               may=Num[i];
           }
           if(Num[i]<men){
               men=Num[i];
           }
           cad=cad+" "+Num[i];
         }
          System.out.println(cad);
          System.out.println("El mayor es:"+may);
          System.out.println("El menor es:"+men);
     }
}