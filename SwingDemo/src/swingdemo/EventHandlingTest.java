package swingdemo;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EventHandlingTest extends JFrame{
    JTextField t1,t2;
    JLabel l1, l2, m1 ,m2;
    JButton b;
    
    EventHandlingTest(){
        setSize(300, 160);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        t1 = new JTextField();
        t2 = new JTextField(); t2.setEditable(false);
        
        l1 = new JLabel("Name");
        l2 = new JLabel("Grade");
        m1 = new JLabel();
        m2 = new JLabel();
        
        b = new JButton("idle");
        
        add(l1).setBounds(10,10,50,25);
        add(t1).setBounds(60,10,100,25);
        add(l2).setBounds(10,45,50,25);
        add(t2).setBounds(60,45,100,25);
        add(m1).setBounds(180,10,120,25);
        add(m2).setBounds(180,45,120,25);
        add(b).setBounds(60,80,80,30);
        
        FocusHandler f = new FocusHandler();
        
        t1.addFocusListener(f);
        t2.addFocusListener(f);
        
        setVisible(true);
        
    }

    public class FocusHandler implements FocusListener{
        public void focusGained(FocusEvent fe) {
            if(fe.getSource() == t1)
                m1.setText("Focus Gained");
            if(fe.getSource() == t2)
                m2.setText("Focus Gained");
        }

        public void focusLost(FocusEvent fe) {
            if(fe.getSource() == t1)
                m1.setText("Focus Lost");
            if(fe.getSource() == t2)
                m2.setText("Focus Lost");
        }
    }
    
        public static void main(String args[]){
        new EventHandlingTest();
    }
}
