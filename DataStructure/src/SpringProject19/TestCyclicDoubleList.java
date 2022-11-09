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
        
        l.push_front(3);
        l.push_front(4);
        l.push_front(4);
        l.push_front(11);
        l.push_front(10);
        l.push_front(1);
        l.push_front(5);
        l.push_front(7);
        l.push_front(5);
        l.push_back(16);
        l.push_front(11);
        l.push_front(11);
        
        l.erase(11);
        l.print();
        System.out.println("Size: " + l.size());
        System.out.println("front: " + l.front());
        System.out.println("back: " + l.back());
        System.out.println("count: " + l.count(4));
        
        
    }
}
