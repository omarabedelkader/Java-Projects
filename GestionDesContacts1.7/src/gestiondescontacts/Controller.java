package gestiondescontacts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import javax.swing.JCheckBox;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Controller {
    private ContactList contactModel;
    private GroupList groupModel;
    private View view;
    private Object selectedContact;
    private int[] selectedRow;
    private String[] checkBoxStrings;
    
    public Controller(ContactList contactModel, GroupList groupModel, View view){
        this.contactModel = contactModel;
        this.groupModel = groupModel;
        this.view = view;
    }
    
    public void addGroup(Record group){
        groupModel.add(group);
    }
    
    public void addContact(Record contact){
        contactModel.add(contact);
    }
    
    public Record removeGroup(Record group){
        return groupModel.remove(group);
    }
    
    public Record removeContact(Record contact){
        return contactModel.remove(contact);
    }
    
    public ContactList getContactModel() {
        return contactModel;
    }

    public GroupList getGroupModel() {
        return groupModel;
    }
    
    public void update(){
        try{
            readDataFromFile();
        }catch(IOException ioe){
            System.out.println("IOException read data from file");
        }catch(ClassNotFoundException cnfe){
            System.out.println("Class not found");   
        }
        
        checkBoxStrings = new String[groupModel.getGroupList().size()];
        
        for(int i = 0; i < checkBoxStrings.length; i++){
            checkBoxStrings[i] = ((Group)(groupModel.getGroupList().get(i))).getGroupName();
        }
        
        //Contact button action listener
        view.getContactsButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                view.getMenuLabel().setText("Contacts");
                view.getLeftPanel().remove(view.getContactsButton());
                view.getLeftPanel().remove(view.getGroupsButton());
                view.getLeftPanel().add(view.getSortByFirstNameButton());
                view.getLeftPanel().add(view.getSortByLastNameButton());
                view.getLeftPanel().add(view.getSortByCityButton());
                view.getLeftPanel().add(view.getAddNewContactButton());
                view.getLeftPanel().add(view.getBackButton());
                view.getMainFrame().repaint();
//                System.out.println("Contact groups");
//                for(Record temp : contactModel.getContactList()){
//                    System.out.print(((Contact)temp).getGroups());
//                    System.out.print("---");
//                }
//                System.out.println();
//                System.out.println("group Contact");
//                for(Record temp : groupModel.getGroupList()){
//                    System.out.print(((Group)temp).getContacts());
//                    System.out.print("---");
//                }
            }
        });
        //Group button action listener
        view.getGroupsButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                view.getMenuLabel().setText("Groups");
                view.getLeftPanel().remove(view.getContactsButton());
                view.getLeftPanel().remove(view.getGroupsButton());
                view.getLeftPanel().add(view.getAddNewGroupButton());
                view.getLeftPanel().add(view.getBackButton());
                
                int count = 0;
                for(Record temp : groupModel.getGroupList()){
                    view.getGroupListTableModel().setValueAt(((Group)temp), count,0);
                    view.getGroupListTableModel().setValueAt(((Group)temp).getContacts().size(), count,1);
                    count ++;
                }
                
                for(int i = count; i < view.getGroupListTable().getRowCount(); i++){
                    view.getGroupListTableModel().setValueAt(null, i,0);
                    view.getGroupListTableModel().setValueAt(null, i,1);
                }
                
                for(int i = 0; i< view.getContactListTableModel().getRowCount(); i++){
                    view.getContactListTableModel().setValueAt(null, i,0);
                    view.getContactListTableModel().setValueAt(null, i,1);
                }
                
                view.listOfGroupsPanelMethod();
                
                view.getMainFrame().repaint();
            }
        });
        //Add new Group button action listener
        view.getAddNewGroupButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                view.getMenuLabel().setText("Add new Group");
                view.getLeftPanel().remove(view.getAddNewGroupButton());
                view.getRigthPanel().remove(view.getGroupListPanel());
                view.getRigthPanel().remove(view.getSaveGroupChangesButton());
                
                view.addNewGroupPanelMethod(contactModel.getContactList().size());
                
                view.getRigthPanel().remove(view.getSaveGroupChangesButton());
                
                int count = 0;
                for(Record temp : contactModel.getContactList()){
                    
                    //view.getAddNewGroupTableModel().setValueAt((Contact)temp, count, 0);
                    view.getAddNewGroupTableModel().setValueAt(((Contact)temp).showDetails(), count, 0);
                    view.getAddNewGroupTableModel().setValueAt(((Contact)temp).getCity(), count, 1);
                    
                    count ++;
                }
                
                view.getMainFrame().repaint();
            }
        });
        //View group contacts list selection listener
        view.getGroupListTable().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                try{
                    selectedRow = view.getGroupListTable().getSelectedRows();

                    LinkedList<Record> temp = ((Group)(view.getGroupListTableModel().getValueAt(selectedRow[0], 0))).getContacts();


                    for(int i = 0; i < view.getContactListTableModel().getRowCount(); i++){
                        view.getContactListTableModel().setValueAt(null, i, 0);
                        view.getContactListTableModel().setValueAt(null, i, 1);
                    }

                    int count = 0;

                    for(Record r : temp){

                        view.getContactListTableModel().setValueAt(((Contact)r).showDetails(), count, 0);
                        view.getContactListTableModel().setValueAt(((Contact)r).getCity(), count, 1);

                        count ++;
                    }
                }catch(NullPointerException npe){
                    view.messge("Select a Group");
                }
               
            }
            
        });
        //Update group action listener
        view.getUpdateGroupButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    selectedRow = view.getGroupListTable().getSelectedRows();

                    Group selectedGroup = (Group)(view.getGroupListTableModel().getValueAt(selectedRow[0], 0));

                    LinkedList<Record> temp = selectedGroup.getContacts();


                    view.getMenuLabel().setText("Update Group");
                    view.getAddNewGroupPanel().remove(view.getSaveGroupButton());
                    view.getLeftPanel().remove(view.getAddNewGroupButton());
                    view.getRigthPanel().remove(view.getGroupListPanel());

                    view.updateNewGroupPanelMethod(contactModel.getContactList().size());

                    view.getGroupNameTextField().setText(selectedGroup.getGroupName());
                    view.getDescriptionTextField().setText(selectedGroup.getDescription());

                    for(int i = contactModel.getContactList().size(); i < 15; i ++){
                        view.getAddNewGroupTableModel().setValueAt("", i, 0);
                        view.getAddNewGroupTableModel().setValueAt("", i, 1);
                        view.getAddNewGroupTableModel().setValueAt(Boolean.FALSE, i, 2);
                    }

                    int count = 0;
                    for(Record cm : contactModel.getContactList()){
                        view.getAddNewGroupTableModel().setValueAt(((Contact)cm).showDetails(), count, 0);
                        view.getAddNewGroupTableModel().setValueAt(((Contact)cm).getCity(), count, 1);

                        if(selectedGroup.containContact(((Contact)cm))){
                            view.getAddNewGroupTableModel().setValueAt(Boolean.TRUE, count, 2);

                        }else{
                            view.getAddNewGroupTableModel().setValueAt(Boolean.FALSE, count, 2);

                        }

                        count ++;
                    }
                }catch(NullPointerException npe){
                    view.messge("Select a Group");
                }
                catch(ArrayIndexOutOfBoundsException aioobe){
                    view.messge("Select a Group");
                }
                
                view.getMainFrame().repaint();
               
            }
            
        });
        //Save group changes action listener
        view.getSaveGroupChangesButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Group selectedGroup = (Group)(view.getGroupListTableModel().getValueAt(selectedRow[0], 0));
                
                String groupName = view.getGroupNameTextField().getText();
                String  description = view.getDescriptionTextField().getText();
                LinkedList<Record> groupContacts = new LinkedList<>();
                
                if(description.isEmpty()){
                    view.messge("Enter description");
                }else{
                    if(!"".equals(groupName) && !"".equals(description)){
                        for (int rowCount = 0; rowCount < contactModel.getContactList().size(); rowCount++){
                            if(view.getAddNewGroupTableModel().getValueAt(rowCount, 2) == Boolean.TRUE){
                                groupContacts.add((Contact)contactModel.getContactList().get(rowCount));
                                //groupContacts.add((Contact)contactModel.getContactList().));
                            }
                        }
                    }
                    try{

                        selectedGroup.setGroupName(groupName); 
                        selectedGroup.setDescription(description);
                        selectedGroup.setContacts(groupContacts);

                        LinkedList<Record> allContacts = new LinkedList<>();
                        
                        allContacts.addAll(contactModel.getContactList());
                        
//                        System.out.println("All contacts before: " + allContacts);
//                        System.out.println("group contacts before: " + groupContacts);
                        
                        LinkedList<Record> temp1 = new LinkedList<>();
                        temp1.addAll(allContacts);
                        for(Record ac : allContacts){
                            for(Record gc : groupContacts){
                                if(((Contact)ac).getContactId().equals(((Contact)gc).getContactId())){
                                    temp1.remove(gc);
                                }
                            }
                        }
                        allContacts.clear();
                        allContacts.addAll(temp1);
                        
//                        System.out.println("All contacts after: " + allContacts);
//                        System.out.println("group contacts after: " + groupContacts);
                        
                        for(Record ac : allContacts){
                            for(Record c : contactModel.getContactList()){
                                if(((Contact)ac).getContactId().equals(((Contact)c).getContactId())){
                                    ((Contact)c).removeGroup(selectedGroup);
                                }
                            }
                            ((Contact)ac).removeGroup(selectedGroup);
                        }
                        
                        
                        for(Record gc : groupContacts){
                            int count = 0;
                            LinkedList<Record> contactGroupList = ((Contact)gc).getGroups();
                            for(Record cgl : contactGroupList){
                                if(((Group)cgl).getGroupName().equals(selectedGroup.getGroupName())){
                                    count ++;
                                }
                            }
                            if(count == 0){
                                ((Contact)gc).addGroup(selectedGroup);
                            }
                            //System.out.println("gc: " + ((Contact)gc).getGroups());
                        }
                        
//                        for(Record r : groupContacts){
//                            //System.out.println(!(((Contact)r).getGroups().contains(selectedGroup)));
//                            if(!(((Contact)r).getGroups().contains(selectedGroup)))
//                                ((Contact)r).addGroup(selectedGroup);
//                            for(Record g : ((Contact)r).getGroups()){
//                                ((Group)g).getGroupName().equals(selectedGroup.getGroupName()){
//                                
//                            }
//                            }
//                        }

                        for(Record r : contactModel.getContactList()){
                            if(!(groupContacts.contains((Contact)r)))
                                    ((Contact)r).removeGroup(selectedGroup);
                        }  
                        
                        LinkedList<Record> temp = new LinkedList<>();
                        
                        for(Record r : contactModel.getContactList()){
                            int count = 0;
                            for(Record c : groupContacts){
                                if(!((Contact)r).getContactId().equals(((Contact)c).getContactId())){
                                    count ++;
                                }
                            }
                            if(count != 0){
                                temp.add(r);
                            }
                        }
                        
                        System.out.println("selected contact: " + selectedGroup);
                        
                        System.out.println("temp: " + temp);
                        
//                        for(Record t : temp){
//                            System.out.println("temp: " + ((Contact)t).getGroups());
//                            ((Contact)t).removeGroup(selectedGroup);
//                        }
                        
                        System.out.println("temp after: " + temp);
                        
                        for(Record t : contactModel.getContactList()){
                            System.out.println("temp: " + ((Contact)t).getGroups());
                        }
                        checkBoxStrings = new String[groupModel.getGroupList().size()];
        
                        for(int i = 0; i < checkBoxStrings.length; i++){
                            checkBoxStrings[i] = ((Group)(groupModel.getGroupList().get(i))).getGroupName();
                        }

                        writeDataToFile();
                        writeGroupDataToFile();
                    }catch(NullPointerException npe){
                        System.out.println("only contact or group");

                    }

                    view.messge("Information updated");
                }
                
            }
            
        });
        //Back button action listener
        view.getBackButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                view.getMenuLabel().setText("Manage");
                view.getLeftPanel().remove(view.getSortByFirstNameButton());
                view.getLeftPanel().remove(view.getSortByLastNameButton());
                view.getLeftPanel().remove(view.getSortByCityButton());
                view.getLeftPanel().remove(view.getAddNewContactButton());
                view.getLeftPanel().remove(view.getBackButton());
                view.getLeftPanel().remove(view.getAddNewGroupButton());
                view.getRigthPanel().remove(view.getContactListPanel());
                view.getRigthPanel().remove(view.getViewContactPanel());
                view.getRigthPanel().remove(view.getAddContactPanel());
                view.getRigthPanel().remove(view.getUpdateContactPanel());
                view.getRigthPanel().remove(view.getGroupListPanel());
                view.getRigthPanel().remove(view.getAddNewGroupPanel());
                view.getLeftPanel().add(view.getContactsButton());
                view.getLeftPanel().add(view.getGroupsButton());
                view.getMainFrame().repaint();
            }
        });
        //Sort by first name action listener
        view.getSortByFirstNameButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                view.getRigthPanel().remove(view.getViewContactPanel());
                view.getRigthPanel().remove(view.getContactListPanel());
                view.getRigthPanel().remove(view.getAddContactPanel());
                view.getRigthPanel().remove(view.getUpdateContactPanel());

                Record recordArray[] = new Record[contactModel.getContactList().size()];
                int i = 0;
                for(Record rec : contactModel.getContactList()){
                    recordArray[i] = rec;
                    i++;
                }
                
                Contact temp;
                
                for(int j = 0; j<recordArray.length-1; j++){
                    for(int z = 1; z<recordArray.length; z++){
                        if(((Contact)recordArray[j]).getFirstName().compareToIgnoreCase(((Contact)recordArray[z]).getFirstName()) > 0){
                            temp = (Contact)recordArray[j];
                            recordArray[j] = recordArray[z];
                            recordArray[z] = temp;
                        }
                    }
                }
                
                view.getListModel().clear();
                for(int j = 0; j<recordArray.length; j++){
                    view.getListModel().addElement(recordArray[j]);
                }

                view.ContactsListPanelMethod();
                view.getRigthPanel().add(view.getContactListPanel());
                view.getMainFrame().repaint();
            }
        });
        //Sort by last name action listener
        view.getSortByLastNameButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                view.getRigthPanel().remove(view.getViewContactPanel());
                view.getRigthPanel().remove(view.getContactListPanel());
                view.getRigthPanel().remove(view.getAddContactPanel());
                view.getRigthPanel().remove(view.getUpdateContactPanel());

                Record recordArray[] = new Record[contactModel.getContactList().size()];
                int i = 0;
                for(Record rec : contactModel.getContactList()){
                    recordArray[i] = rec;
                    i++;
                }
                
                Contact temp;
                
                for(int j = 0; j<recordArray.length-1; j++){
                    for(int z = 1; z<recordArray.length; z++){
                        if(((Contact)recordArray[j]).getLastName().compareToIgnoreCase(((Contact)recordArray[z]).getLastName()) > 0){
                            temp = (Contact)recordArray[j];
                            recordArray[j] = recordArray[z];
                            recordArray[z] = temp;
                        }
                    }
                }
                
                
                view.getListModel().clear();
                for(int j = 0; j<recordArray.length; j++){
                    view.getListModel().addElement(recordArray[j]);
                }
                
                view.ContactsListPanelMethod();
                view.getRigthPanel().add(view.getContactListPanel());
                view.getMainFrame().repaint();
            }
        });
        //Sort by city action listener
        view.getSortByCityButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                view.getRigthPanel().remove(view.getViewContactPanel());
                view.getRigthPanel().remove(view.getContactListPanel());
                view.getRigthPanel().remove(view.getAddContactPanel());
                view.getRigthPanel().remove(view.getUpdateContactPanel());

                Record recordArray[] = new Record[contactModel.getContactList().size()];
                int i = 0;
                for(Record rec : contactModel.getContactList()){
                    recordArray[i] = rec;
                    i++;
                }
                
                Contact temp;
                
                for(int j = 0; j<recordArray.length-1; j++){
                    for(int z = 1; z<recordArray.length; z++){
                        if(((Contact)recordArray[j]).getCity().compareToIgnoreCase(((Contact)recordArray[z]).getCity()) > 0){
                            temp = (Contact)recordArray[j];
                            recordArray[j] = recordArray[z];
                            recordArray[z] = temp;
                        }
                    }
                }

                view.getListModel().clear();
                for(int j = 0; j<recordArray.length; j++){
                    view.getListModel().addElement(recordArray[j]);
                }
                
                view.ContactsListPanelMethod();
                view.getRigthPanel().add(view.getContactListPanel());
                view.getMainFrame().repaint();
            }
        });
        //Add new contact action listener
        view.getAddNewContactButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                view.getRigthPanel().remove(view.getContactListPanel());
                view.addContactsPanelMethod(checkBoxStrings);
                view.getRigthPanel().add(view.getAddContactPanel());
                view.getMainFrame().repaint();
            }
        });
        //Save new contact to file action listener
        view.getSaveNewContactButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String firstName = view.getFirstNameTextField().getText();
                String lastName = view.getLastNameTextField().getText();
                String city = view.getCityTextField().getText();
                LinkedList<Object[]> phoneNumber = new LinkedList<>();
                LinkedList<Record> groups = new LinkedList<>();
                
                for (int count = 0; count < view.getTableModel().getRowCount(); count++){
                    if((view.getTableModel().getValueAt(count, 0))!= null && (view.getTableModel().getValueAt(count, 1))!= null){
                        Object temp [] = {(view.getTableModel().getValueAt(count, 0)), (view.getTableModel().getValueAt(count, 1))};
                        phoneNumber.add(temp);
                    }
                }
                
                for(int i = 0; i< view.getCheckBoxArray().size(); i++){
                    if(((JCheckBox)(view.getCheckBoxArray().get(i))).isSelected()){
                        String groupName = ((JCheckBox)(view.getCheckBoxArray().get(i))).getText();
                        for(Record g : groupModel.getGroupList()){
                            if(((Group)g).getGroupName().equals(groupName)){
                                groups.add(g);
                            }
                        }
                        
                    }
                }

                RecordFactory rf = new RecordFactory();
                
                try{
                    Contact contact = (Contact)rf.createRecord("contact");
                        
                    contact.setFirstName(firstName);
                    contact.setLastName(lastName);
                    contact.setCity(city);
                    contact.setGroup(groups);
                    for(Object[] temp: phoneNumber){
                        contact.addPhoneNumber(temp);
                    }
                    
                    contactModel.add(contact);
                    
                    for(Record g : groups){
                        ((Group)g).addContact(contact);
                    }

                    writeGroupDataToFile();
                    writeDataToFile();
                }catch(NullPointerException npe){
                    System.out.println("only contact or group");
                }

                view.messge("Contact Added");
                
                view.addContactsPanelMethod(checkBoxStrings);
                
            }
            
            
        });
         //Save new group to file action listener
        view.getSaveGroupButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String groupName = view.getGroupNameTextField().getText();
                String  description = view.getDescriptionTextField().getText();
                LinkedList<Record> groupContacts = new LinkedList<>();
                
                if(description.isEmpty()){
                    view.messge("Enter description");
                }else{
                    //if(!"".equals(groupName) && !"".equals(description)){
                    for (int rowCount = 0; rowCount < view.getAddNewGroupTableModel().getRowCount(); rowCount++){
                        if(view.getAddNewGroupTableModel().getValueAt(rowCount, 2) != null){
                            groupContacts.add((Contact)contactModel.getContactList().get(rowCount));

                        }
                    }
                    //}
                    

                    RecordFactory rf = new RecordFactory();

                    try{
                        Group group = (Group)rf.createRecord("group");  
                        group.setGroupName(groupName);
                        group.setDescription(description);
                        group.setContacts(groupContacts);


                        for(Record r : groupContacts){
                            ((Contact)r).addGroup(group);
                        }

                        groupModel.add(group);
                        
                        checkBoxStrings = new String[groupModel.getGroupList().size()];
        
                        for(int i = 0; i < checkBoxStrings.length; i++){
                            checkBoxStrings[i] = ((Group)(groupModel.getGroupList().get(i))).getGroupName();
                        }
                
                        writeDataToFile();
                        writeGroupDataToFile();
                        view.messge("Group Added");
                    }catch(NullPointerException npe){
                        System.out.println("only contact or group");

                    }
                }
                
            }
        });
        //Cancel action listener
        view.getCancelButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                view.getRigthPanel().remove(view.getViewContactPanel());
                view.getRigthPanel().remove(view.getContactListPanel());
                view.getRigthPanel().remove(view.getAddContactPanel());
                view.getRigthPanel().remove(view.getUpdateContactPanel());
                view.getMainFrame().repaint();
            }
        });
        //Cancel group action listener
        view.getCancelGroupButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                view.cancelGroupMethod();
                
                view.getRigthPanel().remove(view.getAddNewGroupPanel());
                view.getLeftPanel().add(view.getAddNewGroupButton());
                int count = 0;
                for(Record temp : groupModel.getGroupList()){
                    view.getGroupListTableModel().setValueAt(((Group)temp), count,0);
                    view.getGroupListTableModel().setValueAt(((Group)temp).getContacts().size(), count,1);
                    count ++;
                }
                
                for(int i = count; i < view.getGroupListTable().getRowCount(); i++){
                    view.getGroupListTableModel().setValueAt(null, i,0);
                    view.getGroupListTableModel().setValueAt(null, i,1);
                }
                view.listOfGroupsPanelMethod();
                view.getMainFrame().repaint();
            }
        });
        //View Contact action listener
        view.getViewContactButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Object selectedContact = (Contact)view.getViewContactsList().getSelectedValue();
                view.getRigthPanel().remove(view.getViewContactPanel());
                view.getRigthPanel().remove(view.getContactListPanel());
                view.getRigthPanel().remove(view.getAddContactPanel());
                view.getRigthPanel().remove(view.getUpdateContactPanel());
                
