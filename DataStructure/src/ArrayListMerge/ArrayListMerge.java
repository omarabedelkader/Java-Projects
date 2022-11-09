/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListMerge;

/**
 *
 * @author Omar
 */
public class ArrayListMerge {
    
    private Node head;
    private Node tail;
    private int size;
    
    public ArrayListMerge(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void addFromFront(int e){
        if(this.size == 0){
            Node n = new Node(e);
            this.head = n;
            this.tail = n;
        }
        else{
            Node n = new Node(e);
            n.setNext(this.head);
            this.head = n;
            this.size++;
        }
    }
    
        public void addFromBack(int e){
        if(this.size == 0){
            Node n = new Node(e);
            this.head = n;
            this.tail = n;
        }
        else{
            Node n = new Node(e);
            this.tail.setNext(n);
            this.tail = n;
            this.size++;
        }
    }
        
        public void print(){
       //     if(this.size == 0){
         //       System.out.println("the list is empty");
        //    }
      //      else{
      int i=0;
                int arr[]=new int[size];
                Node current = this.head;
                while(current != null){
                   
                     arr[i]=current.getE();
                     i++;
                     current=current.getNext();
                }
                    for (int j=arr.length-1; j>=0;j--){
                        System.out.println(arr[j]);
                    }
           //     }
        }
    
        
    public static void main(String args[]){
     /*   int arr1[] = {1,2,3,4,5,7,9,20};
        int arr2[] = {6,7,8,9,10};
        int k=arr1.length;
        
        int arrM[] = new int[arr1.length+arr2.length];
        
        for(int i=0; i<arr1.length; i++){
            arrM[i] = arr1[i];
        }
        
        while(k<arrM.length){
        for(int i=0; i<arr2.length; i++){
            
                arrM[k] = arr2[i];
                k++;
            }
        }
        
        for(int i=0; i<arrM.length; i++){
          //  System.out.println(arrM[i]);
        }
    */    
        ArrayListMerge n1 = new ArrayListMerge();
        n1.addFromBack(4);
        n1.addFromBack(5);
        n1.print();
        
    }
    
}
