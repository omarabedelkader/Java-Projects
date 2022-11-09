package mypackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainGroupFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
/*****************************FRONT_END***********************************************/
		MainGroupFrame(){
		
			definitioncomp();
			title();
			titlepanel();
			leftpanel(); 
			rigthpanelcontactbuttpageeng();
			rigthpaneldetails();
			mainrigthPanel();
			mainPanel();
			system();
        
			//Button Handler for adding new group
			ButtonHandleraddnewgroup bhang = new ButtonHandleraddnewgroup();
			addnewgroupButt.addActionListener(bhang);
		
			//Button Handler for updating a group
			ButtonHandlerupdategroup bhug = new ButtonHandlerupdategroup();
			updategroupButt.addActionListener(bhug);
		
			//Button Handler for deleting a group
			ButtonHandlerdeletegroup bhdg = new ButtonHandlerdeletegroup();
			deletegroupButt.addActionListener(bhdg);
			
			//Button Handler for canceling a group
			ButtonHandlercancelgroup bhcg = new ButtonHandlercancelgroup();
			cancelgroupButt.addActionListener(bhcg);
			
		}
	
/***********************************BACK_END*******************************************/
	
		JButton addnewgroupButt,updategroupButt,deletegroupButt,cancelgroupButt;
		JLabel titlerigthpanelLabel,titleLabel,grouplabel;
		JPanel mainPanel, titlePanel, leftPanel, mainrigthPanel,rigthpanelcontactbuttpageendPanel,rigthpaneldetailsPanel;
		JTable tablegroup1, tablegroup2;
		JScrollPane scrollpanetablegroup1,scrollpanetablegroup2;
		
		//Definition for the componments
		public void definitioncomp() {
			mainPanel = new JPanel();
			titlePanel = new JPanel();
			leftPanel = new JPanel();
			mainrigthPanel = new JPanel();
			rigthpaneldetailsPanel = new JPanel();
			rigthpanelcontactbuttpageendPanel = new JPanel();
		
			titleLabel = new JLabel("Gestion des contacts");
			titlerigthpanelLabel = new JLabel("List Of Groups");
			grouplabel = new JLabel("Group");
	
			addnewgroupButt = new JButton("Add New Group");
			updategroupButt = new JButton("Update");
			deletegroupButt = new JButton("Delete");
			cancelgroupButt = new JButton("Cancel");
			
			String columntablegroup1[]={"Region Code","Phone Number"};
		    String datatablegroup1[][]={ {"",""}};
			try{
				tablegroup1 = new JTable(datatablegroup1,columntablegroup1);
			}catch(Exception e) {
				
			}
			scrollpanetablegroup1 = new JScrollPane(tablegroup1);
			
			String columntablegroup2[]={"Contact Name","Contact City"};
		    String datatablegroup2[][]={ {"",""}};
			try{
				tablegroup2 = new JTable(datatablegroup2,columntablegroup2);
			}catch(Exception e) {
				
			}
			scrollpanetablegroup2 = new JScrollPane(tablegroup2);	
		}

		// Definition and description for the title
		public void title(){
    		Font titleFont = new Font("Ariel",Font.BOLD,24);
    		titleLabel.setFont(titleFont);
    		titleLabel.setForeground(Color.BLUE);
		}
		
    	//Title panel
    	public void titlepanel(){
    	    titlePanel.add(titleLabel);
    	    titlePanel.setBounds(0, 0, 500, 30);   	
    	}
    	
    	//Description of left panel
		public void leftpanel() {
	    	Font newcontactlabelFont = new Font("Ariel", Font.BOLD,20);
	    	grouplabel.setFont(newcontactlabelFont);
	    	grouplabel.setForeground(Color.RED);
	    	
			leftPanel.add(grouplabel);
	    	leftPanel.setBounds(10, 100, 150, 200);
    		leftPanel.add(addnewgroupButt);
    		leftPanel.setBounds(10, 100, 150, 200);
		}
		
		//Description of the bottom button in group frame
		public void rigthpanelcontactbuttpageeng() {
        	FlowLayout rigthpanelcontactbuttpageendLayout =new FlowLayout();
        	rigthpanelcontactbuttpageendPanel.setLayout(rigthpanelcontactbuttpageendLayout);
        	rigthpanelcontactbuttpageendPanel.add(updategroupButt);
        	rigthpanelcontactbuttpageendPanel.add(deletegroupButt);
        	rigthpanelcontactbuttpageendPanel.add(cancelgroupButt);
		}
		
		//Description the main rigth panel details
		public void rigthpaneldetails() {
    		rigthpaneldetailsPanel.setLayout(null);
    		titlerigthpanelLabel.setBounds(75,15,100,25);
    		scrollpanetablegroup1.setBounds(100,50,200,150);
    		scrollpanetablegroup2.setBounds(100,210,200,150);
    		rigthpaneldetailsPanel.add(titlerigthpanelLabel);
    		rigthpaneldetailsPanel.add(scrollpanetablegroup1);
    		rigthpaneldetailsPanel.add(scrollpanetablegroup2);
		}
		
		//Description the main rigth panel
		public void mainrigthPanel(){
    	    mainrigthPanel.setBackground(Color.CYAN);
    	    mainrigthPanel.setBounds(170, 40, 355, 430);
    	    BorderLayout rigthLayout = new BorderLayout();
    	    mainrigthPanel.setLayout(rigthLayout);
    	    mainrigthPanel.add(rigthpanelcontactbuttpageendPanel,BorderLayout.PAGE_END);
    	    mainrigthPanel.add(rigthpaneldetailsPanel,BorderLayout.CENTER);
		}
		
		//Description the main panel (left side panel and rigth panel side)
    	public void mainPanel(){	   	
    	    mainPanel.setLayout(null);
    	    mainPanel.add(titlePanel);
    	    mainPanel.add(leftPanel);
    	    mainPanel.add(mainrigthPanel);
    	 }  
    	
    	//Function for the System     
    	public void system(){    
    		this.add(mainPanel);
    		this.setSize(510, 510);
    		this.setLocationRelativeTo(null);
    		this.setTitle("Projet Finale- NFA035");
    		this.setVisible(true);
    		this.setResizable(false);
    	}
    	
    	//Class for handling the button add new group
    	protected class ButtonHandleraddnewgroup implements ActionListener{
    		@Override
    		public void actionPerformed(ActionEvent e) {
			dispose();
			new NewGroupFrame();	
			}	
		}
    	
    	//Class for handling the button update group
		protected class ButtonHandlerupdategroup implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new UpdateGroupFrame();
			}	
		}
		
		//Class for handling the button cancel page
		protected class ButtonHandlercancelgroup implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MainFrame();
			}	
		}
		
		//Class for handling the button delete group
		protected class ButtonHandlerdeletegroup implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}	
		}
	
	}
