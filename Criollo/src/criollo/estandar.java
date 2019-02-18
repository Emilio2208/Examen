
package criollo;


public class estandar {
    
    int a;
    int b; 
    
    public estandar(){
    //constructor vacio, poder hacer un objeto y no te pida valores al principio//
    
    } 
    
    
    public estandar(int valor1, int valor2 ){
        this.a = valor1;
        this.b = valor2;
    //constructor con parametros//
    }
    
    public void suma(){
        
        System.out.println(a+b);
    }
    
    
            
    
}
