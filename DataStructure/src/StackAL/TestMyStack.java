/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAL;

/**
 *
 * @author Omar
 */
public class TestMyStack {
 
    public static void main(String args[]){
        MyStack s = new MyStack(5);
        
        s.push(0);
        s.push(1);
        s.push(2);
        s.print();
        s.pop();
        s.print();
        s.makeEmpty();
        s.print();
    }
}
