package mypackage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class VehicleFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	public String s1v, s2v, s3v, s4v, s5v, s6v, s7v;
	private ArrayList<String> arraylistvehicule = new ArrayList<String>();
	
	private JLabel labelresultvehicle =new JLabel();
	
	private JLabel l1v =new JLabel("Plate Number");
	private JTextField platenumber=new JTextField(6);
	
	private JLabel l2v = new JLabel("Model");	
	private JTextField model = new JTextField("");
	
	private JLabel l3v = new JLabel("Vin Number");	
	private JTextField vinnumber = new JTextField(6);
	
	private JLabel l4v = new JLabel("Company");
	private JTextField company = new JTextField(6);
	
	private JLabel l5v = new JLabel("Type");
	private JTextField type = new JTextField(6);
	
	private JLabel l6v = new JLabel("Current Situation");
	private JTextField currentsituation = new JTextField(6);
	
	private JLabel l7v = new JLabel("Statues");
	private JTextField statues = new JTextField(6);
	
	private JPanel pvehicle = new JPanel();
	
	public VehicleFrame() {
		super("Vehicle");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1400, 500);
		this.setLocationRelativeTo(null);
		
		s1v=platenumber.getText();
		s2v=model.getText();
		s3v=vinnumber.getText();
		s4v=company.getText();
		s5v=type.getText();
		s6v=currentsituation.getText();
		s7v=statues.getText();
		
		pvehicle.setBorder(new EmptyBorder(10, 10, 10, 10));

		Button b1v = new Button("Save");
		b1v.setBackground(Color.CYAN);
		actionvehiculeinsert actionvehiculeframebutton =new actionvehiculeinsert();
		b1v.addActionListener(actionvehiculeframebutton);
		
		
		Button b2v = new Button("Reset");
		b2v.setBackground(Color.RED);
		actionvehiculedrop actionvehiculedropbutton =new actionvehiculedrop();
		b2v.addActionListener(actionvehiculedropbutton);

		pvehicle.setBackground(Color.ORANGE);
		pvehicle.setLayout(new GridLayout(9, 2));

		pvehicle.add(l1v);
		pvehicle.add(platenumber);
		pvehicle.add(l2v);
		pvehicle.add(model);
		pvehicle.add(l3v);
		pvehicle.add(vinnumber);
		pvehicle.add(l4v);
		pvehicle.add(company);
		pvehicle.add(l5v);
		pvehicle.add(type);
		pvehicle.add(l6v);
		pvehicle.add(currentsituation);
		pvehicle.add(l7v);
		pvehicle.add(statues);
		pvehicle.add(b2v);
		pvehicle.add(b1v);
		pvehicle.add(labelresultvehicle);
			
		add(pvehicle);

		arraylistvehicule.add(s1v);
		arraylistvehicule.add(s2v);
		arraylistvehicule.add(s3v);
		arraylistvehicule.add(s4v);
		arraylistvehicule.add(s5v);
		arraylistvehicule.add(s6v);
		arraylistvehicule.add(s7v);
	
	}
	public class actionvehiculeinsert implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			labelresultvehicle.setText("Vehicle [ Plate Number :" + platenumber.getText() + ", Model :" + model.getText() + ", Vin Number :" + vinnumber.getText() + ", Company="
					+ company.getText() + ", Type :" + type.getText() + ", Current Situation :" + currentsituation.getText() + ", Statues: " + statues.getText() + "]");
		}
		
	}
	public class actionvehiculedrop implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			platenumber.setText("");
			model.setText("");
			vinnumber.setText("");
			company.setText("");
			type.setText("");
			currentsituation.setText("");
			statues.setText("");
			labelresultvehicle.setText("");
		}	
	}
	public static void main(String[] args) {
		VehicleFrame VehicleFrame = new VehicleFrame();
		VehicleFrame.setVisible(true);

	}
	
}
