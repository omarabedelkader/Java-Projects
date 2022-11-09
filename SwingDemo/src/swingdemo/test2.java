package swingdemo;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test2 extends JPanel{
    JPanel p1 = new JPanel();
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1, b2;
    
    test2(){
        
    l1 = new JLabel("N1"); 
    l2 = new JLabel("N2");
    
    t1 = new JTextField(10);
    t2 = new JTextField(10);
        
    b1 = new JButton("plus");
    b2 = new JButton("minus");   
    
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(b1);
    add(b2);
    
    setLayout(new GridLayout(3, 2));
    
    ButtonHandler b = new ButtonHandler();
    b1.addActionListener(b);
    }
    
    class ButtonHandler  implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            t1.setText("result " + (Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText())));
        }
    }
    
}
