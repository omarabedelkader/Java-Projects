/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedQueue;

/**
 *
 * @author Omar
 */
public class MyLinkedQueue<AnyType> {

    private Node<AnyType> front;
    private Node<AnyType> back;
    private int size;

    public MyLinkedQueue() {
        front = null;
        back = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void makeEmpty() {
        front = null;
        back = null;
        size = 0;
    }

    public AnyType getFront() {
        if (isEmpty()) {
            throw new RuntimeException();
        }

        return front.getData();
    }

    public void enQueue(AnyType value) {
        Node<AnyType> newNode = new Node<AnyType>(value);

        if (isEmpty()) {
            front = back = newNode;
        } else {
            back.setNextNode(newNode);
            back = newNode;
        }
        size++;
    }
    
    public AnyType deQueue(){
        if(isEmpty())
            throw new RuntimeException();
        AnyType removedNode = front.getData();
        front = front.getNextNode();
        size --;
        if(front == null){
            back = null;
        }
        return removedNode;
    }
    
    public void print(){
        if(isEmpty()){
            System.out.print("Queue is empty");
        }
        else{
            Node <AnyType> currentNode = front;
            while(currentNode != null){
                System.out.println(currentNode.getData());
                currentNode = currentNode.getNextNode();
            }
        }
    }
}
    

