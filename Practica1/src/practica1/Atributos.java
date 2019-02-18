
package practica1;


public class Atributos { //esto es otra clase dentro del paquete//
    String  nombre;
    int numero; //declracion de variables que tendra la clase, sin valor//
    
    //constructoe: llamar a todo lo que tengas todo dentro de esta clase, lo que esta dentro de la llaves, siempre debe de llevar el mismo nombre de la clase//
    
    public Atributos(){
        numero = 7; 
        nombre = "alday";
    }
    
        
    public Atributos(int e){ 
    numero = e; 
    }
  public int Multiplicacion(){
      int numero1 = numero*2;
      return numero1; 
  }  
  public void suma(){
      int n1 = numero +5; 
      System.out.println(n1);
  }
}

