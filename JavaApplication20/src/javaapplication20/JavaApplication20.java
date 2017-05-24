/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import javax.swing.*;

public class JavaApplication20 {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null, "Como te llamas cosita rik");
        //Retorna un entero si es si o no 
        int eleccion = JOptionPane.showConfirmDialog(null, nombre + "Te gusta el pan rollo?");
        if (eleccion == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Obvio mariqui");
        }else{
            JOptionPane.showMessageDialog(null, "Osea ubikt");
        }

    }

}
