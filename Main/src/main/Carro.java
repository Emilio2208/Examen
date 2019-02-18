
package main;

public class Carro 
{

    double peso;
    double altura;
    double ancho;
    double largo;
    int numeroDePuertas;
    String modelo;
    boolean encendido = false;
    public Carro()
            
    {
        this.peso = 1000;
        this.altura = 1.90;
        this.ancho = 4;
    
    }
    
   public double obtenerPeso()
   {
   
       return this.peso;
   
   }
   
   public void encender() //metodo//
   {
       this.encendido=true;
       System.out.println("El carro esta encendido");
   }
   
   public void apagar ()
   {
       this.encendido = false; 
       System.out.println("El carro esta apagado");
   }
   
   public void estado()
          
   {
   if(this.encendido == true)
           System.out.println("El carro esta encendido");
   else
           System.out.println("El carro esta apagado");
   
   }
   
}

class CarroBMW extends Carro
{

public CarroBMW()
{
    this.modelo="BMW"; //acceso a las variables// 
    
}

public void turbo()
{
    System.out.println("Acabas de viajar a 100 millas por hora");
}

public void informacion()
{
    System.out.println("Este carro es blanco");
}
}










