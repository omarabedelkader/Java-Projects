package swingdemo;

import java.awt.*;
import javax.swing.*;

public class JTabbedPaneDemo extends JFrame{
    JTabbedPane xTBP;
    JPanel p1, p2;
    JLabel l1, l2;
    Font f;
    
    public JTabbedPaneDemo(){
        super("JTabbedPane Deomnstration");
        
        setLayout(new BorderLayout());
        setSize(300,200);
        setLocationRelativeTo(null);
        
        f = new Font("Comic Sans MS", Font.BOLD, 36);
        
        
        xTBP = new JTabbedPane();
        xTBP.setTabPlacement(JTabbedPane.TOP);
        
        p1 = new JPanel();
        p1.setBackground(Color.BLUE);
        p1.setLayout(new BorderLayout());
        
        p2 = new JPanel();
        p2.setBackground(Color.RED);
        p2.setLayout(new BorderLayout());
        
        l1 = new JLabel("This is TAB 1");
        l1.setFont(f);
        
        l2 = new JLabel("This is TAB 2");
        l2.setFont(f);
        
        p1.add(l1, BorderLayout.CENTER);
        p2.add(l2, BorderLayout.CENTER);
        
        xTBP.add("Demp tab 1", p1);
        xTBP.add("Demo Tab 1", p2);
        add(xTBP, BorderLayout.CENTER);
    }
    
    public static void main(String args[]){
        JTabbedPaneDemo tbpd = new JTabbedPaneDemo();
        tbpd.setVisible(true);
        tbpd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
