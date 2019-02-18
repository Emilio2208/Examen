
package mayornume;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MayorNume {


    public static void main(String[] args) throws IOException {
        
int n = 0,mayor = -99999,menor = 99999;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

for (int i = 0; i < 10; i++) {
System.out.println("Ingresa los numeros");
n = Integer.parseInt(br.readLine());
if(n > mayor){
mayor = n;
}
if(n < menor){
menor = n;
}
}
System.out.println("El numero mayor es de los dictados fue:" + mayor);
}

    }
    

