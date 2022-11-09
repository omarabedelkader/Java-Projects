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
public class MyStack {
    
    private int arr[];
    private int top;
    private int size;
    
    public MyStack(int maxSize){
        this.arr = new int[maxSize];
        this.top = -1;
        this.size = 0;
    }
    
    public boolean isEmpty(){
        return this.size == 0;
    }
    
    public boolean isFull(){
        return arr.length == size;
    }
    public void makeEmpty(){
        this.size = 0;
        this.top = -1;
    }
    
    public int length(){
        return this.size;
    }
    
    public void push(int value){
        if(isFull()){
            System.out.print("Stack is full");
        }
        else{
            top = top + 1;
            this.arr[top] = value;
            this.size ++;
        }
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.print("Stack is empty");
            return -1;
        }
        else{
            int temp = arr[top];
            top = top-1;
            this.size --;
            return temp; 
        }
    }
    
    public int peek(){
        if(isEmpty()){
            System.out.print("Stack is Empty");
            return -1;
        }
        else{
            return arr[top];
        }
    }
    
    public void print(){
        if (isEmpty()){
            System.out.print("Stack is empty");
        }
        else{
            for(int i = top; i >= 0; i --){
                System.out.println(arr[i]);
            }
        }
    }
}