//                checkBoxStrings = new String[groupModel.getGroupList().size()];
//        
//                for(int i = 0; i < checkBoxStrings.length; i++){
//                    checkBoxStrings[i] = ((Group)(groupModel.getGroupList().get(i))).getGroupName();
//                }
                
                
                try{
                    String firstName = ((Contact)selectedContact).getFirstName();
                    String lastName = ((Contact)selectedContact).getLastName();
                    String city = ((Contact)selectedContact).getCity();

                    LinkedList<Object[]> phoneNumbers = ((Contact)selectedContact).getPhoneNumbers();

                    int count = 0;
                    for(Object[] temp : phoneNumbers){
                        for(int j = 0; j<temp.length; j++){
                            view.getTableModel().setValueAt(temp[j], count, j);
                        }
                        count ++;
                    }
                    
                    String [] contactCheckBoxStrings = new String[((Contact)selectedContact).getGroups().size()];
        
                    for(int i = 0; i < contactCheckBoxStrings.length; i++){
                        contactCheckBoxStrings[i] = ((Group)((((Contact)selectedContact).getGroups()).get(i))).getGroupName();
                    }

//                    for(int i = 0; i < contactCheckBoxStrings.length; i++){
//                        System.out.println(contactCheckBoxStrings[i]);
//                        
//                    }
                    
                    view.getFirstNameTextField().setText(firstName);
                    view.getLastNameTextField().setText(lastName);
                    view.getCityTextField().setText(city);

                    view.viewContactsPanelMethod(contactCheckBoxStrings);
                    
                    
                }catch(NullPointerException npe){
                    view.messge("Select a Contact");
                }
                
                view.getMainFrame().repaint();
            }
        });
        //Search action listener
        view.getSearchTextField().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                view.getRigthPanel().remove(view.getViewContactPanel());
                view.getRigthPanel().remove(view.getContactListPanel());
                view.getRigthPanel().remove(view.getAddContactPanel());
                view.getRigthPanel().remove(view.getUpdateContactPanel());
                
                String value = view.getSearchTextField().getText();
                
                view.getListModel().clear();
                for(Record temp : contactModel.getContactList()){
                    if(((Contact)temp).getFirstName().contains(value) || ((Contact)temp).getLastName().contains(value) || ((Contact)temp).getCity().contains(value)){
                        view.getListModel().addElement(((Contact)temp));
                    }
                }
                
                view.ContactsListPanelMethod();
                view.getRigthPanel().add(view.getContactListPanel());
                view.getMainFrame().repaint();
            }
        });
        //Update Contact action listener
        view.getUpdateContactButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                checkBoxStrings = new String[groupModel.getGroupList().size()];
        
                for(int i = 0; i < checkBoxStrings.length; i++){
                    checkBoxStrings[i] = ((Group)(groupModel.getGroupList().get(i))).getGroupName();
                }
                selectedContact = (Contact)view.getViewContactsList().getSelectedValue();
                try{
                    
                
                    String firstName = ((Contact)selectedContact).getFirstName();
                    String lastName = ((Contact)selectedContact).getLastName();
                    String city = ((Contact)selectedContact).getCity();

                    view.getRigthPanel().remove(view.getViewContactPanel());
                    view.getRigthPanel().remove(view.getContactListPanel());
                    view.getRigthPanel().remove(view.getAddContactPanel());
                    view.getRigthPanel().remove(view.getUpdateContactPanel());
                    
                    LinkedList<Object[]> phoneNumbers = ((Contact)selectedContact).getPhoneNumbers();

                    int count = 0;
                    for(Object[] temp : phoneNumbers){
                        for(int j = 0; j<temp.length; j++){
                            view.getTableModel().setValueAt(temp[j], count, j);
                        }
                        count ++;
                    }

                    view.getFirstNameTextField().setText(firstName);
                    view.getLastNameTextField().setText(lastName);
                    view.getCityTextField().setText(city);

                    ArrayList<String> groupNames = new ArrayList();

                    int size = ((Contact)selectedContact).getGroups().size();

                    for(int i = 0; i <size ; i++){
                        groupNames.add(((Group)((Contact)selectedContact).getGroups().get(i)).getGroupName());
                    }

                    view.updateContactsPanelMethod(checkBoxStrings, groupNames);
                    view.getMainFrame().repaint();
                }catch(NullPointerException npe){
                    view.messge("Select a Contact");
                }
                
            }
        });
        //Save Changes action listener
        view.getSaveChangesButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String firstName = view.getFirstNameTextField().getText();
                String lastName = view.getLastNameTextField().getText();
                String city = view.getCityTextField().getText();
                LinkedList<Object[]> phoneNumber = new LinkedList<>();
                LinkedList<Record> groups = new LinkedList<>();
                
                for (int count = 0; count < view.getTableModel().getRowCount(); count++){
                    if((view.getTableModel().getValueAt(count, 0))!= null && (view.getTableModel().getValueAt(count, 1))!= null){
                        Object temp [] = {(view.getTableModel().getValueAt(count, 0)), (view.getTableModel().getValueAt(count, 1))};
                        phoneNumber.add(temp);
                    }
                }
                
                for(int i = 0; i< view.getCheckBoxArray().size(); i++){
                    if(((JCheckBox)(view.getCheckBoxArray().get(i))).isSelected()){
                        String groupName = ((JCheckBox)(view.getCheckBoxArray().get(i))).getText();
                        for(Record g : groupModel.getGroupList()){
                            if(((Group)g).getGroupName().equals(groupName)){
                                groups.add(g);
                            }
                        }
                        
                    }
                }
                
                ((Contact)selectedContact).setFirstName(firstName);
                ((Contact)selectedContact).setLastName(lastName);
                ((Contact)selectedContact).setCity(city);
                ((Contact)selectedContact).setPhoneNumbers(phoneNumber);
                
                ArrayList<Group> temp = new ArrayList<>();
                LinkedList<Record> temp1 = new LinkedList<>();
                
                System.out.println("check box array: " + view.getCheckBoxArray());
                System.out.println("all Groups: " +groups);
                System.out.println("Contact Groups: " + ((Contact)selectedContact).getGroups());
                
                System.out.println("EMpty?: " + ((Contact)selectedContact).getGroups().isEmpty());
                
                if(!groups.isEmpty()){
                    for(Record g : groups){
                    if(((Contact)selectedContact).getGroups().isEmpty()){
                        ((Contact)selectedContact).addGroup(g);
                    }else{
                        for(Record cg : ((Contact)selectedContact).getGroups()){
                            //if(!((Group)cg).getGroupName().equals(((Group)g).getGroupName())){
                                temp.add((Group)g);
                            //}
                        }
                        
                        LinkedHashSet<Group> set = new LinkedHashSet<>();
                        set.addAll(temp);
                        temp.clear();
                        temp.addAll(set);

                        System.out.println("temp: "  + temp);

                        ((Contact)selectedContact).setGroup(new LinkedList<>());
                        for(Group t : temp){
                            ((Contact)selectedContact).addGroup(t);
                        }
                    }
                    

                    System.out.println(((Group)g).getGroupName() + " : " + ((Group)g).getContacts());
                    
                    if(((Group)g).getContacts().isEmpty()){
                        ((Group)g).addContact((Contact)selectedContact);
                    }else{
                        for(Record a : ((Group)g).getContacts()){
                            if(!((Contact)a).getContactId().equals(((Contact)selectedContact).getContactId())){
                                temp1.add((Contact)selectedContact);
                            }    
                        }
                        
                        LinkedHashSet<Record> set1 = new LinkedHashSet<>();
                        set1.addAll(temp1);
                        temp1.clear();
                        temp1.addAll(set1);

                        System.out.println("temp1: " + temp1);
                        for(Record t : temp1)
                            ((Group)g).addContact((Contact)t);
                        
                        
                        LinkedHashSet<Record> set2 = new LinkedHashSet<>();
                
                        for(Record c : ((Group)g).getContacts())
                            set2.add(c);
                        System.out.println("set : " + set2);
                        ((Group)g).setContacts(new LinkedList<>());
                        for(Record r : set2){
                            ((Group)g).addContact(((Contact)r));
                        }
                        set2.clear();
                    }
                    
                    
                }
                }else{
                    for(Record r : ((Contact)selectedContact).getGroups()){
                        ((Group)r).removeContact(((Contact)selectedContact));
                    }
                    
                    ((Contact)selectedContact).setGroup(new LinkedList<>());
                }
                
                
                
                for(Record g : groups){
                    System.out.println(((Group)g).getGroupName() + " : " + ((Group)g).getContacts());
                    for(Record r : ((Group)g).getContacts())
                    System.out.println("contact groups: " + ((Contact)r).getGroups());
                }
                
                for(Record g : groupModel.getGroupList()){
                    int count = 0;
                    for(Record cg : ((Contact)selectedContact).getGroups()){
                        if(((Group)g).getGroupName().equals(((Group)cg).getGroupName())){
                            count++;
                        }
                    }
                    System.out.println("Count : " + count);
                    if(count == 0){
                        ((Group)g).removeContact(((Contact)selectedContact));
                    }
                    
                }
                
                writeGroupDataToFile();
                
                writeDataToFile();
                view.messge("Information updated");
            }
            
        });
        //Delete contact action listener
        view.getDeleteContactButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                selectedContact = (Contact)view.getViewContactsList().getSelectedValue();
                
                view.getRigthPanel().remove(view.getViewContactPanel());
                view.getRigthPanel().remove(view.getContactListPanel());
                view.getRigthPanel().remove(view.getAddContactPanel());
                view.getRigthPanel().remove(view.getUpdateContactPanel());
                
                
                LinkedList<Record> groups = groupModel.getGroupList();
