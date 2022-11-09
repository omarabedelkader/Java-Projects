/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdemo;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Omar
 */
public class PanelTest extends JFrame{
    JFrame frame = new JFrame();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JLabel label1 = new JLabel("Panel 1");
    JLabel label2 = new JLabel("Panel 2");
    JLabel label3 = new JLabel("Panel 3");
    
    PanelTest(){
        super("Panel test");
        panel1.setBackground(Color.blue);
        panel2.setBackground(Color.red);
        panel3.setBackground(Color.yellow);
        
        panel1.setBounds(0,0,300,200);
        panel2.setBounds(300,0,300,200);
        panel3.setBounds(0,200,600,200);
        
        panel1.add(label1);
        panel2.add(label2);
        panel3.add(label3);
        
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public static void main(String args[]){
        new PanelTest();
    }
}
