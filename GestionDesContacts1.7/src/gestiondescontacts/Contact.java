package gestiondescontacts;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.UUID;

public class Contact implements Record, Serializable{

    String contactId = UUID.randomUUID().toString();
    private String firstName, lastName, city;
    private LinkedList<Object[]> phoneNumbers;
    private LinkedList<Record> groups;
            
    @Override
    public String showDetails() {
        return firstName + " " + lastName;
    }
    
    public Contact(){
        phoneNumbers = new LinkedList<>();
        groups = new LinkedList<>();
    }

    public Contact(String firstName, String lastName, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        phoneNumbers = new LinkedList<>();
        groups = new LinkedList<>();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhoneNumbers(LinkedList<Object[]> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public LinkedList<Object[]> getPhoneNumbers() {
        return phoneNumbers;
    }

    public LinkedList<Record> getGroups() {
        return groups;
    }
    
    public void addPhoneNumber(Object[] phoneNumber){
        phoneNumbers.add(phoneNumber);
    }
    
    public Object[] removePhoneNumber(Object[] phoneNumber){
        return phoneNumbers.remove(phoneNumbers.indexOf(phoneNumber));
    }
    
    public void addGroup(Record group){
        groups.add(group);
    }
    
    public void setGroup(LinkedList g){
        this.groups = g;
    }
    
    public Record removeGroup(Record group){
        //if(groups.indexOf(group) != -1)
        int count = 0;
        for(Record r : this.groups){
            if(((Group)r).getGroupName().equals(((Group)group).getGroupName())){
                this.groups.remove(count);
            }
            count ++;
        }
        
            //return groups.remove(groups.indexOf(group));
//        else
//            System.out.println("error no such group");
//        return null;
return null;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - " + city;
    }
    
    
}
