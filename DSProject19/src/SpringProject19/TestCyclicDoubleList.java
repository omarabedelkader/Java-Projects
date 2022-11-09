/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringProject19;

/**
 *
 * @author Omar
 */
public class TestCyclicDoubleList {
    
    public static void main(String args[]){
        CyclicDoubleList l = new CyclicDoubleList();
        
        l.push_back(0);
        l.push_back(1);
        l.push_front(2);
        l.push_front(3);
        l.push_front(4);
        l.push_front(5);
        l.pop_back(); 
        l.print();
        
    }
}
