package NewWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;


public class Window implements ActionListener{
    JFrame frame = new JFrame();
    JButton button = new JButton("click me");
    
    public Window(){
        frame.add(button);
        button.setBounds(150,150,100,100);
        button.setFocusable(false);
        button.addActionListener(this);
        
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            new OpenWindow();
        }
    }
}
