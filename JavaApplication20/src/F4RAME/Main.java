/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F4RAME;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("caution.gif");
        frame.setIconImage(icon);
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setBackground(Color.PINK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300, 120));
        //Centrar la ventana
        //La clase dimension permite tener la resolucion del monitor
        //Luego se usa eso para ponerlo en el centro
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width / 2 - frame.getSize().width / 2,
                dim.height / 2 - frame.getSize().height / 2);
        frame.setTitle("JUEGUITO");

        //Agregar los botoncitos
        JButton boton1 = new JButton();
        boton1.setText("soy un boton jiji");
        boton1.setBackground(Color.GREEN);

        //El layout es lo que hace que se organice el frame
        JButton boton2 = new JButton();
        boton2.setText("presioname");
        boton2.setBackground(Color.GREEN);
        
        //Es para crear un espocaio para escribit 
        JTextField field = new JTextField(5);

        frame.setLayout(new FlowLayout());
        frame.add(boton1);
        frame.add(boton2);
        frame.add(field);

        frame.setVisible(true);

    }

}
