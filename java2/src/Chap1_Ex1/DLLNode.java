package Chap1_Ex1;

public class DLLNode <T>{
    private DLLNode<T> next;
    private DLLNode<T> previous;
    private T data;
    
    public DLLNode(T data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public DLLNode<T> getNext() {
        return next;
    }

    public DLLNode<T> getPrevious() {
        return previous;
    }

    public T getData() {
        return data;
    }

    public void setNext(DLLNode<T> next) {
        this.next = next;
    }

    public void setPrevious(DLLNode<T> previous) {
        this.previous = previous;
    }

    public void setData(T data) {
        this.data = data;
    }
    
    
}
