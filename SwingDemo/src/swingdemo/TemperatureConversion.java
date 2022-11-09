/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdemo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Omar
 */
public class TemperatureConversion extends JFrame{
    JFrame frame;
    JLabel f, c;
    JTextField t1, t2;
    JButton b1, b2;
    
    TemperatureConversion(){
        
        f = new JLabel("Fahrenheir");
        c = new JLabel("Celcius");
        
        b1 = new JButton("F-->>C");
        b2 = new JButton("C-->>F");
        
        t1 = new JTextField();
        t2 = new JTextField();
        
        add(f);
        add(t1);
        add(b1);
        add(b2);
        add(c);
        add(t2);
        
        b1.addActionListener((ActionEvent e) -> {
            t2.setText(Double.toString((Integer.parseInt(t1.getText())-32)/1.8));
        });
        
        b2.addActionListener((ActionEvent e) -> {
            t1.setText(Double.toString((Integer.parseInt(t2.getText())*1.8)+32));
        });
        
        t1.setPreferredSize(new Dimension(150,20));
        t2.setPreferredSize(new Dimension(150,20));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Temperature Conversion");
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(700,200);
        getContentPane().setBackground(Color.BLUE);
    }
    
    public static void main(String args[]){
        TemperatureConversion a = new TemperatureConversion();
    }

}
