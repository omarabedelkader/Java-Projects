/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number3;

/**
 *
 * @author Omar
 */
public class Node {
    
    int data;
    Node left; 
    Node right;

    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}
