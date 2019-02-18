
package tareaarreglos;
import java.util.Scanner;

public class TareaArreglos {

    public static void main(String[] args) {
  
        Scanner entrada = new Scanner(System.in); 

int tamaño;
int tamaños; 
//Declaramos la variable int tamaño


System.out.println("Ingrese el tamaño del arreglo"); 
tamaño = entrada.nextInt(); 
//Declarar el tamaño del arreglo 

int numeros[] = new int[tamaño]; 
int suma[] = new int[tamaño]; 
//Con estos valores se ealizara la suma 

//Ingresamos los valores que van a ener cada uno de los diferntes arreglos 
System.out.println("Ingresa cada uno de los valores, en este caso " + tamaño ); 

for (int i = 0; i < tamaño; i++) { 
System.out.print((i+1) + " es :"); 
numeros[i] = entrada.nextInt(); 
} //contadores


System.out.println("Los elementos del arreglo son los siguientes :"); 
for (int j = 0; j < numeros.length; j++) { 
System.out.print( numeros[j]+" "); 
} 
//Imprmir los arreglos finales de los valores ya puestos 


int impar=tamaño%2;//Se declara el tamaño de este en este caso 2 
if(impar>0){
    tamaños= (tamaño/2)+1;
}
else{
    tamaños=tamaño/2;
}
//Se le pregunta al usuario si este es par o impar

//En este se sumaran lso resultados y imprimirn los valores finales 
System.out.println("Los elementos del arreglo final son :"); 

//Intrucciones para el que es par
for (int i = 0; i < tamaños; i++) { 
if (i!=tamaño-(1+i)) { 
suma[i] = numeros[i]+numeros[tamaño-i-1]; 
System.out.print(suma[i]+ " "); 
System.out.println("");
}

//Intrucciones si est en impar 
else{
  if(impar!=0){
    suma[i]=numeros[(tamaño-1)/2];
}
    System.out.println(suma[i]+" ");
    }
  }
}
}
