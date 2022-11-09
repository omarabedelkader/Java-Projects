package swingdemo;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test extends JFrame{
    JPanel p2, p3, p4;

    
    Test(){
        setLayout(new GridLayout(2,2));
        
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();

        p2.setBackground(Color.blue);
        p3.setBackground(Color.red);
        p4.setBackground(Color.black);
        
        add(new test2());
        
        add(p3);
        add(p2);
        
        add(p4);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,500);//(w,h)
        setVisible(true);
    }
    
    public static void main(String args[]){
        new Test();
    }
}
