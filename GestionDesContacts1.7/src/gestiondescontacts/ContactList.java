package gestiondescontacts;

import java.util.LinkedList;

public class ContactList implements RecordList{
    
    private LinkedList<Record> contactList;

    public ContactList() {
        contactList = new LinkedList<>();
    }

    @Override
    public void add(Record record) {
        contactList.add(record);
    }

    @Override
    public Record remove(Record record) {
        return contactList.remove(contactList.indexOf(record));
    }
    
    public LinkedList<Record> getContactList(){
        return contactList;
    }

    public void setContactList(LinkedList<Record> contactList) {
        this.contactList = contactList;
    }
    
    
    
}
