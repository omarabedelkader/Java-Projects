package Chap1_Ex1;

public class StackTest {
    private Node top;
    
    public StackTest(){
        top = null;
    }
    
    public Node getTop(){
        return top;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
    public void push(int data){
        Node node = new Node(data);
        if(top == null){
            top = node;
        }else{
            node.setNext(top);
            top = node;
        }
    }
    
    public int pop(){
        int data;
        if(top == null)
            return-1;
        else{
            data = (int)top.getData();
            top = top.getNext();
        }
        return data;
    }
    
    public void print(){
        if(top == null)
            System.out.println("list empty");
        else{
            int temp;
            StackTest st = new StackTest();
            while(this.top != null){
                temp = pop();
                System.out.print(temp + ", ");
                st.push(temp);
            }
            while(st.top != null){
                this.push(st.pop());
            }
            
        }
    }
}
