/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleLinkedList;

/**
 *
 * @author Omar
 */
public class SSLNode{
    private int Data;
    private SSLNode Next;

    public SSLNode() {
    }

    public SSLNode(int Data) {
        this.Data = Data;
        Next = null;
    }

    public SSLNode(int Data, SSLNode Next) {
        this.Data = Data;
        this.Next = Next;
    }

    public int getData() {
        return Data;
    }

    public SSLNode getNext() {
        return Next;
    }

    public void setData(int Data) {
        this.Data = Data;
    }

    public void setNext(SSLNode Next) {
        this.Next = Next;
    }
    
    
    
}
