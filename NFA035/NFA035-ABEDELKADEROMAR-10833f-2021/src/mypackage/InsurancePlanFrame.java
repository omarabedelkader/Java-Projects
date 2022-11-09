package mypackage;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class InsurancePlanFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	public String s1inpl, s2inpl, s3inpl, s4inpl, s5inpl;
	private ArrayList<String> arraylistinsuranceplan = new ArrayList<String>();
	
	private JLabel labelresultinsuranceplan =new JLabel();
	
    private Checkbox obligatoryinsurance =new Checkbox("Obligatory Insurance");      
    private Checkbox allriskinsurance =new Checkbox("All-risk Insurance");        
    private Checkbox vehicledamageinsurance =new Checkbox("Vehicle damage insurance");      
    private Checkbox thepersonalinsuranceofthedriver =new Checkbox("The personal insurance of the driver");
    private Checkbox assistance =new Checkbox("Assistance");
	
	public InsurancePlanFrame()
	{
		super("Insurance Plan");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 500);
		this.setLocationRelativeTo(null);;
        
		JPanel pinsuranceplan = new JPanel();
		pinsuranceplan.setBorder(new EmptyBorder(10, 10, 10, 10));

		Button b1inpl = new Button("Save");
		b1inpl.setBackground(Color.CYAN);
		actioninsuranceplaninsert actionvehiculebutton =new actioninsuranceplaninsert();
		b1inpl.addActionListener(actionvehiculebutton);
		
		
		Button b2inpl = new Button("Reset");
		b2inpl.setBackground(Color.RED);
		actioninsuranceplandrop actionvehiculedropbutton =new actioninsuranceplandrop();
		b2inpl.addActionListener(actionvehiculedropbutton);

		pinsuranceplan.setBackground(Color.ORANGE);
		pinsuranceplan.setLayout(new GridLayout(9, 2));
	    
        pinsuranceplan.add(obligatoryinsurance);
        pinsuranceplan.add(allriskinsurance);
        pinsuranceplan.add(vehicledamageinsurance);
        pinsuranceplan.add(thepersonalinsuranceofthedriver);
        pinsuranceplan.add(assistance);
        pinsuranceplan.add(b2inpl);
        pinsuranceplan.add(b1inpl);
        pinsuranceplan.add(labelresultinsuranceplan);
	    	
	    add(pinsuranceplan);
		arraylistinsuranceplan.add(s1inpl);
	    arraylistinsuranceplan.add(s2inpl);
	    arraylistinsuranceplan.add(s3inpl);
	    arraylistinsuranceplan.add(s4inpl);
	    arraylistinsuranceplan.add(s5inpl);
	}
	
	public class actioninsuranceplaninsert implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			labelresultinsuranceplan.setText("Ok");
		}
		
	}
	
	public class actioninsuranceplandrop implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		     obligatoryinsurance.setState(false);   
		     allriskinsurance.setState(false); 
		     vehicledamageinsurance.setState(false);  
		     thepersonalinsuranceofthedriver.setState(false); 
		     assistance.setState(false);
		     labelresultinsuranceplan.setText("");
		     
		}	
	}

	public static void main(String[] args) {
		
		InsurancePlanFrame insuranceplanframe = new InsurancePlanFrame();
		insuranceplanframe.setVisible(true);
		

	}

}
