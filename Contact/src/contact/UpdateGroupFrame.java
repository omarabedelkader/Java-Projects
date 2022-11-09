package contact;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class UpdateGroupFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	
/*****************************FRONT_END***********************************************/
	
	UpdateGroupFrame()
	{
		definitioncomp();
		titlepanel();
		leftpanel(); 
		rigthpanelcontactbuttpageeng();
		rigthpaneldetails();
		mainrigthPanel();
		mainPanel();
		system();
        
        savegroupButt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		
			}});
        
 		cancelButt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 int output = JOptionPane.showConfirmDialog(frame, "Vous Voulez quittez cette fenetre","Projet Finale NFA035",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);

                 if(output == JOptionPane.YES_OPTION){
     				dispose();
    				new MainContactFrame();	
                 } else if(output == JOptionPane.NO_OPTION){
                    
                 } else if(output == JOptionPane.CANCEL_OPTION){
                   
                 }
			}});
	}		

/***********************************BACK_END*******************************************/
	
	JButton savegroupButt,cancelButt;
	JLabel titleLabel,groupnamelabel,descriptionlabel,newgrouplabel;
	JTextField groupnameTf,descriptionTf;
	JPanel mainPanel, titlePanel, leftPanel, mainrigthPanel,rigthpanelcontactbuttpageend,rigthpaneldetails;
	JTable table;
	
	public void definitioncomp() {
		mainPanel = new JPanel();
		titlePanel = new JPanel();
		leftPanel = new JPanel();
		mainrigthPanel = new JPanel();
		rigthpanelcontactbuttpageend = new JPanel();
		rigthpaneldetails = new JPanel();
		
		titleLabel = new JLabel("Gestion des contacts");
		newgrouplabel = new JLabel("New Group");
		groupnamelabel = new JLabel("Group Name");
		descriptionlabel = new JLabel("Desscription");
		
		groupnameTf = new JTextField(15);
		descriptionTf = new JTextField(15);
	
		savegroupButt= new JButton("Save Group");
		cancelButt= new JButton("Cancel");
		
		
		String column[]={"Region Code","Phone Number"};	
	    String data[][][]={{ {"101","Amit","sdfg"},    
                {"102","Jai","sdfgh"},    
                {"101","Sachin","werty"}}};  
		table = new JTable(data,column);
	
	}

	public void titlepanel(){
	    	Font titleFont = new Font("Ariel",Font.BOLD,24);
	    	titleLabel.setFont(titleFont);
	    	titleLabel.setForeground(Color.BLUE);
			
	    	titlePanel.add(titleLabel);
	    	titlePanel.setBounds(0, 0, 500, 30);
	}
	
	public void leftpanel() {
	    	Font newcontactlabelFont = new Font("Ariel", Font.BOLD,20);
	    	newgrouplabel.setFont(newcontactlabelFont);
	    	newgrouplabel.setForeground(Color.RED);
	    	
			leftPanel.add(newgrouplabel);
	    	leftPanel.setBounds(10, 100, 150, 200);
	}
	
	public void rigthpanelcontactbuttpageeng() {
	    	FlowLayout rigthpanelcontactbuttpageendlayout =new FlowLayout();
	    	rigthpanelcontactbuttpageend.setLayout(rigthpanelcontactbuttpageendlayout);
	    	rigthpanelcontactbuttpageend.add(savegroupButt);
	    	rigthpanelcontactbuttpageend.add(cancelButt);
	}
	public void rigthpaneldetails() {

			rigthpaneldetails.setLayout(null);
			groupnamelabel.setBounds(0,10, 100, 25);groupnameTf.setBounds(70,10, 200, 25);
			descriptionlabel.setBounds(0, 35, 100, 25);descriptionTf.setBounds(70,35, 200, 25);
			table.setBounds(0,75,300,150);
			
			
			rigthpaneldetails.add(groupnamelabel); rigthpaneldetails.add(groupnameTf);
			rigthpaneldetails.add(descriptionlabel); rigthpaneldetails.add(descriptionTf);
			rigthpaneldetails.add(table);

			
	}
	public void mainrigthPanel(){

	    	mainrigthPanel.setBackground(Color.CYAN);
	        mainrigthPanel.setBounds(170, 40, 355, 430);
	        BorderLayout rigthLayout = new BorderLayout();
	    	mainrigthPanel.setLayout(rigthLayout);
	    	mainrigthPanel.add(rigthpanelcontactbuttpageend,BorderLayout.PAGE_END);
	    	mainrigthPanel.add(rigthpaneldetails,BorderLayout.CENTER);
	}
	public void mainPanel() {	
	    	mainPanel.setLayout(null);
	        mainPanel.add(titlePanel);
	        mainPanel.add(leftPanel);
	        mainPanel.add(mainrigthPanel);
	    	}
	
	public void system() {
        this.add(mainPanel);
        this.setSize(510, 510);
        this.setLocationRelativeTo(null);
        this.setTitle("Projet Finale NFA035");
        this.setVisible(true);
        this.setResizable(false);
	}


}