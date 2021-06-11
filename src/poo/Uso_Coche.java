/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
import javax.swing.*;
/**
 *
 * @author JOJAMA
 */
public class Uso_Coche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here                
       Coche micoche = new Coche();
       
        micoche.establece_color(JOptionPane.showInputDialog("Escoger el color"));
        System.out.println(micoche.dime_datos_generales());
        System.out.println(micoche.dimecolor());
       
        micoche.configura_asiento(JOptionPane.showInputDialog("Tienes asientos de cuero"));
        System.out.println(micoche.dime_asientos());
                
        micoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
        System.out.println(micoche.dime_climatizador());
        System.out.println(micoche.dime_peso_carro());       
        System.out.println("El precio final del carro es: " + micoche.precio_coche());
       
    }
    
}
