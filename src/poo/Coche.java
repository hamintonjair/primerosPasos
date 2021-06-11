/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author JOJAMA
 */
public class Coche {
    //variables de tipo private para que encapsule y no puedan ser modificado desde otra clase
    private int ruedas, largo, ancho, motor, peso_plataforma;
    
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;
    
    //metodo constructor public para las variables del coche
    public Coche(){
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
        
    }  
    //metodo getter devuelve un datos
    public String dime_datos_generales(){
        return "La plataforma del vehículo tiene " + ruedas + " ruedas" +". Mide " + largo/1000 + 
         " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma+ " kg";
        
    }
    
        //metodo setter no devuelve datos
    public void establece_color(String color_coche){
        color = color_coche;
    }
    
    public String dimecolor(){
        return "El color de tu carro es " + color;
    }
    
    public void configura_asiento(String asientos_cuero){
        
        if(asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero = true;
        }
        else{
            this.asientos_cuero = false;
        }
    }
    
    public String dime_asientos(){
        if(asientos_cuero == true){
            return "El coche tiene asientos de cuero";
        }
        else{
            return "El coche tiene asientos de serie";
        }
    } 
    
    public void configura_climatizador(String climatizador){
        
        if(climatizador.equalsIgnoreCase("si")){
            this.climatizador = true;
        }
        else{
            this.climatizador = false;
        }
    }
    public String dime_climatizador(){
        
        if(climatizador == true){
            return "El coche tiene climatizador";
        }
        else{
            return "El coche tiene aire acondicionador";
        }
    }
    
    public String dime_peso_carro(){
        
        int peso_carroceria = 500;
        peso_total = peso_plataforma + peso_carroceria;
        
        if(asientos_cuero == true){
            peso_total = peso_total + 50;
        }
        if(climatizador == true){
            peso_total = peso_total + 20;
        }
        return "El peso del coche es: " + peso_total;
    }
    
    public int precio_coche(){
        int precio_final = 10000;
        
        if(asientos_cuero == true){
            precio_final += 2000;
        }
        if(climatizador == true){
            precio_final += 1500;
        }
        return precio_final;
    }

}
