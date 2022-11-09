/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackLL;

/**
 *
 * @author Omar
 */
public class MyLinkedStack {
    
    private Node top;
    private int size;
    
    public MyLinkedStack(){
        this.top = null;
        this.size = 0;
    }
    
    public boolean isEmpty(){
        return this.size == 0;
    }
    
    public void makeEmpty(){
        this.top = null;
        this.size = 0;
    }
    
    public int length(){
        return this.size;
    }
    
    public void push(int value){
        if(isEmpty()){
            Node n = new Node(value);
            top = n;
            this.size ++;
        }
        else{
            Node n = new Node(value);
            n.setNext(top);
            top = n;
            this.size ++;
        }
    }
    
    public int pop(){
        if (isEmpty()){
            System.out.print("Stack is empty");
            return -1;
        }
        else{
            int temp = top.getE();
            top = top.getNext();
            this.size --;
            return temp;
        }
    }
    
    public int peek(){
        if(isEmpty()){
            System.out.print("Stack is empty");
            return -1;
        }
        else{
            return top.getE();
        }
    }
    
    public void print(){
        if(isEmpty()){
            System.out.print("Stack is empty");
        }
        else{
            Node current = top;
            while(current != null){
                System.out.println(current.getE());
                current = current.getNext();
            }
        }
    }
}
