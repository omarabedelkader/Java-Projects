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
public class DoubleNode <AnyType> {

    private AnyType Data;
    private DoubleNode Next, Previous;

    public DoubleNode(){
        Data = null;
        Next = null;
        Previous = null;
    }
    public DoubleNode(AnyType Data) {
        this.Data = Data;
        Previous = null;
        Next = null;
    }

    public DoubleNode(AnyType Data, DoubleNode Next, DoubleNode Previous) {
        this.Data = Data;
        this.Previous = Previous;
        this.Next = Next;
    }

    public AnyType getData() {
        return Data;
    }

    public DoubleNode getNext() {
        return Next;
    }
    
    public DoubleNode getPrevious(){
        return Previous;
    }

    public void setData(AnyType Data) {
        this.Data = Data;
    }

    public void setNext(DoubleNode Next) {
        this.Next = Next;
    }
    
    public void setPrevious(DoubleNode Previous){
        this.Previous = Previous;
    }
}