//                LinkedList<Record> temp = new LinkedList<>();
//                
//                temp.addAll(groups);
                
                System.out.println("before: " + groups);
                for(Record g : groups){
                    for(Record c : ((Group)g).getContacts()){
                        //if(((Contact)c).getContactId().equals(((Contact)selectedContact).getContactId())){
                            ((Group)g).removeContact(((Contact)selectedContact));
                            //break;
                        //}
                    }
                }
                
                
                for(Record r : groupModel.getGroupList()){
                    System.out.println("after: " + ((Group)r).getContacts());
                }
                
                
                view.getListModel().removeElement((Contact)selectedContact);
                contactModel.remove((Contact)selectedContact);
                
                int count = 0;
                for(Record temp : contactModel.getContactList()){
                    view.getAddNewGroupTableModel().setValueAt(((Contact)temp).showDetails(), count, 0);
                    view.getAddNewGroupTableModel().setValueAt(((Contact)temp).getCity(), count, 1);
                    
                    count ++;
                }
                
                writeGroupDataToFile();
                writeDataToFile();
                
                view.ContactsListPanelMethod();
                view.getRigthPanel().add(view.getContactListPanel());
                view.getMainFrame().repaint();
            }
        });
        //Delete Group action listener
        view.getDeleteGroupButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                selectedRow = view.getGroupListTable().getSelectedRows();
                
                try{
                    Group temp = ((Group)(view.getGroupListTableModel().getValueAt(selectedRow[0], 0)));
                
                    view.getGroupListTableModel().setValueAt(null, selectedRow[0],0);
                    view.getGroupListTableModel().setValueAt(null, selectedRow[0],1);

                    for(Record c : contactModel.getContactList()){
                        for(Record g : ((Contact)c).getGroups()){
                            if(((Group)g).getGroupName().equals(temp.getGroupName()))
                                ((Contact)c).removeGroup(g);
                        }

                    }

                    groupModel.remove((Group)temp);

                    checkBoxStrings = new String[groupModel.getGroupList().size()];

                    for(int i = 0; i < checkBoxStrings.length; i++){
                        checkBoxStrings[i] = ((Group)(groupModel.getGroupList().get(i))).getGroupName();
                    }



                    writeGroupDataToFile();
                    writeDataToFile();
                }catch(NullPointerException npe){
                    view.messge("Select a Contact");
                }
                

                view.listOfGroupsPanelMethod();
                view.getMainFrame().repaint();
            }
        });
    }
    
    public void writeDataToFile(){
        ProxyFileOutput pfo = new ProxyFileOutput();
        OutputStream[] o = pfo.connectTo("Contacts");

        try{
            FileOutputStream fos = (FileOutputStream)o[0];
            ObjectOutputStream oos = (ObjectOutputStream)o[1];

            try {
                oos.writeObject(contactModel.getContactList());
                            
                oos.close();
                fos.close();
            } catch (IOException ex) {
                System.out.println("Connection Error");
            }
        }catch(NullPointerException npe){
            System.out.println("not a valid file");
        }
    }
    
    public void writeGroupDataToFile(){
        ProxyFileOutput pfo = new ProxyFileOutput();
        OutputStream[] o = pfo.connectTo("Groups");

        try{
            FileOutputStream fos = (FileOutputStream)o[0];
            ObjectOutputStream oos = (ObjectOutputStream)o[1];

            try {
                oos.writeObject(groupModel.getGroupList());
                            
                oos.close();
                fos.close();
            } catch (IOException ex) {
                System.out.println("Connection Error");
            }
        }catch(NullPointerException npe){
            System.out.println("not a valid file");
        }
    }
    
    public void readDataFromFile() throws IOException, ClassNotFoundException{
        ProxyFileInput pfi = new ProxyFileInput();
        
        try{
            InputStream[] o = pfi.connectTo("Contacts");
            FileInputStream fis = (FileInputStream) o[0];
            ObjectInputStream ois = (ObjectInputStream) o[1];
            
            contactModel.setContactList((LinkedList<Record>)ois.readObject());
            
            fis.close();
            ois.close();
            
            InputStream[] o1 = pfi.connectTo("Groups");
            FileInputStream fis1 = (FileInputStream) o1[0];
            ObjectInputStream ois1 = (ObjectInputStream) o1[1];
            
            groupModel.setGroupList((LinkedList<Record>)ois1.readObject());
            
            fis1.close();
            ois1.close();
            
        }catch(NullPointerException npe){
            System.out.println("null");
        }
    }
    
    
}
