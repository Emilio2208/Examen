
package prueba4;
import java.util.Scanner;
public class Prueba4 {


public static void main(String[] args){ 
Scanner s=new Scanner(System.in); 

int[] arreglo=new int[5]; 
int menor=9999; 
int mayor=0; 


for(int i=0;i<5;i++){ 
System.out.println("Ingrese el numero "+(i+1)); 
arreglo[i]=s.nextInt(); 
} 

for(int i=0;i<5;i++){ 
if(menor>arreglo[i]){ 
menor=arreglo[i]; 
} 
if(mayor<arreglo[i]){ 
mayor=arreglo[i]; 
} 
} 

System.out.println("El numero menor es: "+menor); 
System.out.println("El numero mayor es: "+mayor); 



} 


} 


    
        
    
   
