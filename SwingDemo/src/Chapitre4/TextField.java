package Chapitre4;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextField extends JFrame implements ActionListener{
    JTextField t,t1,t2;
    JPasswordField pass;
    
    TextField(){
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());
        
        t = new JTextField(10);
        add(t);
        
        t1 = new JTextField("Enter text here");
        add(t1);
        
        t2 = new JTextField("Uneditable text field", 21);
        t2.setEditable(false);
        add(t2);
        
        pass = new JPasswordField("Hidden Text");
        add(pass);
        
        t.addActionListener(this);
        t1.addActionListener(this);
        t2.addActionListener(this);
        pass.addActionListener(this);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event){
        String string = ""; // declare un string pour afficher

         // L’utilisateur presse ENTER en textField1
         if ( event.getSource() == t )
            string = String.format( "textField1: %s", event.getActionCommand() );
         // L’utilisateur presse ENTER en textField2
         else if ( event.getSource() == t1 )
            string = String.format( "textField2: %s", event.getActionCommand() );
         // L’utilisateur presse ENTER en textField3
         else if ( event.getSource() == t2 )
            string = String.format( "textField3: %s", event.getActionCommand() );

         // L’utilisateur presse ENTER en passwordField
         else if ( event.getSource() == pass )
            string = String.format( "passwordField: %s", 
		new String( pass.getPassword() ) );

         // afficher le contenu de JTextField 
         JOptionPane.showMessageDialog( null, string);
    }
    
    public static void main(String args[]){
        TextField t = new TextField();
        t.setSize(325,100);
        
        t.setDefaultCloseOperation(EXIT_ON_CLOSE);
        t.setVisible(true);
    }
}
