package Chap1_Ex1;

public class StackArray {
    private int top;
    private int arr[];
    
    public StackArray(int size){
        this.arr = new int[size];
        this.top = -1;
    }
    
    public int getTop(){
        return this.top;
    }
    
    public void push(int e){
        if(top == arr.length-1){
            System.out.println("Error: stack full");
        }
        top ++;
        arr[top] = e;
    }
    
    public int pop(){
        if(top == -1){
            System.out.println("Error: stack empty");
            return -1;
        }
        int temp = arr[top];
        top --;
        return temp;
    }
    
    public void print(){
        if(top == -1){
            System.out.println("Error: stack empty");
            return;
        }else{
            StackArray temp = new StackArray(arr.length);
            while(top >= 0){
                System.out.println(this.arr[top]);
                temp.push(this.pop());
            }
            
            while(temp.getTop() >=0){
                this.push(temp.pop());
            }
            

        }
    }
}
