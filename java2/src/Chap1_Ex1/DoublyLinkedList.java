package Chap1_Ex1;

public class DoublyLinkedList {
    private DLLNode head;
    private DLLNode tail;
    
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public DLLNode getHead() {
        return head;
    }

    public void setHead(DLLNode head) {
        this.head = head;
    }
    
    public DLLNode getTail(){
        return tail;
    }
    
    public void setTail(DLLNode tail){
        this.tail = tail;
    }
    
    public void insertAtFront(int data){
        if(head == null){
            DLLNode temp = new DLLNode(data);
            head = temp;
            head.setNext(null);
            head.setPrevious(null);
            tail = head;
        }else if(head == tail){
            DLLNode temp = new DLLNode(data);
            head.setPrevious(temp);
            temp.setNext(head);
            temp.setPrevious(null);
            head = temp;
        }else{
            DLLNode temp = new DLLNode(data);
            head.setPrevious(temp);
            temp.setNext(head);
            head = temp;
        }
    }
    
    public void insertAtBack(int data){
        DLLNode temp = new DLLNode(data);
        if(head == null){
            head = temp;
            head.setNext(null);
            head.setPrevious(null);
            tail = head;
        }else if(head == tail){
            head.setNext(temp);
            temp.setPrevious(head);
            temp.setNext(null);
            tail = temp;
        }else{
            temp.setPrevious(tail);
            temp.setNext(null);
            tail.setNext(temp);
            tail = temp;
        }
    }
    
    public void print(){
        if(head == null){
            System.out.println("Liste vide");
        }else{
            DLLNode temp = this.head;
            while(temp != null){
                System.out.print(temp.getData() + ", ");
                temp = temp.getNext();
            }
            System.out.println();
        }
    }
    
    public int removeFromHead(){
        int temp;
        if(head == null){
            temp = -1;
        }else if(head == tail){
            temp = (int)head.getData();
            this.head = null;
            this.tail = null;
        }else{
            temp = (int)head.getData();
            this.head = head.getNext();
            this.head.setPrevious(null);
        }
        return temp;
    }
    
    public int removeFromTail(){
        int temp;
        if(head == null){
            temp = -1;
        }else if(head == tail){
            temp = (int)head.getData();
            this.head = null;
            this.tail = null;
        }else{
            temp = (int)tail.getData();
            this.tail = tail.getPrevious();
            this.tail.setNext(null);
        }
        return temp;
    }
    
}
