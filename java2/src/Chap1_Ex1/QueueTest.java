package Chap1_Ex1;

public class QueueTest {
    private Node head;//remove from head
    private Node tail;//add from tail
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void add(int data){
        Node node = new Node(data);
        if(tail != null){
            tail.setNext(node);
        }
        tail = node;
        if(head == null){
            head = node;
        }
    }
    
    public int remove(){
        int data = (int)head.getData();
        head = head.getNext();
        if(head == null){
            tail = null;
        }
        return data;
    }
}
