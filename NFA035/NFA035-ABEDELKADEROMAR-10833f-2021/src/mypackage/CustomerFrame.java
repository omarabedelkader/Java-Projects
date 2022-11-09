package mypackage;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class CustomerFrame extends JFrame{	
	private static final long serialVersionUID = 1L;
	public String s1cu, s2cu, s3cu, s4cu, s5cu, s6cu, s7cu;
	private ArrayList<String> arraylistcustomer = new ArrayList<String>();
	
	private JLabel labelresultcustomer =new JLabel();
	
    private JLabel l1cu = new JLabel("Name");
    private JTextField name =new JTextField(6);
    
    private JLabel l2cu = new JLabel("Father Name");
    private JTextField fathername =new JTextField(6);
    
    private JLabel l3cu = new JLabel("Family Name");
    private JTextField familyname =new JTextField(6); 
    
    private JLabel l4cu = new JLabel("Date Of Birthday");
    private JTextField dateofbirth =new JTextField(6);
    
    private JLabel l5cu = new JLabel("Address");
    private JTextField address =new JTextField(6);  
    
    private JLabel l6cu = new JLabel("Mobile Number");
    private JTextField mobilenumber =new JTextField(6);
    
    private JLabel l7cu = new JLabel("Email");
    private JTextField email =new JTextField(6);
    
    private JPanel pcustomer =new JPanel();
	
	public CustomerFrame()
	{
		super("Customer");
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setSize(1400,500);
        this.setLocationRelativeTo( null );
        
        pcustomer.setBorder(new EmptyBorder(10, 10, 10, 10));
        
        s1cu=name.getText();
        s2cu=fathername.getText();
        s3cu=familyname.getText();
        s4cu=dateofbirth.getText();
        s5cu=address.getText();
        s6cu=mobilenumber.getText();
        s7cu=email.getText();
        
		Button b1cu = new Button("Save");
		b1cu.setBackground(Color.CYAN);
		actioncustomerinsert actionvehiculebutton =new actioncustomerinsert();
		b1cu.addActionListener(actionvehiculebutton);
		
		
		Button b2cu = new Button("Reset");
		b2cu.setBackground(Color.RED);
		actioncustomerdrop actionvehiculedropbutton =new actioncustomerdrop();
		b2cu.addActionListener(actionvehiculedropbutton);
		
		pcustomer.setBackground(Color.ORANGE);
		pcustomer.setLayout(new GridLayout(9, 2));

        pcustomer.add(l1cu);
        pcustomer.add(name);
        pcustomer.add(l2cu);
        pcustomer.add(fathername);
        pcustomer.add(l3cu);
        pcustomer.add(familyname);
        pcustomer.add(l4cu);
        pcustomer.add(mobilenumber);
        pcustomer.add(l5cu);
        pcustomer.add(dateofbirth);
        pcustomer.add(l6cu);
        pcustomer.add(email);
        pcustomer.add(l7cu);
        pcustomer.add(address);
        pcustomer.add(b2cu);
        pcustomer.add(b1cu);
        pcustomer.add(labelresultcustomer);
       
        add(pcustomer);  
        
        arraylistcustomer.add(s1cu);
        arraylistcustomer.add(s2cu);
        arraylistcustomer.add(s3cu);
        arraylistcustomer.add(s4cu);
        arraylistcustomer.add(s5cu);
        arraylistcustomer.add(s6cu);
        arraylistcustomer.add(s7cu);
        
	}
	public class actioncustomerinsert implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			labelresultcustomer.setText("Customer [ Name:" + name.getText() + ", Father Name :" + fathername.getText() + ", Family Name :" + familyname.getText()
					+ ", Date Of Birthday :" + dateofbirth.getText() + ", Address :" + address.getText() + ", Mobile Number :" + mobilenumber.getText()
					+ ", Email :" + email.getText() + "]");
		}
		
	}
	public class actioncustomerdrop implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
        	name.setText("");
        	fathername.setText("");
        	familyname.setText("");
        	dateofbirth.setText("");
        	address.setText("");
        	mobilenumber.setText("");
        	email.setText("");
			labelresultcustomer.setText("");
		}
		
	}

	public static void main(String[] args) {
		CustomerFrame CustomerFrame =new CustomerFrame();
		CustomerFrame.setVisible(true);

	}
}
