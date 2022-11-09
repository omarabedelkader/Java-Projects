/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleLinkedList2;

import SingleLinkedList.SSLNode;

/**
 *
 * @author Omar
 * @param <AnyType>
 */
public class SLL <AnyType> {
    
  private   SLLNode<AnyType> Head;

    public SLL() {
        this.Head=null;
    }
    
    public SLL(SLLNode<AnyType> node) {
        this.Head = node;
    }

  
   public SLL(AnyType value) {
        this.Head = new SLLNode<>(value);
    }
   
   public boolean isEmpty(){
       return this.Head==null;
   }
   public void makeEmpty(){
    this.Head=null;
   }
   
   public int RecursiveLength(SLLNode<AnyType> node)
   {
       if(node==null)
          return 0;
       else
           return 1 + RecursiveLength(node.getNext());
   }
   
   public SLLNode<AnyType> getHead(){
       return this.Head;
   }
   
   public SLLNode<AnyType> getTailIterative(){
       if(this.isEmpty())
           return null;
       SLLNode<AnyType> temp = this.Head;
       while(temp.getNext() == null)
           temp = temp.getNext();
        return temp;
   }
   
   public SLLNode<AnyType> getTailRecurs(SLLNode<AnyType> First){
              if(First == null)
           return null;
              
              if(First.getNext() == null) //stoping condition
                  return First;
              else
                  return getTailRecurs(First.getNext()); //incrementation or iteration
   }
   
}
