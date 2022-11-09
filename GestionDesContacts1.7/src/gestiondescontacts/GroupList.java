package gestiondescontacts;

import java.util.LinkedList;

public class GroupList implements RecordList{
    
    private LinkedList<Record> groupList;

    public GroupList() {
        this.groupList = new LinkedList<>();
    }
    
    public void add(Record record){
        groupList.add(record);
    }
    
    public Record remove(Record record){
        return groupList.remove(groupList.indexOf(record));
    }
    
    public LinkedList<Record> getGroupList(){
        return groupList;
    }

    public void setGroupList(LinkedList<Record> groupList) {
        this.groupList = groupList;
    }
    
}
