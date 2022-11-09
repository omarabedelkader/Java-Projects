package mypackage;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SettlementsFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private ArrayList<String> arraylistsettlements = new ArrayList<String>();
	
	private String s1set,s2set;
	
	private JLabel l1set=new JLabel("Please Check the Settlements did you want");
	private JLabel l2set=new JLabel("");
	private JLabel labelresultsettlements=new JLabel();
	
	private JRadioButton cash =new JRadioButton("Cash");
	
	private String settlementsstring[]={"","Two Settlements","Three Settlements","Four Settlements"}; 
	private JComboBox settlementscombobox = new JComboBox(settlementsstring);
	private JPanel psettlements =new JPanel();
	public SettlementsFrame()
	{
		super("Settlements");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,300);
		this.setLocationRelativeTo(null);
		
		
		settlementscombobox.setBounds(50, 50,90,20);
		psettlements.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		Button b1 = new Button("Save");
		b1.setBackground(Color.CYAN);	
		actionsettelementsinsert actionvehiculebutton =new  actionsettelementsinsert();
		b1.addActionListener(actionvehiculebutton);
		
		
		Button b2 = new Button("Reset");
		b2.setBackground(Color.RED);
		actionsettelementdrop actionvehiculedropbutton =new actionsettelementdrop();
		b2.addActionListener(actionvehiculedropbutton);
		
		cash.addItemListener(new changestateradio());
		settlementscombobox.addItemListener(new changestatecombobox());
		
		psettlements.setBackground(Color.ORANGE);
		psettlements.setLayout(new GridLayout(4,2));
		
		psettlements.add(l1set);
		psettlements.add(cash);
		psettlements.add(l2set);
		psettlements.add(settlementscombobox);
		psettlements.add(b2);
		psettlements.add(b1);
		psettlements.add(labelresultsettlements);
		
		add(psettlements);
		
		arraylistsettlements.add(s1set);
		arraylistsettlements.add(s2set);      
	}
	
	public class changestateradio implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(cash.isSelected()) {
				settlementscombobox.setVisible(false);
			}else {
				settlementscombobox.setVisible(true);
			}	
		}
	}
	
	public class changestateradio1 implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(cash.isSelected()) {
				settlementscombobox.setVisible(false);
			}else {
				settlementscombobox.setVisible(true);
			}	
		}
	}
	
	public class changestatecombobox implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				String s = (String)settlementscombobox.getSelectedItem();
				if(s.equals(""))
					cash.setVisible(true);
				if(s.equals("Two Settlements"))
					cash.setVisible(false);
				if(s.equals("Three Settlements"))
					cash.setVisible(false);
				if(s.equals("Four Settlements"))
					cash.setVisible(false);		
			}			
		}		
	}
	
	public class actionsettelementsinsert implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(cash.isSelected())
			{
				labelresultsettlements.setText("Settlements : cash");
			}
			else
			{
				labelresultsettlements.setText("Settlements :" + settlementscombobox.getSelectedItem());
			}
		}		
	}
	
	public class actionsettelementdrop implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			cash.setSelected(false);
			settlementscombobox.setSelectedIndex(0);
			labelresultsettlements.setText("");
			
		}	
	}
	
	public static void main(String[] args) {
		SettlementsFrame settlementsframe =new SettlementsFrame();
		settlementsframe.setVisible(true);		
	}
	


}

