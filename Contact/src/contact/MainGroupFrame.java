package contact;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class MainGroupFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton addnewgroupButt,updategroupButt,deletegroupButt,cancelgroupButt;
	JLabel titlerigthpanelLabel,titleLabel,grouplabel;
	JPanel mainPanel, titlePanel, leftPanel, mainrigthPanel,rigthpanelcontactbuttpageendPanel,rigthpaneldetailsPanel;
	JTable tablegroup1, tablegroup2;

	
	MainGroupFrame(){

		
		String columntablegroup1[]={"Group Name","Nb Of Contact"};	
	    String datatablegroup1[][]={ {"101","Amit","670000"},    
	            {"102","Jai","780000"},    
	            {"101","Sachin","700000"}}; 
	    
		String columntablegroup2[]={"Contact Name","Contact Name"};	
	    String datatablegroup2[][]={ {"101","Amit","670000"},    
	            {"102","Jai","780000"},    
	            {"101","Sachin","700000"}}; 
	    
	    
			tablegroup1 = new JTable(datatablegroup1,columntablegroup1);
			tablegroup2 = new JTable(datatablegroup2,columntablegroup2);
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
	
    		Font titleFont = new Font("Ariel",Font.BOLD,24);
    		titleLabel.setFont(titleFont);
    		titleLabel.setForeground(Color.BLUE);
		
	
    		titlePanel.add(titleLabel);
    		titlePanel.setBounds(0, 0, 500, 30);
		
    		
	    	Font newcontactlabelFont = new Font("Ariel", Font.BOLD,20);
	    	grouplabel.setFont(newcontactlabelFont);
	    	grouplabel.setForeground(Color.RED);
	    	
			leftPanel.add(grouplabel);
	    	leftPanel.setBounds(10, 100, 150, 200);
	    	
    		leftPanel.add(addnewgroupButt);
    		leftPanel.setBounds(10, 100, 150, 200);
    	
        	FlowLayout rigthpanelcontactbuttpageendLayout =new FlowLayout();
        	rigthpanelcontactbuttpageendPanel.setLayout(rigthpanelcontactbuttpageendLayout);
        	rigthpanelcontactbuttpageendPanel.add(updategroupButt);
        	rigthpanelcontactbuttpageendPanel.add(deletegroupButt);
        	rigthpanelcontactbuttpageendPanel.add(cancelgroupButt);
    	
    		rigthpaneldetailsPanel.setLayout(null);
    		
    		titlerigthpanelLabel.setBounds(75,15,100,25);
    		tablegroup1.setBounds(100,50,150,150);
    		tablegroup2.setBounds(100,210,150,150);
			
    		rigthpaneldetailsPanel.add(tablegroup1);
    		rigthpaneldetailsPanel.add(tablegroup2);
    		rigthpaneldetailsPanel.add(titlerigthpanelLabel);
    		
    		
    		
    	    	mainrigthPanel.setBackground(Color.CYAN);
    	        mainrigthPanel.setBounds(170, 40, 355, 430);
    	        BorderLayout rigthLayout = new BorderLayout();
    	    	mainrigthPanel.setLayout(rigthLayout);
    	    	mainrigthPanel.add(rigthpanelcontactbuttpageendPanel,BorderLayout.PAGE_END);
    	    	mainrigthPanel.add(rigthpaneldetailsPanel,BorderLayout.CENTER);
    	    	
    	        mainPanel.setLayout(null);
    	        mainPanel.add(titlePanel);
    	        mainPanel.add(leftPanel);
    	        mainPanel.add(mainrigthPanel);
    	        
    	        
    	        
    	this.add(mainPanel);
        this.setSize(510, 510);
        this.setLocationRelativeTo(null);
        this.setTitle("Projet Finale- NFA035");
        this.setVisible(true);
        this.setResizable(false);
        
        
    		//ButtonHandlerupdate
		ButtonHandleraddnewgroup bhang = new ButtonHandleraddnewgroup();
		addnewgroupButt.addActionListener(bhang);
		
	//ButtonHandlerdelete
		ButtonHandlerupdategroup bhug = new ButtonHandlerupdategroup();
		updategroupButt.addActionListener(bhug);
		
    //ButtonHandlercancel
		ButtonHandlerdeletegroup bhdg = new ButtonHandlerdeletegroup();
		deletegroupButt.addActionListener(bhdg);
		
		ButtonHandlercancelgroup bhcg = new ButtonHandlercancelgroup();
		cancelgroupButt.addActionListener(bhcg);
	}
	
	protected class ButtonHandleraddnewgroup implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new NewGroupFrame();	
		}	
	}
	
	//Class for handling the button delete
	protected class ButtonHandlerupdategroup implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new UpdateGroupFrame();
		}	
	}
	
	protected class ButtonHandlercancelgroup implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new MainFrame();
		}	
	}

	protected class ButtonHandlerdeletegroup implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}	
	}

}
