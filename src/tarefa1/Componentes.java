/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa1;

import javax.swing.*;

/**
 *
 * @author usuario
 */
public class Componentes {
     
    JFrame marco;
    JPanel panel;
    JButton boton,boton2;
    JLabel etiqueta,etiqueta2;
    JTextField texto,texto2;
    JTextArea area;
    
    public Componentes(){
        
        marco = new JFrame( " Componentes ");
        panel = new JPanel();
        etiqueta = new JLabel();
        etiqueta2 = new JLabel();
        texto = new JTextField();
        texto2 = new JTextField();
        boton = new JButton(" Premer ");
        boton2 = new JButton(" Limpiar ");
        area = new JTextArea("Area de texto");
        
        marco.setSize(900,600);
        panel.setSize(900,600);
        etiqueta.setText(" Nombre ");
        texto.setSize(300,300);
        texto.setText("                  ");
        etiqueta2.setText(" Password ");
        texto2.setSize(300,300);
        texto2.setText("                 ");
        area.setSize(300,600);
         
        panel.add(etiqueta);
        panel.add(texto);
        panel.add(etiqueta2);
        panel.add(texto2);
        panel.add(area);
        panel.add(boton);
        panel.add(boton2);
        marco.add(panel);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
