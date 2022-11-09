package NewWindow;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class OpenWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("hello");
    
    public OpenWindow(){
        
        label.setBounds(0,0,100,50);
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        frame.add(label);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
