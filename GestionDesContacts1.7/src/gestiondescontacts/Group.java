package gestiondescontacts;

import java.io.Serializable;
import java.util.LinkedList;

public class Group implements Record, Serializable{
    
    private static int groupId;
    private String groupName, description;
    private LinkedList<Record> contacts;

    @Override
    public String showDetails() {
        return "";
    }
    
    public Group(){
        
    }

    public Group(String groupName, String description) {
        this.groupName = groupName;
        this.description = description;
        groupId ++;
    }

    public static int getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getDescription() {
        return description;
    }

    public LinkedList<Record> getContacts() {
        return contacts;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void addContact(Contact contact){
        contacts.add(contact);
    }
    
    public void setContacts(LinkedList<Record> contacts){
        this.contacts = contacts;
    }
    
    public Record removeContact(Record contact){
        if(contacts.indexOf(contact) != -1)
            return contacts.remove(contacts.indexOf(contact));
        else
            return null;
    }

    @Override
    public String toString() {
        return groupName + "";
    }
    
    public boolean containContact(Record r){
        for(Record t : contacts){
            if(((Contact)r).getContactId().equals(((Contact)t).getContactId()))
                return true;
        }
        return false;
    }
    
    
    
}
