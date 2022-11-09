package mypackage;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class InsurancePolicyFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	public String s1inpo, s2inpo ,s3inpo, s4inpo, s5inpo, s6inpo;
	private ArrayList<String> arraylistinsurancepolicy = new ArrayList<String>();
	
	private JLabel l1inpo = new JLabel("Number");
	private JTextField number =new JTextField(6);

	private JLabel l2inpo = new JLabel("Date");
	private JTextField date =new JTextField(6);

	private JLabel l3inpo = new JLabel("Terms");
	private JTextField terms =new JTextField(6);
    
	private JLabel l4inpo = new JLabel("Premium");
	private JTextField premium =new JTextField(6);
    
	private JLabel l5inpo = new JLabel("Coverage");
	private JTextField coverage =new JTextField(6);
    
	private JLabel l6inpo = new JLabel("Insurance Plan");
	private JTextField insuranceplan =new JTextField(6);
	
	private JLabel labelresultinsurancepolicy = new JLabel();
	
    private JPanel pinsurancepolicy =new JPanel();

	public InsurancePolicyFrame()
	{
		super("Insurance Policy");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1400, 500);
		this.setLocationRelativeTo(null);
		
		s1inpo=number.getText();
		s2inpo=date.getText();
		s3inpo=terms.getText();
		s4inpo=premium.getText();
		s4inpo=coverage.getText();
		s5inpo=insuranceplan.getText();
		
        
		pinsurancepolicy.setBorder(new EmptyBorder(10, 10, 10, 10));

		Button b1inpo = new Button("Save");
		b1inpo.setBackground(Color.CYAN);
		actioninsurancepolicyinsert actioninsurancepolicybutton =new actioninsurancepolicyinsert();
		b1inpo.addActionListener(actioninsurancepolicybutton);
		
		
		Button b2inpo = new Button("Reset");
		b2inpo.setBackground(Color.RED);
		actioninsurancepolicydrop actioninsurancepolicydropbutton =new actioninsurancepolicydrop();
		b2inpo.addActionListener(actioninsurancepolicydropbutton);
		
		pinsurancepolicy.setBackground(Color.ORANGE);	
        pinsurancepolicy.setLayout(new GridLayout(8,3));
	    
        pinsurancepolicy.add(l1inpo);
        pinsurancepolicy.add(number);
        pinsurancepolicy.add(l2inpo);
        pinsurancepolicy.add(date);
        pinsurancepolicy.add(l3inpo);
        pinsurancepolicy.add(terms);
        pinsurancepolicy.add(l4inpo);
        pinsurancepolicy.add(premium);
        pinsurancepolicy.add(l5inpo);
        pinsurancepolicy.add(coverage);
        pinsurancepolicy.add(l6inpo);
        pinsurancepolicy.add(insuranceplan);
        pinsurancepolicy.add(b2inpo);
        pinsurancepolicy.add(b1inpo);
        pinsurancepolicy.add(labelresultinsurancepolicy);
	    	
	    add(pinsurancepolicy);
	    
	    arraylistinsurancepolicy.add(s1inpo);
	    arraylistinsurancepolicy.add(s2inpo);
	    arraylistinsurancepolicy.add(s3inpo);
	    arraylistinsurancepolicy.add(s4inpo);
	    arraylistinsurancepolicy.add(s5inpo);
	    arraylistinsurancepolicy.add(s6inpo);
	}
	
	public class actioninsurancepolicyinsert implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			labelresultinsurancepolicy.setText("InsurancePolicy [Number=" + number.getText() + ", Date=" + date.getText() + ", Terms=" + terms.getText() + ", Premium=" + premium.getText()
			+ ", Coverage=" + coverage.getText() + ", Insuranceplan=" + insuranceplan.getText() + "]");
		}
		
	}
	
	public class actioninsurancepolicydrop implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			number.setText("");
			date.setText("");
			terms.setText("");
			premium.setText("");
			coverage.setText("");
			insuranceplan.setText("");
		     
		}	
	}
	public static void main(String[] args) {
		InsurancePolicyFrame InsurancePolicyFrame =new InsurancePolicyFrame();
		InsurancePolicyFrame.setVisible(true);

	}

}
