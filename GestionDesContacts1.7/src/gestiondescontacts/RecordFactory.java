package gestiondescontacts;

public class RecordFactory {
    public Record createRecord(String record){
        Record r;
        
        if(record.equals("contact")){
            r = new Contact();
        }else if(record.equals("group")){
            r = new Group();
        }else{
            r = null;
        }
        
        return r;
    }
}
