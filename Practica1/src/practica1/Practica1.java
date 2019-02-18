
package practica1;


public class Practica1 {

    
    public static void main(String[] args) {
       
        int edad = 19; 
        Atributos atrib0 = new Atributos (edad);
    Atributos atrib1 = new Atributos ();
        System.out.println(atrib1.numero);
        System.out.println(atrib1.nombre);
        System.out.println(atrib0.numero);
        
        System.out.println(atrib1.Multiplicacion());
        System.out.println(atrib0.Multiplicacion());
        
        atrib1.suma();
    }
    
}
