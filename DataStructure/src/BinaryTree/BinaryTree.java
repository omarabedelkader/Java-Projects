/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author Omar
 */
public class BinaryTree {
  
    private Node root;

    /* 
    --Node-- 
    The binary tree is built using this nested node class. 
    Each node stores one data element, and has left and right 
    sub-tree pointer which may be null. 
    The node is a "dumb" nested class -- we just use it for 
    storage; it does not have any methods. 
     */
    public static class Node {

        Node left;
        Node right;
        int data;

        Node(int newData) {
            left = null;
            right = null;
            data = newData;
        }
    }

    /** 
    Creates an empty binary tree -- a null root pointer. 
     */
    public BinaryTree() {
        root = null;
    }

/** 
    Inserts the given data into the binary tree. 
    Uses a recursive helper. 
     * @param data
     */
    public void insert(int data) {
        root = insert(root, data);
    }

    /** 
    Recursive insert -- given a node pointer, recur down and 
    insert the given data into the tree. Returns the new 
    node pointer (the standard way to communicate 
    a changed pointer back to the caller). 
     */
    private Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        } else {
            if (data <= node.data) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }

        return (node); // in any case, return the new pointer to the caller 
    }


    /** 
    Returns the number of nodes in the tree. 
    Uses a recursive helper that recurs 
    down the tree and counts the nodes. 
     * @return 
     */
    public int size() {
        return (size(root));
    }

    private int size(Node node) {
	
	//Complete the code here

    }

    /** 
    Returns true if the given target is in the binary tree. 
    Uses a recursive helper. 
     * @param data
     * @return 
     */
    public boolean lookup(int data) {
        return (lookup(root, data));
    }

    /** 
    Recursive lookup  -- given a node, recur 
    down searching for the given data. 
     */
    private boolean lookup(Node node, int data) {
        if (node == null) {
            return (false);
        }

        if (data == node.data) {
            return (true);
        } else if (data < node.data) {
            return (lookup(node.left, data));
        } else {
            return (lookup(node.right, data));
        }
    }

    /** 
    Prints the node values in the "inOrder" order. 
    Uses a recursive helper to do the traversal. 
     */
    public void inOrder() {
        inorderTree(root);
        System.out.println();
    }

    private void inorderTree(Node node) {
        if (node == null) {
            return;
        }

        // left, node itself, right 
        inorderTree(node.left);
        System.out.print(node.data + "  ");
        inorderTree(node.right);
    }


    /** 
    Prints the node values in the "preOrder" order. 
    Uses a recursive helper to do the traversal. 
     */
    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    public void preOrder(Node node) {
        
	//Complete the code here

    }


    /** 
    Prints the node values in the "postOrder" order. 
    Uses a recursive helper to do the traversal. 
     */
    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    public void postOrder(Node node) {

	//Complete the code here

    }


    /** 
    Prints the node values in the "levelOrder" order. 
    Uses a helper to do the traversal. 
     */
    public void levelOrder() {
        levelOrder(root);
        System.out.println();
    }

    public void levelOrder(Node node) {

        if (node != null) {

            Queue<Node> q = new ArrayDeque<Node>();
            q.add(node);

            while (q.size() != 0) {

                Node currentNode = q.remove();
                System.out.print(currentNode.data + "  ");

                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
        }
    }

     /** 
    Changes the tree into its mirror image.    
    Uses a recursive helper that recurs over the tree, 
    swapping the left/right pointers. 
     */
    public void mirror() {

	//write the code here

    }

    private void mirror(Node node) {
        
	//write the code here

}

public void deleteNode(int x) {
        deleteNode(x, root);
    }
    
    private Node deleteNode(int x, Node n) {
        if (n != null) {
            if (x < n.data) {
                n.left=deleteNode(x, n.left);
            } 
            else if (x > n.data) {
                n.right=deleteNode(x, n.right);
            } 
            else if (n.left != null & n.right != null) {
			System.out.println("Deleted: "+ n.data);                
//                Node min = n.right;                
//                while (min.left != null) {
//                    min = min.left;
//                }
//                n.data = min.data;
                
                n.data = findMin(n.right).data;
                n.right= removeMinRight(n.right);
            }
            else{
                //Alternative code line
                System.out.println("Deleted: "+ n.data);    
                n = (n.left != null) ? n.left : n.right;
//                if(n.left != null)
//                    n = n.left;
//                else
//                    n = n.right;
            }
            
        }
        return n;
    }

    public Node removeMinRight(Node min) {
        if (min.left != null) {
            min.left=removeMinRight(min.left);
            return min;
        } else {
            return min.right;
        }
    }
    
    protected Node findMin( Node min ) {
        if( min != null )
            while( min.left != null )
                min = min.left;
        
        return min;
    }

//    public void deleteNodeWay2(int x) {
//	//complete the code here
//    }
//    
//    private Node deleteNodeWay2(int x, Node n) {
//	//complete the code here
//    }
//
//    public Node removeMaxLeft(Node max) {
//	//complete the code here
//    }
//    
//    private Node findMax( Node max ) {
// 	//complete the code here
//    }    

}


