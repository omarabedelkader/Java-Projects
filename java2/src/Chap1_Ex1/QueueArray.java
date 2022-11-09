package Chap1_Ex1;

public class QueueArray {
    int [] a;
    int front;
    int rear;
    
    public QueueArray(int size){
        a = new int[size];
        front = -1;
        rear = -1;
    }
    
    public boolean isEmpty(){
        if(front == -1 && rear == -1)
            return true;
        else
            return false;
    }
    
    public void enqueue(int e){
        if((rear+1)%a.length == front){
            System.out.println("Stack is full");
        }else if(front == -1 && rear == -1){
            front ++;
            rear ++;
            a[rear] = e;
        }else{
            rear = (rear+1)%a.length;
            a[rear] = e;
        }
    }
    
    public int dequeue(){
        int temp = 0;
        if(rear == -1 && front == -1){
            System.out.println("queue is empty");
        }else if(front == rear){
            temp = a[front];
            front = -1;
            rear = -1;
        }else{
            temp = a[front];
            front = (front+1)%a.length;
        }
        return temp;
    }
    
    public void print(){
        if(rear == -1 && front == -1){
            System.out.println("queue is empty");
        }else if()
    }
}
