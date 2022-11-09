package Chapitre4;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label extends JFrame{
    JLabel l;
    
    Label(){
        l = new JLabel("Hello");
        setSize(500,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(l);
        l.setBounds(100,50,5,50);
        
        setVisible(true);
    }
    
    public static void main(String args[]){
        new Label();
    }
}
