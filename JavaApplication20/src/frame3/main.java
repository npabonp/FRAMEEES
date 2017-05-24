/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame3;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(250,200));
        frame.setTitle("TELEFONITO");
        frame.setLayout(new BorderLayout());
        
        //Botones del telefono
        JPanel panelCentral = new JPanel(new GridLayout(4,3));
        for (int i = 1; i < 10; i++) {
            panelCentral.add(new JButton(""+ i));
        }
        panelCentral.add(new JButton("*"));
        panelCentral.add(new JButton("0"));
        panelCentral.add(new JButton("#"));
        frame.add(panelCentral, BorderLayout.CENTER);
        
        //Botones o coso de abaj´o
        JPanel panelInferior = new JPanel ( new FlowLayout());
        panelInferior.add(new JLabel("Numero a llamar"));
        panelInferior.add(new JTextField(10));
        frame.add(panelInferior, BorderLayout.SOUTH);
        
        frame.setVisible(true);
        
        
        
    }
 
}
