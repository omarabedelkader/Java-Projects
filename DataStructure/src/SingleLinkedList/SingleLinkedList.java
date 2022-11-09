/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleLinkedList;

/**
 *
 * @author Omar
 */
public class SingleLinkedList {
    
    private SSLNode head;
    private SSLNode tail;
    private int size;
    
    public static void main(String args []){
        SingleLinkedList l = new SingleLinkedList();
        l.insertAtFront(1);
        l.insertAtFront(2);
        l.insertAtBack(4);
        l.print();
        System.out.println(" ");
        l.insertAtIndex(3,3);
        l.print();
        System.out.println(" ");
        l.removeAtIndex(2);
        l.print();
        System.out.println(" ");
        System.out.println(l.MaxNumber());
        System.out.println(l.evenNumbers());
        
    }
    
    public SingleLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public void makeEmpty(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public int length(){
        return this.size;
    }
    
    public void insertAtFront(int e){
        if(isEmpty()){
            SSLNode n = new SSLNode(e);
            this.head = n;
            this.tail = n;
            this.size = 1;
        }
        else{
            SSLNode n = new SSLNode(e);
            n.setNext(this.head);
            this.head = n;
            this.size ++;
        }
    }
    
    public void insertAtBack(int e){
        if (isEmpty()){
            SSLNode n = new SSLNode (e);
            this.head = n;
            this.tail = n;
            this.size = 1;
        }
        else{
            SSLNode n = new SSLNode(e);
            this.tail.setNext(n);
            this.tail = n;
            this.size ++;
        }
    }
    
    public void print(){
        if (isEmpty()){
            System.out.println("the list is empty");
        }
        else{
            SSLNode current = this.head;
            while (current != null){
                System.out.print(current.getData());
                current = current.getNext();
            }
        }
    }
    
    public int removeFromHead(){
        int element = this.head.getData();
        this.head = this.head.getNext();
        this.size --;
        return element;
    }
    
    public int removeFromLast(){
        SSLNode previousToLast = this.head;
        while (previousToLast != this.tail){
            previousToLast = previousToLast.getNext();
        }
        this.tail = previousToLast;
        this.size --;
        return previousToLast.getData();
    }
    
    public int evenNumbers(){
        SSLNode current = this.head;
        int count = 0;
        while (current != null){
            if (current.getData() % 2 == 0){
               count ++;          
            }
            current = current.getNext();
        }
        return count;
    }
    
    public int MaxNumber(){
        SSLNode current = this.head;
        int max = this.head.getData();
        while(current != null){
            if(current.getData() > max)
                max = current.getData();
        current = current.getNext();
        }
        return max;
    }
   
    public void insertAtIndex(int e, int index){
        SSLNode current = this.head;
        int count = 1;
        while (count < (index - 1)){
            current = current.getNext();
            count ++;
        }
        SSLNode n = new SSLNode(e);
        n.setNext(current.getNext());
        current.setNext(n);
        this.size ++;
    }
    
    public int removeAtIndex(int index){
        SSLNode current = this.head;
        SSLNode previous = null;
        int count = 1;
        while (count < index){
            previous = current;
            current = current.getNext();
            count ++;
        }
        int e = current.getData();
        previous.setNext(current.getNext());
        this.size --;
        return e;
    }
}
