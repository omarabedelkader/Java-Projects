package mypackage;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ClaimsFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public String s1cl,s2cl,s3cl,s4cl;
	private ArrayList<String> arraylistclaims = new ArrayList<String>();
	
	private JLabel labelresultclaims =new JLabel();
	
	private JLabel l1cl =new JLabel("Number");
	private JTextField number=new JTextField(6);
	
	private JLabel l2cl = new JLabel("Current Date");	
	private JTextField currentdate  = new JTextField("");
	
	private JLabel l3cl = new JLabel("Accident Date");	
	private JTextField accidentdate  = new JTextField(6);
	
	private JLabel l4cl = new JLabel("Type");
	private String claimsstring[]={"","Car Accident","Health accident","Other"};
	private JComboBox claimscombobox =new JComboBox(claimsstring);
	
	private JLabel l5cl = new JLabel("A damage inventory");
	private JTextField adamageinventory = new JTextField(6);
	
	private JPanel pclaims = new JPanel();
	
	public ClaimsFrame()
	{
		super("Claims");
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setSize(1400, 500);
        this.setLocationRelativeTo( null );
        
        s1cl=number.getText();
        s2cl=currentdate.getText();
        s3cl=accidentdate.getText();
        s4cl=adamageinventory.getText();
        
     
		pclaims.setBorder(new EmptyBorder(10, 10, 10, 10));

		Button b1cl = new Button("Save");
		b1cl.setBackground(Color.CYAN);
		actionclaimsinsert actionclaimsbutton =new actionclaimsinsert();
		b1cl.addActionListener(actionclaimsbutton);
				
		Button b2cl = new Button("Reset");
		b2cl.setBackground(Color.RED);
		actionclaimsdrop actionclaimsframedropbutton =new actionclaimsdrop();
		b2cl.addActionListener(actionclaimsframedropbutton);

		pclaims.setBackground(Color.ORANGE);
		pclaims.setLayout(new GridLayout(7, 2));

		pclaims.add(l1cl);
		pclaims.add(number);
		pclaims.add(l2cl);
		pclaims.add(currentdate);
		pclaims.add(l3cl);
		pclaims.add(accidentdate);
		pclaims.add(l4cl);
		pclaims.add(claimscombobox);
		pclaims.add(l5cl);
		pclaims.add(adamageinventory);
		pclaims.add(b2cl);
		pclaims.add(b1cl);
		pclaims.add(labelresultclaims);
			
		add(pclaims);

		arraylistclaims.add(s1cl);
		arraylistclaims.add(s2cl);
		arraylistclaims.add(s3cl);
		arraylistclaims.add(s4cl);
	
	}
	
	public class actionclaimsinsert implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			labelresultclaims.setText("Claims [Number :" + number.getText() + ", Current Date :" + currentdate.getText() + ", Accident Date : " + accidentdate.getText()
					+", Type : "+ claimscombobox.getSelectedItem() + ", A Damage Inventory : " + adamageinventory.getText() + "]");
		}
		
	}
	
	public class actionclaimsdrop implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			number.setText("");
			currentdate.setText("");
			accidentdate.setText("");
			claimscombobox.setSelectedIndex(0);
			adamageinventory.setText("");
			labelresultclaims.setText("");
		}	
	}
	
	public static void main(String[] args) {
		ClaimsFrame claimsframe = new ClaimsFrame();
		claimsframe.setVisible(true);

	}
}
	
