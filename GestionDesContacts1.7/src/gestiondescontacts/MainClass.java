package gestiondescontacts;

import java.io.IOException;

public class MainClass {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        View view = new View();
        ContactList contacts = new ContactList();
        GroupList groups = new GroupList();

        Controller c = new Controller(contacts, groups, view);

        c.update();
        
        
        
//        for(Record temp: c.getContactModel().getContactList()){
//            System.out.println(temp.showDetails() + " ");
//            for(Object[] temp1 : ((Contact)temp).getPhoneNumbers()){
//                for(int i = 0; i<temp1.length; i++){
//                    System.out.print(temp1[i] + "/");
//                }
//                System.out.println("");
//            }
//        }
        
        
        

    }
    
    

}
