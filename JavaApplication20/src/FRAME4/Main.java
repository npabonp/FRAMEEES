/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRAME4;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension (400,300));
        frame.setTitle("Boton");
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel ("Escriba el codigo de acceso");
        JTextField field = new JTextField(5);
        JButton boton = new JButton("NO PRESIONAR EL BOTON");
        boton.setIcon(new ImageIcon("caution.gif"));
        
        boton.addActionListener(new MessageListener(field));
        
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(field);
        frame.add(boton);
        frame.pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width / 2 - frame.getSize().width / 2,
                dim.height / 2 - frame.getSize().height / 2);
        
        frame.setVisible(true);
        
    }
}
