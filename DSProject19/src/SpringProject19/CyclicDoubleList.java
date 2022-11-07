/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringProject19;

/**
 *
 * @author Anthony
 * @param <AnyType>
 */
public class CyclicDoubleList<AnyType> {

    private DoubleNode<AnyType> head;
    private int listSize;

    public CyclicDoubleList() {
        head = null;
        listSize = 0;
    }

    public int size() {
        return listSize;
    }

    public boolean empty() {
        return listSize == 0;
    }

    public AnyType front() {
        if (empty()) {
            throw new RuntimeException();
        } else {
            return head.getData();
        }
    }

    public AnyType back() {
        if (empty()) {
            throw new RuntimeException();
        } else {
            DoubleNode<AnyType> prev = head.getPrevious();
            return prev.getData();
        }
    }

    public DoubleNode<AnyType> head() {
        return head;
    }

    public int count(AnyType e) {
        int count = 0;
        if (empty()) {
            System.out.println("List is Empty");
        } else {
            DoubleNode<AnyType> current = head;
            do {
                if (current.getData() == e) {
                    count++;
                }
                current = current.getNext();
            } while (current != head);
        }
        return count;
    }

    public void push_front(AnyType e) {

        DoubleNode<AnyType> n = new DoubleNode<AnyType>(e);
        DoubleNode<AnyType> last = new DoubleNode<AnyType>();

        if (empty()) {

            n.setNext(n);
            n.setPrevious(n);
            head = n;
            listSize++;
        } else {

            last.setNext(n);
            n.setPrevious(last);
            n.setNext(head);
            head.setPrevious(n);
            head = n;
            listSize++;
        }
    }

    public void push_back(AnyType e) {

        DoubleNode<AnyType> n = new DoubleNode<AnyType>(e);

        if (empty()) {

            n.setNext(n);
            n.setPrevious(n);
            head = n;
            listSize++;
        } else {
            head.getPrevious().setNext(n);
            n.setPrevious(head.getPrevious());
            n.setNext(head);
            head.setPrevious(n);
            listSize++;
        }
    }

    public AnyType pop_front() {
        if (empty()) {
            throw new RuntimeException();
        } else {
            /*head.getNext().setPrevious(head.getPrevious());
            head.getPrevious().setNext(head.getNext());
            head = head.getNext();
            listSize--;*/
            
            DoubleNode <AnyType> last = head.getPrevious();
            DoubleNode <AnyType> newHead = head.getNext();
            DoubleNode <AnyType> oldHead = head; 
            head = newHead;
            last.setNext(newHead);
            head.setPrevious(last);
            listSize --;
            return oldHead.getData();
        }
    }

    public AnyType pop_back() {
        if (empty()) {
            throw new RuntimeException();
        } else {/* 
            deleted = (AnyType) head.getPrevious().getData();
            head.getPrevious().getPrevious().setNext(head);
            head.setPrevious(head.getPrevious().getPrevious());
            head = head.getNext();
            listSize--;*/
            DoubleNode <AnyType> oldLast = head.getPrevious();
            DoubleNode <AnyType> newLast = oldLast.getPrevious();
            AnyType e = oldLast.getData();
            head.setPrevious(newLast);
            newLast.setNext(head);
            listSize --;
            return e;
            
        }
    }
    
    public int erase(AnyType e){
        int count = 0;
        if(empty()){
            System.out.print("List is empty");
            return -1;
        }
        else{
            DoubleNode <AnyType> current = new DoubleNode <AnyType> ();
                while(current.getNext() != head){
                    if(current.getData() == e){
                        current.getPrevious().setNext(current.getNext());
                        current.getNext().setPrevious(current.getPrevious());
                        count ++;
                    }
                }
        }
        return count;
    }
    
    
    public void print() {
        DoubleNode<AnyType> current = new DoubleNode<AnyType>();

        current = head;

        for (int i = 0; i < listSize; i++) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

}
