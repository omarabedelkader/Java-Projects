package Chap1_Ex1;

public class LinkedListTest {

    private Node head;
    private Node tail;
    private int size;

    public void LinkedListTest() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node getHead() {
        return this.head;
    }

    public void setHead(Node n) {
        this.head = n;
    }
    
    public int getSize(){
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insertAtFront(int e) {
        if (isEmpty()) {
            Node n = new Node(e);
            this.head = n;
            this.tail = n;
            this.size = 1;
        } else {
            Node n = new Node(e);
            n.setNext(this.head);
            this.head = n;
            this.size++;
        }
    }

    public void insertAtBack(int e) {
        if (isEmpty()) {
            Node n = new Node(e);
            this.head = n;
            this.tail = n;
            this.size = 1;
        } else {
            Node n = new Node(e);
            this.tail.setNext(n);
            this.tail = n;
            this.size++;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.getData()+ ", ");
                temp = temp.getNext();
            }
            System.out.println();
        }
    }

    public int removeFromHead() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return -1;
        } else {
            int temp = (int) this.head.getData();
            this.head = this.head.getNext();
            size--;
            return temp;
        }
    }

    public int removeFromTail() {
        if (isEmpty()) {
            System.out.println("list is empty");
            return -1;
        }else if(this.head == this.tail){
            int temp = (int)this.head.getData();
            this.head = null;
            this.tail = null;
            return temp;
        } else {
            int temp = (int) this.tail.getData();
            Node current = this.head;
            while (current.getNext() != this.tail) {
                current = current.getNext();
            }
            this.tail = current;
            this.tail.setNext(null);
            this.size--;
            return temp;
        }
    }

    public int maxNumber() {
        if (isEmpty()) {
            System.out.println("list is empty");
            return -1;
        } else {
            int max = (int) this.head.getData();
            Node current = this.head;
            while (current != null) {
                if ((int) current.getData() >= max) {
                    max = (int) current.getData();
                }
                current = current.getNext();
            }
            return max;
        }
    }
    
}
