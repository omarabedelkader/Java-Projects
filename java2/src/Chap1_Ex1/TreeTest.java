package Chap1_Ex1;

public class TreeTest {
    public TreeNode insert(TreeNode root, int data){
        if(root == null){
            TreeNode n = new TreeNode(data);
            root = n;
        }else{
            if(root.getData() >= data){
                root.setLeft(insert(root.getLeft(), data));
            }else{
                root.setRight(insert(root.getRight(), data));
            }
        }
        return root;
        
    }
    
    
    public void print(TreeNode root){
        while(root != null){
            print(root.getLeft());
            System.out.print(root.getData()+ " ,");
            print(root.getRight());
        }
    }
}
