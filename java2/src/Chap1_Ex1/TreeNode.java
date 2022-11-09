package Chap1_Ex1;

public class TreeNode {
    private TreeNode right, left;
    private int data;
    
    public TreeNode(){
        this.left = null;
        this.right = null;
    }
    
    public TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }
    
    public TreeNode getRight(){
        return this.right;
    }
    
    public TreeNode getLeft(){
        return this.left;
    }
    
    public void insert(int value){
        if(value <= this.data){
            if(left == null){
                left = new TreeNode(value);
            }else{
                left.insert(value);
            }
        }else{
            if(right == null){
                right = new TreeNode(value);
            }else{
                right.insert(value);
            }
        }
    }

    public int getData() {
        return data;
    }
    
    public boolean contains(int value){
        if(value == data){
            return true;
        }else if(value < data){
            if(left == null){
                return false;
            }else{
                return left.contains(value);
            }
        }else{
            if(right == null){
                return false;
            }else{
                return right.contains(value);
            }
        }
    }
    
    public void printInOrder(){
        if(left != null){
            left.printInOrder();
        }
        System.out.print(data + ",");
        if(right != null){
            right.printInOrder();
        }
    }
    
    public void printInfixe(Node racine){
        if(racine != null){
            left.printInOrder();
        }
    }
}
