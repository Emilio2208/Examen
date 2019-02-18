
package telegrafo;
import java.util.Scanner;
public class Telegrafo {

   
    public static void main(String[] args) {

        String texto;
        int Letra=0;
        int Digito=0;
        int Caracter=0; 
        int Letras=0; 
        int Digitos=0; 
        int Caracteres=0;
        Scanner entrada = new Scanner(System.in); //Declaramos la variable Scanner 
        System.out.print("Ingresa el mensaje: ");
        texto=entrada.nextLine();
        //El usuario ingresa con el teclado el mensaje 
        char[] arregloTele = new char[texto.length()];
        for(int cont=0;arregloTele.length>cont;cont++){ //arreglo
            
            //evaluara las situaciones que se muestran en el problema dado 
               arregloTele[cont]=texto.charAt(cont);
               if((arregloTele[cont]>=97 && 122>=arregloTele[cont]) || (arregloTele[cont]>=65 && 90>=arregloTele[cont]))
               {
                   Letra+=10; //estamos declarando las condicionales, con los costos $10, 20 y 30
                   Letras++;
               }
               
               else{  //usamos la herramienta "contador"
                   if(arregloTele[cont]>=48 && 57>=arregloTele[cont]){
                   Digito+=20;
                   Digitos++;
                    }
                   
                   else{  //usamos la herramienta "contador"
                       if(arregloTele[cont]!=32){
                           Caracter+=30;
                           Caracteres++;
                       }
                   }
               }
        }
        //daclaramos la variable del total 
        int total=Letra+Digito+Caracter;
        System.out.println("Los resultados son:");
        System.out.println(Letras+" Letras: "+"$"+Letra + " Pesos");
        System.out.println(Digitos+" Digitos: "+"$"+Digito + " Pesos" );
        System.out.println(Caracteres+" Caracteres: "+"$"+Caracter + " Pesos" );
        System.out.println("Total:  " + "$" +  total+ " Pesos" );
        //es este caso estamos imprimiendo los resultados finales que apareceran 
        
    
    
}
        
    
    
}
