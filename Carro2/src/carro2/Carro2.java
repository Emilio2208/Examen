
package carro2;


public class Carro2 {

  
     {

    double peso;
    double altura;
    double ancho;
    double largo;
    int numeroDePuertas;
    String modelo;
    boolean encendido = false;
    
    
    public Carro2()
            
    {
        this.peso = 1000;
        this.altura = 1.90;
        this.ancho = 4;
    
    }
    
   public double obtenerPeso()
   {
   
       return this.peso;
   
   }
   
   public void encender()
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
    this.modelo="BMW";
    
}

public void turbo()
{
    System.out.println("Acabas de viajar a 100 millas por hora");
}

}
    

