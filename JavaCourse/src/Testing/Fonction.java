package Testing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fonction extends JFrame{
    
    JTextField output;
    JButton b[] = new JButton [17];
    String tit = "123+456-789/0.C*=";
    JPanel header, body, footer;
        
    Fonction(){
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for(int i=0; i<b.length; i++){
            b[i] = new JButton(tit.substring(i, i+1));
            b[i].addActionListener(new Traitement());
        }
        
        output = new JTextField(25);
        output.setEditable(false);
        
        header = new JPanel(new FlowLayout(FlowLayout.CENTER, 10 , 5));
        header.add(output);
        header.setBackground(Color.BLUE);
        
        body = new JPanel(new GridLayout(4,4 , 7, 5));
        for(int i=0; i< b.length-1; i++){
            body.add(b[i]);
        }
        body.setBackground(Color.CYAN);
        
        footer = new JPanel();
        footer.add(b[16]);
        footer.setBackground(Color.BLUE);
        
        Container c = getContentPane();
        c.setLayout(new BorderLayout(7, 7));
        c.add(BorderLayout.NORTH, header);
        c.add(BorderLayout.CENTER, body);
        c.add(BorderLayout.SOUTH, footer);
        pack();
        setVisible(true);
    }
    
    public class Traitement implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    
    public static void main(String args[]){
        Fonction f = new Fonction();
    }
}
