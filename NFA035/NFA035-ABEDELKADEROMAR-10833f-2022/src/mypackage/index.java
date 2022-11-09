package mypackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class index {
    
	
	//Definition of ArrayList for the contact for showing them in JList 
    public static ArrayList <NewContact> contacts = new ArrayList<NewContact>();
    
    //Main Method
    public static void main(String [] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        contacts = ajoutercontact();
        MainFrame index = new MainFrame();
        index.setVisible(true);
    }
    
    public static ArrayList<NewContact> ajoutercontact() throws FileNotFoundException, IOException, ClassNotFoundException{
            ArrayList <NewContact> arr = new ArrayList<>();
            File f = new File("ContactData");
            boolean existe = true;
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            NewContact obj = null;

            while(existe){   
                    if (fis.available() != 0) {
                        obj = (NewContact) ois.readObject();
                        arr.add(obj);
                    } else {
                      existe = false;
                    }

            }    
            ois.close();
            return arr;
        }
}
