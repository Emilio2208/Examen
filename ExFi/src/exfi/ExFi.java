
package exfi;

import java.util.Scanner;

public class ExFi {

    

    public static void main(String[] args){
        menu exa = new menu (); 
        menu2 exa2 = new menu2 (); 
        menu3 exa3 = new menu3 (); 
        Scanner entrada=new Scanner (System.in); 
            String area= ""; 
    String operacion = "";
    
    
    String conversiones = "Pulgadas-Centimetros";
    String conversiones1 = "Centimetros-Pulgadas";
    String conversiones2 = "Pulgadas-Metros";
    String conversiones3 = "Metros-Pulgadas";
    
    String operaciones = "Exponenciacion";
    
    
        
        //Aqui se menciona la sopciones que el usuario puede hcaer con este pograma 
System.out.println("Menu");
        System.out.println("1.-Conversiones ");
        System.out.println("   1.1-Pulgadas-Centimetros");
         System.out.println("   1.2-Centimetros-Pulgadas");
          System.out.println("   1.3-Pulgadas-Metros");
           System.out.println("   1.4-Metros-Pulgadas");
        System.out.println("2.-Area");
          System.out.println("   2.1-Circulo");
            System.out.println("   2.2-Trapecio");
              System.out.println("   2.3-Cuadrado");
                System.out.println("   2.4-Triangulo");
        System.out.println("3.-Operaciones");
            System.out.println("   3.1-Exponenciacion");
            System.out.println("   3.2-Residuo");
              System.out.println("   3.3-Producto");
                System.out.println("   3.4-Division");
        
        System.out.println("Ingresa el nombre de lo que quieras hacer");
        conversiones=entrada.next(); 
        
        
        {    
        switch (conversiones)
                {   
        //Aqui se pone la operacio que t quieras realizar 
            
        case "Pulgadas-Centimetros": 
                    System.out.println("Ingrese las pulgadas");
                    exa.pul=entrada.nextDouble(); 
                    System.out.println("Conversion:");exa.conversion();
                   
                break;
                //casos dependiendo de lo que se quiera hacer 
                case "Centimetros-Pulgadas": 
                    System.out.println("Ingrese los centimetros");
                    exa.cent=entrada.nextDouble(); 
                    System.out.println("Conversion:");exa.conversion2();
                   
                break;
                
                case "Pulgadas-Metros": 
                    System.out.println("Ingrese las pulgadas");
                    exa.pul=entrada.nextDouble(); 
                    System.out.println("Conversion:");exa.conversion3();
                   
                break;
                
                case "Metros-Pulgadas": 
                    System.out.println("Ingrese los metros");
                    exa.me=entrada.nextDouble(); 
                    System.out.println("Conversion:");exa.conversion4();//metodos de las clases
                   
                break;
                
                case "Exponenciacion": 
                    System.out.println("Ingrese el valor 1");
                    exa3.e1=entrada.nextDouble(); 
                    System.out.println("Ingrese el valor 2");
                    exa3.e2=entrada.nextDouble(); 
                    System.out.println("Resultado:");exa3.exponenciacion();
                   
                break;
                
                case "Residuo": 
                    System.out.println("Ingrese el valor 1");
                    exa3.r1=entrada.nextDouble(); 
                    System.out.println("Ingrese el valor 2");
                    exa3.r2=entrada.nextDouble(); 
                    System.out.println("Resultado:");exa3.residuo();
                break;
                
                case "Producto": 
                    System.out.println("Ingrese el valor 1");
                    exa3.mul1=entrada.nextDouble(); 
                    System.out.println("Ingrese el valor 2");
                    exa3.mul2=entrada.nextDouble(); 
                    System.out.println("Resultado:");exa3.producto();
                break;
                
                case "Division": 
                    System.out.println("Ingrese el valor 1");
                    exa3.div1=entrada.nextDouble(); 
                    System.out.println("Ingrese el valor 2");
                    exa3.div2=entrada.nextDouble(); 
                    System.out.println("Resultado:");exa3.division();
                break;
                
                case "Circulo": 
                    System.out.println("Ingrese el radio");
                    exa2.r=entrada.nextDouble(); 
                    System.out.println("Area:");exa2.circulo();
                   
                break;
                
                case "Trapecio": 
                    System.out.println("Ingresa base menor");
                    exa2.bme=entrada.nextDouble(); 
                    System.out.println("Ingresa base mayor");
                    exa2.bm=entrada.nextDouble(); 
                    System.out.println("Ingresa la altura");
                    exa2.altura=entrada.nextDouble(); 
                    System.out.println("Area:");exa2.trapecio();
                break;
                
                case "Cuadrado": 
                    System.out.println("Ingresa lado 1");
                    exa2.l1=entrada.nextDouble(); 
                    System.out.println("Ingresa lado 2");
                    exa2.l2=entrada.nextDouble(); 
                    System.out.println("Area:");exa2.cuadrado();
                break;
                
                case "Triangulo": 
                    System.out.println("Ingresa base ");
                    exa2.base=entrada.nextDouble(); 
                    System.out.println("Ingrese altura");
                    exa2.altura2=entrada.nextDouble(); 
                    System.out.println("Area:");exa2.triangulo();
                break;
                default:
              
              System.out.println("No selecciono nada");
                //Si no pones nada se cierra todo
                
                
        }
        
        
        
        
        }}}
        
        
    

