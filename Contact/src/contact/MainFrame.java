package contact;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
  
	private static final long serialVersionUID = 1L;
    
/*****************************FRONT_END***********************************************/
     MainFrame(){
    	 
    	definitioncomp();
    	title();
    	titlepanel();
    	leftpanel();
    	rigthpanel();
        mainpanel();
        system();
	     
	     //Button Handler Contact
	        ButtonHandlerContact bhc = new ButtonHandlerContact();
	        contactsButt.addActionListener(bhc);
	      
	     //Button Handler Group
	        ButtonHandlerGroup bhg = new ButtonHandlerGroup();
	        groupsButt.addActionListener(bhg);
	             
    }
     
     
     
/***********************************BACK_END*******************************************/
 	JPanel mainPanel, titlePanel, leftPanel, rigthPanel;
    JLabel titleLabel;
    JButton contactsButt, groupsButt;
    
     public void definitioncomp(){
    	 
 		mainPanel = new JPanel();
     	titlePanel = new JPanel();
     	leftPanel = new JPanel();
     	rigthPanel = new JPanel();
     	titleLabel = new JLabel("Gestion des contacts");
     	contactsButt = new JButton("Contacts");
     	groupsButt = new JButton("Groups");
 	}
    
    public void title(){
    	Font titleFont = new Font("Ariel",Font.BOLD,24);
    	titleLabel.setFont(titleFont);
    	titleLabel.setForeground(Color.BLUE);
    }
    
    public void titlepanel(){
    	titlePanel.add(titleLabel);
    	titlePanel.setBounds(0, 0, 500, 30);   	
    }
    
    public void leftpanel()
    {
    	leftPanel.add(contactsButt);
    	leftPanel.add(groupsButt);
    	GridLayout leftLayout = new GridLayout(2,1);
    	leftLayout.setVgap(25);
    	leftPanel.setLayout(leftLayout);
    	leftPanel.setBounds(10, 100, 100, 90);
    } 
    
    public void rigthpanel(){
    	rigthPanel.setBackground(Color.CYAN);
    	rigthPanel.setLayout(null);
        rigthPanel.setBounds(130, 40, 355, 430);
    }
    
    public void mainpanel(){
        mainPanel.setLayout(null);
        mainPanel.add(rigthPanel);
        mainPanel.add(titlePanel);
        mainPanel.add(leftPanel);
    }
    
    public void system(){
    	this.add(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(510, 510);
        this.setLocationRelativeTo(null);
        this.setTitle("Projet Finale NFA035");
        this.setVisible(true);
        this.setResizable(false);	
    }
    
    public class ButtonHandlerContact implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
				dispose();
				new MainContactFrame();	
		}  	
    }
    
    public class ButtonHandlerGroup implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
				dispose();
				new MainGroupFrame();		
		}	
    }
    
}
