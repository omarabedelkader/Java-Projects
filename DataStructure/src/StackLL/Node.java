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
public class Node {
    private Node next;
    private int e;
    
    public Node(int e){
        this.next = null;
        this.e = e;
    }
    
    public void setE(int e){
        this.e = e;
    }
    
    public int getE(){
        return this.e;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
    
    public Node getNext(){
        return this.next;
    }
}
