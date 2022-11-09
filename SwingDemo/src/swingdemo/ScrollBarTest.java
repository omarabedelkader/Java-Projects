/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdemo;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 *
 * @author Omar
 */
public class ScrollBarTest extends JFrame{
    JTextArea ta;
    JScrollPane jsp;
    
    ScrollBarTest(){
        super("JScrollPane Demo");
        setLayout(null);
        setSize(400,400);
        setLocationRelativeTo(null);
        
        ta = new JTextArea();
        ta.setForeground(Color.blue);
        ta.setBackground(Color.yellow);
        
        jsp = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(jsp).setBounds(20,20,340,320);
    }
    
    public static void main(String args[]){
        ScrollBarTest a = new ScrollBarTest();
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
