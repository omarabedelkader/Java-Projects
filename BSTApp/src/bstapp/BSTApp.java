package bstapp;

import java.util.Stack;

class Node{
    int data;
    Node left;
    Node right;
}

class BST{
    
    public Node createNewNode(int k){
        Node node = new Node();
        node.data = k;
        node.left = null;
        node.right = null;
        return node;
    }
    
    public Node insertNode(Node node, int element){
        if(node == null){
            node = createNewNode(element);
        }else{
            if(node.data >= element){
                node.left = insertNode(node.left, element);
            }else{
                node.right = insertNode(node.right, element);
            }
        }
        return node;
    }
    
    static Node insertIterative(Node root, int data){
        Node newnode = new Node();
        newnode.data = data;

        Node x = root;

        Node y = null;

        while (x != null) {
            y = x;
            if (data < x.data)
                x = x.left;
            else
                x = x.right;
        }

        if (y == null)
            y = newnode;
        else if (data < y.data)
            y.left = newnode;
        else
            y.right = newnode;

        return root;
    }
    
    public boolean searchNode(Node node, int element){
        if(node == null){
            return false;
        }else if(node.data == element){
            return true;
        }else if(node.data >= element){
            return searchNode(node.left, element);
        }else{
            return searchNode(node.right, element);
        }
    }
    
    public int findMinData(Node node){
        if(node == null){
            System.out.println("Tree empty");
            return -1;
        }
        Node currentNode = node;
        
        while(currentNode.left != null){
            currentNode = currentNode.left;
        }
        
        return currentNode.data;
    }
    
    public int findMinDataRec(Node node){
        if(node == null){
            System.out.println("Tree empty");
            return -1;
        }else if(node.left == null){
            return node.data;
        }else{
            return findMinDataRec(node.left);
        }
    }
    
    public Node findMin(Node node){
        if(node == null){
            System.out.println("Tree empty");
            return null;
        }
        Node currentNode = node;
        
        while(currentNode.left != null){
            currentNode = currentNode.left;
        }
        
        return currentNode;
    }
    
    public Node deleteNode(Node node, int data){
        if(node == null){
            return node;
        }else if(data < node.data){
            node.left = deleteNode(node.left, data);
        }else if(data > node.data){
            node.right = deleteNode(node.right, data);
        }else{//node is found and ready to be deleted
            //node with no child
            if(node.left == null && node.right == null){
                //delete node
                node = null;
                return node;
            }
            //node with one child
            else if(node.left == null){
                Node temp = node;
                node = node.right;
                //delete temp
                return node;
            }else if(node.right == null){
                Node temp = node;
                node = node.left;
                //delete temp;
                return node;
            }
            //node with two children
            else{
                Node temp = findMin(node.right);
                node.data = temp.data;
                node.right = deleteNode(node.right, temp.data);
                
            }
        }
        return node;
    }
    
    public void preOrder(Node node) {
        if(node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
        
    }
    
    public int getDepth(Node node){
        if (node == null)
            return -1;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = getDepth(node.left);
            int rDepth = getDepth(node.right);
  
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
             else
                return (rDepth + 1);
        }
    }
    
    public int findHeight(Node node){
        if(node == null){
            return -1;
        }
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

public class BSTApp {
    public static void main(String[] args) {
        BST a = new BST();
        Node root = null;
        
        root = a.insertNode(root, 8);
        root = a.insertNode(root, 3);
        root = a.insertNode(root, 10);
        root = a.insertNode(root, 4);
        root = a.insertNode(root, 6);
        root = a.insertNode(root, 7);
        root = a.insertNode(root, 1);
        root = a.insertNode(root, 14);
        root = a.insertNode(root, 13);
        
        root = a.insertIterative(root, 17);
        root = a.insertIterative(root, 5);
        
        a.preOrder(root);
        
        String test = "1 97";
        
        System.out.println();
        
        int temp = Integer.parseInt(test.substring(2));
        System.out.println(temp);
    }
    
}
