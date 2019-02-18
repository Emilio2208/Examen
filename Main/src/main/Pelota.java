/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


public class Pelota 
{
    float radio;
float peso; 
public Pelota()
        
{
    radio=100;
    peso = 250; 
}

public Pelota (float radio, float peso)
{
    this.radio=radio; 
    this.peso=peso;
}

public float obtenerRadio()
        
{
    return radio; 
}  

public float obtenerPeso()
        
{
    return peso; 
}  


public void patearPelota()
{
    System.out.println("Haz pateado la pelota");
}

public void atraparPelota()
{
    System.out.println("Haz atrapado la pelota");
}
}
