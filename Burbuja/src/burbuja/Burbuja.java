package burbuja;

public class Burbuja {
    
    public static void main(String[] args) {
        Algoritmo ordenar = new Algoritmo();
        int vector1[]={5,6,3,44,22,1};
        int vector2[]={55,4,43,44,2,10};
        
        System.out.println("Arreglo original");
        ordenar.mostrarArreglo(vector1);
        System.out.println("Arregl ordenado");
        ordenar.burbuja1(vector1);
        ordenar.mostrarArreglo(vector1);
        
        System.out.println("Arreglo original");
        ordenar.mostrarArreglo(vector2);
        System.out.println("Arreglo ordenado");
        ordenar.burbuja1(vector2);
        ordenar.mostrarArreglo(vector2);
    }
    
}