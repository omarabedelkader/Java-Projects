package swingdemo;

import  java.awt.*;
import javax.swing.*;

public class JPanelDemo extends JFrame{
    JPanel p1, p2, p3;
    JLabel l1, l2, l3;
    
    public JPanelDemo(){
        super("JPanel Demonstration");
        setLayout(null); setSize (600,400); setLocationRelativeTo (null );
        
        p1 = new JPanel(); p1.setSize(300,200); p1.setBackground(Color.BLUE);
        p2 = new JPanel(); p2.setSize(300,200); p2.setBackground(Color.RED);
        p3 = new JPanel(); p3.setSize(600,200); p3.setBackground(Color.YELLOW);
        
        l1 = new JLabel ("Panel1"); p1.add(l1, SwingConstants.CENTER);
        l2 = new JLabel ("Panel2"); p2.add(l2, SwingConstants.CENTER);
        l3 = new JLabel ("Panel3"); p3.add(l3, SwingConstants.CENTER);
        
        add(p1).setBounds(0,0,300,200);
        add(p2).setBounds(300,0,300,200);
        add(p3).setBounds(0,200,600,200);
        
        changeFont(this,new Font("Comic Sans MS", Font.BOLD + Font.ITALIC ,36));
    }
    
    public static void changeFont(Component component, Font font){
        component.setFont (font);
        if (component instanceof Container)
            for(Component child : ((Container) component ).getComponents())
                changeFont(child , font);
    }
    
    public static void main(String args[]){
        JPanelDemo jpd = new JPanelDemo();
        jpd.setVisible(true);
        jpd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
