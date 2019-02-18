
package sumadepila;


public class SumadePila {


    public static void main(String[] args) {
        //Sumar el total de los valores de los elementos de un arreglo
        int pila [] = {1,2,3,4,5,6,7,8,9,10};
        int total=0; 
        int total1=1;
       
        
        //Sumar el valor de cada elemento total
        for (int contador=0;contador<pila.length;contador++){
            total+=pila[contador];
            System.out.println(pila[contador]+ " Suma--> "+total);
            
            
          
            total*=pila[contador];
            System.out.println(pila[contador]+ " Multiplicación--> "+total);
            
            
            
            
        }
           
    }
    }

