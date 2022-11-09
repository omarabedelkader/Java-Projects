/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleLinkedList2;

/**
 *
 * @author Omar
 * @param <AnyType>
 */
public class SLLNode <AnyType> {
    /***********Fields***********/
    private AnyType Data;
    private SLLNode Next;

     
    /*****************************/
    
    
    /********Constructors **********/
    public SLLNode() {
        
    }

    public SLLNode(AnyType Data) {
        this.Data = Data;
        Next=null;
    }

    public SLLNode(AnyType Data, SLLNode Next) {
        this.Data = Data;
        this.Next = Next;
    }
    /******************************/
    
   /************MEthod
     * @return s***********/
    public AnyType getData() {
        return Data;
    }

    public SLLNode getNext() {
        return Next;
    }

    public void setData(AnyType Data) {
        this.Data = Data;
    }

    public void setNext(SLLNode Next) {
        this.Next = Next;
    }
    
   /*******************************/
    
    
   
    
    
    
}
