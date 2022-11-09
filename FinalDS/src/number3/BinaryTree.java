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
public class BinaryTree {
    
    Node root;

    int getLeafNumber() {
        return getLeafNumber(root);
    }

    int getLeafNumber(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        } else {
            return getLeafNumber(node.left) + getLeafNumber(node.right);
        }
    }
}
