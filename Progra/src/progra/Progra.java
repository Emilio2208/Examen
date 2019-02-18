
package progra;


public class Progra {
    
    String nombre; 
    String rango;
    int edad; 
    String Habilidad; 
    double peso;
    String areaDeTrabajo; 
    String turnoDeVigencia; 
    boolean examenAnual = false;
   
    {
    this.peso = 70.5;
    this.edad = 44;
    this.nombre = "Pepe"; 
    }
  
     public double obtenerPeso()
   {
   
       return this.peso;
   
   }
}
     class Pepe extends Progra
     {      
     public Pepe()
     {
         this.edad= 45; //acceso a la variable// 
     }
    
        public void examenAnual()
        {
         this.examenAnual=true;
       System.out.println("Usted Paso el examen");
        }
    
    public void PepeHabilidadArea() //diferentes metodos//
            
    {
        System.out.println("Nombre:Pepe");
        System.out.println("Area:Cocina");
        System.out.println("Turno de vigilancia: Noche");
        System.out.println("Peso:45");
        System.out.println("Edad: 34");
    }
    
    public void JuanHabilidadArea() //otro metodo//
            
    {
        System.out.println("Nombre: Juan");
       System.out.println("Area:Mantenimiento");
        System.out.println("Turno de vigilancia: Dia");
        System.out.println("Peso:34");
        System.out.println("Edad: 56");
    }
    
     public void CarlosHabilidadArea()
            
    {
        System.out.println("Nombre: Carlos");
        System.out.println("Area:Gym");
        System.out.println("Turno de vigilancia: Noche");
        System.out.println("Peso:56");
        System.out.println("Edad: 23");
    }
     
     }
     //hijo de mi clase, aplique herencia ademas del polimorfismo//
     class carlosAlberto extends Progra {
             
            public void CarlosHabilidadArea()
      
    {
        System.out.println("Carlos Alberto");
        System.out.println("Area:Automoviles");
        System.out.println("Turno de vigilancia: Dia");
        System.out.println("Peso:89");
        System.out.println("Edad: 59");
    }
     }       
             
    

