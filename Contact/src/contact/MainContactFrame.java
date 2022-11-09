package contact;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

public class MainContactFrame extends JFrame {
    
	
        
	private static final long serialVersionUID = 1L;
	
/*****************************FRONT_END***********************************************/
	
	MainContactFrame()
	{
		definitioncomp(); 
		title();    
		titlepanel();
		leftpanel();
    	rigthpanelcontactbuttpageend(); 
    	rigthpaneldetails();
    	mainrigthpanel();	
    	mainpanel();
    	system();
    	
    	//Handling of button sort by first name
    		ButtonHandlersortbyfirstname bhsbfn = new ButtonHandlersortbyfirstname();
    		sortbyfirstnameButt.addActionListener(bhsbfn);
    	
    	//Handling of button sort last name
    		ButtonHandlersortbylstaname bhsbln = new ButtonHandlersortbylstaname();
    		sortbylastnameButt.addActionListener(bhsbln);
    		
    	//Handling of button sort city
    		ButtonHandlersortbycity bhsbc = new ButtonHandlersortbycity();
    		sortbycityButt.addActionListener(bhsbc);
    	
    	//Handling of button add new contact
			ButtonHandleraddnewcontact bhanc = new ButtonHandleraddnewcontact();
			addnewcontactButt.addActionListener(bhanc);
		
	    //ButtonHandlerview
			ButtonHandlerview bhv = new ButtonHandlerview();
			viewButt.addActionListener(bhv);
	    	
		//ButtonHandlerupdate
			ButtonHandlerupdate bhu = new ButtonHandlerupdate();
			updateButt.addActionListener(bhu);
			
		//ButtonHandlerdelete
			ButtonHandlerdelete bhd = new ButtonHandlerdelete();
			deleteButt.addActionListener(bhd);
			
	    //ButtonHandlercancel
			ButtonHandlercancel bhc = new ButtonHandlercancel();
			cancelButt.addActionListener(bhc);
			
			
	}

	
	
/***********************************BACK_END*******************************************/

	JButton sortbyfirstnameButt,sortbylastnameButt,sortbycityButt,addnewcontactButt,viewButt,deleteButt,updateButt,cancelButt;
	JLabel searchLabel,titleLabel;
	JTextField searchTF;
	JPanel mainPanel, titlePanel, leftPanel, mainrigthPanel,rigthpanelcontactbuttpageend,rigthpaneldetails;
	JList<?> contactlist;
	
	
	// The part for the Definition for the componments
	protected void definitioncomp() {
		mainPanel = new JPanel();
		titlePanel = new JPanel();
		leftPanel = new JPanel();
		mainrigthPanel = new JPanel();
		rigthpaneldetails = new JPanel();
		rigthpanelcontactbuttpageend = new JPanel();
		
		titleLabel = new JLabel("Gestion des contacts");
		searchLabel = new JLabel("Search");
		
		searchTF = new JTextField(15);
		
		sortbyfirstnameButt = new JButton("Sort By First Name");
		sortbylastnameButt = new JButton("Sort By Last Name");
		sortbycityButt = new JButton("Sort By City");
		addnewcontactButt = new JButton("Add New Contact");
		viewButt = new JButton("View");
		deleteButt = new JButton("Delete");
		updateButt= new JButton("Update");
		cancelButt= new JButton("Cancel");
		
                
                String arr[] = new String[Index.contacts.size()];
                int i = 0;
                Iterator <NewContact> iter = Index.contacts.iterator();
                        while(iter.hasNext()){
                            NewContact nc = iter.next();
                            arr[i] = nc.getFirstname() + " " + nc.getLastname() + " - " + nc.getCity();
                            i ++;
                        }
		contactlist = new JList(arr);
                
                contactlist.setVisibleRowCount(4);
                
		
	}  
	
	// Definition and description for the title
	protected void title(){
    	Font titleFont = new Font("Ariel",Font.BOLD,24);
    	titleLabel.setFont(titleFont);
    	titleLabel.setForeground(Color.BLUE);
		
	}
	
	//title panel
	protected void titlepanel(){
    	titlePanel.add(titleLabel);
    	titlePanel.setBounds(0, 0, 500, 30);
		
	}
	
	//Description of left panel
	protected void leftpanel(){
    	leftPanel.add(sortbyfirstnameButt);
    	leftPanel.add(sortbylastnameButt);
    	leftPanel.add(sortbycityButt );
    	leftPanel.add(addnewcontactButt);
    	leftPanel.setBounds(10, 100, 150, 200);
	}
	
	//Description of the bottom button in contact frame
	protected void rigthpanelcontactbuttpageend(){
    	FlowLayout rigthpanelcontactbuttpageendLayout =new FlowLayout();
    	rigthpanelcontactbuttpageend.setLayout(rigthpanelcontactbuttpageendLayout);
    	rigthpanelcontactbuttpageend.add(viewButt);
    	rigthpanelcontactbuttpageend.add(updateButt);
    	rigthpanelcontactbuttpageend.add(deleteButt);
    	rigthpanelcontactbuttpageend.add(cancelButt);
		
	}
	
	//Description of the right panel exception the panel of bottom panel
	protected void rigthpaneldetails()
	{
		rigthpaneldetails.setLayout(null);
		searchLabel.setBounds(0,10, 100, 25);searchTF.setBounds(70,10, 200, 25);
		contactlist.setBounds(10, 40, 300,350);
		rigthpaneldetails.add(searchLabel);
		rigthpaneldetails.add(searchTF);
		rigthpaneldetails.add(contactlist);
		
	}
	
	//Description of all panel in rigth side (rigthpaneldetails, rigthpanelcontactbuttpageend)
	protected void mainrigthpanel(){
    	mainrigthPanel.setBackground(Color.CYAN);
        mainrigthPanel.setBounds(170, 40, 355, 430);
        BorderLayout rigthLayout = new BorderLayout();
    	mainrigthPanel.setLayout(rigthLayout);
    	mainrigthPanel.add(rigthpanelcontactbuttpageend,BorderLayout.PAGE_END);
    	mainrigthPanel.add(rigthpaneldetails,BorderLayout.CENTER);
	}
	
	//Description the main panel (left side panel and rigth panel side)
	protected void mainpanel() {
        mainPanel.setLayout(null);
        mainPanel.add(titlePanel);
        mainPanel.add(leftPanel);
        mainPanel.add(mainrigthPanel);
		
	}
	
	//Function for the System 
	protected void system() {
        this.add(mainPanel);
        this.setSize(510, 510);
        this.setLocationRelativeTo(null);
        this.setTitle("Projet Finale NFA035");
        this.setVisible(true);
        this.setResizable(false);
		
	}

	//Class for handling the button Sort by first name
	protected class ButtonHandlersortbyfirstname implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}	
	}
	
	//Class for handling the button sort by last name
	protected class ButtonHandlersortbylstaname implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}	
	}
	
	//Class fir handling the button sort by city
	protected class ButtonHandlersortbycity implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}	
	}
	
	//Class fir handling the button add new contact
	protected class ButtonHandleraddnewcontact implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new NewContactFrame();	
		}	
	}
	
	//Class for handling the button view
	protected class ButtonHandlerview implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new ViewContactFrame();
		}	
	}
	
	//Class for handling the button update
	protected class ButtonHandlerupdate implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new UpdateContactFrame();	
		}	
	}
	
	//Class for handling the button delete
	protected class ButtonHandlerdelete implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}	
	}
	
	//Class fir handling the button cancel
	protected class ButtonHandlercancel implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new MainFrame();	
			
		}	
	}
}
