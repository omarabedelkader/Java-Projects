package swingdemo;

import java.awt.Color;
import javax.swing.*;

public class JScrollPaneDemo extends JFrame{
    JTextArea txtA;
    JScrollPane jsp;
    
    public JScrollPaneDemo(){
        super("JScrollPane Demonstration");
        setLayout(null);
        setSize(400, 400);
        setLocationRelativeTo(null);
        
        txtA = new JTextArea();
        txtA.setBackground(Color.YELLOW);
        txtA.setForeground(Color.BLUE);
        
        jsp = new JScrollPane(txtA, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(jsp).setBounds(20,20,340,320);
    }
    
    public static void main(String [] args){
        JScrollPaneDemo jspd = new JScrollPaneDemo();
        jspd.setVisible(true);
        jspd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
