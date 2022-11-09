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
public class number3{


    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(5);
        tree.root.left = new Node(7);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(9);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node (1);

        System.out.println("number of leafs is : "
                + tree.getLeafNumber());
    }
    
    

}
