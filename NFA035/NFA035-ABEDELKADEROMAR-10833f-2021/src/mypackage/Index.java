package mypackage;
import java.awt.Color;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Index extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JMenu mainmenu;
	private JMenu register;
	private JMenu iteofaa ;
	
	private JMenuBar mb ;
	
	private JMenuItem customer;
	private JMenuItem claims;
	private JMenuItem vehicle;
	private JMenuItem settlements;
	private JMenuItem insurancepolicy;
	private JMenuItem insuranceplan;
	
	public Index()
	{
		super("Car Insurance");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1500,500);
		this.setLocationRelativeTo(null);
		
		mainmenu = new JMenu("Menu");
		register =new JMenu("Register");
		iteofaa =new JMenu("In the event of an accident");
		
		mb =new JMenuBar();
		customer=new JMenuItem("Customer");
		claims=new JMenuItem("Claims");
		vehicle=new JMenuItem("Vehicle");
		settlements=new JMenuItem("Settlements");
		insurancepolicy=new JMenuItem("Insurance Policy");
		insuranceplan=new JMenuItem("Insurance Plan");
		
		
		
		JPanel pindex =new JPanel();
		pindex.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		register.add(customer);
		register.add(vehicle);
		register.add(settlements);
		register.add(insurancepolicy);
		register.add(insuranceplan);	
  	    iteofaa.add(claims);

  	    mainmenu.add(register);  
  	    mainmenu.add(iteofaa);
  	    
  	    mb.add(mainmenu); 
  	    setJMenuBar(mb); 
  	    
  	    pindex.setBackground(Color.ORANGE);
  	    
  	    mainmenu.addMenuListener(new SampleMenuListener());
  	    register.addMenuListener(new SampleMenuListener());
  	    
  	    add(pindex);
  	    
	}
	
	public class SampleMenuListener implements MenuListener{

		@Override
		public void menuSelected(MenuEvent e) {
			if(e.getSource().equals(register))
			{
				if(e.getSource().equals(customer))
				{
					CustomerFrame customerframe =new CustomerFrame();
					customer.setVisible(true);
				}
				else if(e.getSource().equals(vehicle))
				{
					VehicleFrame vehicleframe =new VehicleFrame();
				}
				else if(e.getSource().equals(settlements))
				{
					SettlementsFrame settlementsframe =new SettlementsFrame();
				}
				else if(e.getSource().equals(insurancepolicy))
				{
					InsurancePolicyFrame insurancepolicyframe =new InsurancePolicyFrame();
				}
				else if(e.getSource().equals(insuranceplan))
				{
					InsurancePlanFrame insuranceplanframe =new InsurancePlanFrame();
				}
			}
			else if(e.getSource().equals(iteofaa))
			{
				if(e.getSource().equals(claims)) 
				{
					if(e.getSource().equals(claims))
					{
						ClaimsFrame claimsframe =new ClaimsFrame();
						claimsframe.setVisible(true);
					}
				}
			}
			
		}

		@Override
		public void menuDeselected(MenuEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void menuCanceled(MenuEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	public static void main(String[] args) {
		Index index = new Index();
		index.setVisible(true);

	}
	
}