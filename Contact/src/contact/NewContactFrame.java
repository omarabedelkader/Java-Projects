package contact;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.*;

public class NewContactFrame extends JFrame{

		private static final long serialVersionUID = 1L;
		private JFrame frame;
		
/*****************************FRONT_END***********************************************/
		
		NewContactFrame()
		{
			definitioncomp();
			titlepanel();
			leftpanel(); 
			rigthpanelcontactbuttpageeng();
			rigthpaneldetails();
			mainrigthPanel();
			mainPanel();
			system();
	        
	        saveButt.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(firstnameTf.getText()==null && lastnameTf.getText()== null && cityTf.getText()==null && adressTf.getText()==null)
					{
						JOptionPane.showConfirmDialog(frame, "Un Contact doit avoir un first name, last name,un city, un adress");
					}else{
                                            String firstName = firstnameTf.getText();
                                            String lastName = lastnameTf.getText();
                                            String city = cityTf.getText();
                                            String adress = adressTf.getText();
                                            
                                            File f = new File("ContactData");

                                            if(f.exists()){
                                                try{
                                                FileOutputStream fos = new FileOutputStream(f, true);
                                                ObjectOutputStream os = new ObjectOutputStream(fos){
                                                    protected void writeStreamHeader() throws IOException{
                                                        reset();
                                                    }    
                                                };
                                                os.writeObject(new NewContact(firstName, lastName, city, adress));
                                                os.close();
                                                }catch(IOException ex){
                                                    ex.printStackTrace();
                                                }
                                            }else{
                                                try{
                                                    FileOutputStream fos = new FileOutputStream(f);
                                                    ObjectOutputStream os = new ObjectOutputStream(fos);
                                                    os.writeObject(new NewContact(firstName, lastName, city, adress));
                                                    os.close();
                                                }catch(IOException ex){
                                                    ex.printStackTrace();
                                                }
                                            }
                                        }
			
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
		
		JButton cancelButt,saveButt;
		JLabel titleLabel,newcontactlabel,firstnamelabel,lastnamelabel,citylabel,adresslabel,tabletitle,titlelistgroup;
		JTextField firstnameTf,lastnameTf,cityTf,adressTf;
		JPanel mainPanel, titlePanel, leftPanel, mainrigthPanel,rigthpanelcontactbuttpageend,rigthpaneldetails;
		JTable table;
		JScrollPane scrollpane;
		
		public void definitioncomp() {
			mainPanel = new JPanel();
			titlePanel = new JPanel();
			leftPanel = new JPanel();
			mainrigthPanel = new JPanel();
			rigthpanelcontactbuttpageend = new JPanel();
			rigthpaneldetails = new JPanel();
			
			titleLabel = new JLabel("Gestion des contacts");
			newcontactlabel = new JLabel("New Contact");
			firstnamelabel = new JLabel("First Name");
			lastnamelabel = new JLabel("Last Name");
			citylabel = new JLabel("City");
			adresslabel = new JLabel("Adresse");
			tabletitle = new JLabel("Phone Numbers");
			titlelistgroup = new JLabel("Add the contact to the groups");
			
			firstnameTf = new JTextField(15);
			lastnameTf = new JTextField(15);
			cityTf = new JTextField(15);
			adressTf = new JTextField(15);
		
			saveButt= new JButton("Save");
			cancelButt= new JButton("Cancel");
			
			String column[]={"Region Code","Phone Number"};
		    String data[][]={ {"",""}};
			try{
				table = new JTable(data,column);
			}catch(Exception e) {
				
			}
			
			scrollpane = new JScrollPane(table);
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
		    	newcontactlabel.setFont(newcontactlabelFont);
		    	newcontactlabel.setForeground(Color.RED);
		    	
				leftPanel.add(newcontactlabel);
		    	leftPanel.setBounds(10, 100, 150, 200);
		}
		
		public void rigthpanelcontactbuttpageeng() {
		    	FlowLayout rigthpanelcontactbuttpageendlayout =new FlowLayout();
		    	rigthpanelcontactbuttpageend.setLayout(rigthpanelcontactbuttpageendlayout);
		    	rigthpanelcontactbuttpageend.add(saveButt);
		    	rigthpanelcontactbuttpageend.add(cancelButt);
		}
		public void rigthpaneldetails() {

				rigthpaneldetails.setLayout(null);
				firstnamelabel.setBounds(0,10, 100, 25);firstnameTf.setBounds(70,10, 200, 25);
				lastnamelabel.setBounds(0, 35, 100, 25);lastnameTf.setBounds(70,35, 200, 25);
				citylabel.setBounds(0, 60, 100, 25);cityTf.setBounds(70, 60, 200, 25);
				adresslabel.setBounds(0,85,100,25);adressTf.setBounds(70,85,200,25);
				tabletitle.setBounds(120,120,100,25);
				scrollpane.setBounds(0,150,300,150);
				titlelistgroup.setBounds(80,300,200,25);
				
				
				rigthpaneldetails.add(firstnamelabel); rigthpaneldetails.add(firstnameTf);
				rigthpaneldetails.add(lastnamelabel); rigthpaneldetails.add(lastnameTf);
				rigthpaneldetails.add(citylabel); rigthpaneldetails.add(cityTf);
				rigthpaneldetails.add(adresslabel);rigthpaneldetails.add(adressTf);
				rigthpaneldetails.add(tabletitle);
				rigthpaneldetails.add(scrollpane);
				rigthpaneldetails.add(titlelistgroup);
				
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



