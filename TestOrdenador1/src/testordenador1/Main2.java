
package testordenador1;


public class Main2 {
    
    String marca;
    String procesador;
    int peso;
    boolean encendido=false;
    boolean apagado=false;
    boolean pantalla=false;
    public void encenderOrdenador()
    {
        if(encendido==true)
        {
            System.out.println("El ordenador ya esta encendido");
        }
        else
        {
            encendido=true;
            pantalla=true;
            System.out.println("El ordenador ha sido encendido");
        }
    }
    public void estadoOrdenador()
    {
        System.out.println("El estado del ordenador es el siguiente");
        System.out.println("Marca: "+marca);
        System.out.println("Procesador: "+procesador);
        System.out.println("Peso: "+peso+" kg.");
        
        if(encendido==true)
        {
            System.out.println("El ordenador ya esta encendido");
        }
        else
        {
            encendido=true;
            pantalla=true;
            System.out.println("El ordenador ha sido encendido");
        }
        if (pantalla==true)
        {
            System.out.println("La pantalla esta activada");
        }
        else
        {
            System.out.println("La pantalla esta desactivada");
        }
        
    }
    
    public String obtenerMarca()
    {
        return marca;
    }
    public void establecerMarca(String ma)
    {
        marca=ma;
    } 
    
    public int obtenerPeso()
    {
        return peso;
    }
    public void establecerPeso(int pe)
    {
        peso=pe;
    }
     public String obtenerProcesador()
    {
        return procesador;
    }
    public void establecerProcesador(String pr)
    {
        procesador=pr;
    }
     public void apagarOrdenador()
    {
        if(apagado==true)
        {
            System.out.println("El ordenador ya esta apagado");
        }
        else
        {
            apagado=true;
            pantalla=true;
            System.out.println("El ordenador ha sido apagado");
        }
        
        
        
    }
    
}
    

