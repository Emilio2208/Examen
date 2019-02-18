package burbuja;
/**
 * @author frida
 */
public class Algoritmo {
    int i, j, temporal;
    
    public Algoritmo(){
       this.i = 0;
       this.j = 0;
       this.temporal = 0;
       
    }
    //Metodo burbuja version 1
    public void burbuja1(int [] arreglo){
        for(i = 0; i <arreglo.length;i++){
            for(j = i+1; j<arreglo.length;j++){
                if(arreglo[i]>arreglo[j]){
                    temporal = arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=temporal;
                }
            }
        }
    }
    //Metodo burbuja version 2
    public void burbuja2(int [] arreglo){
        for(i = 1; i <arreglo.length;i++){
            for(j = 0; j<arreglo.length - 1;j++){
                if(arreglo[j]>arreglo[j+1]){
                    temporal = arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=temporal;
                }
            }
        }
    }
    //Nuevo metodo para mostrar los resultados del vector
    public void mostrarArreglo(int [] arreglo){
        int k;
        for(k = 0;k<arreglo.length;k++){
            System.out.print("["+arreglo[k]+"]");
        }
        System.out.println();
    }
 }