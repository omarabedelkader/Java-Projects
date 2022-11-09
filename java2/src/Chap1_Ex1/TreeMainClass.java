package Chap1_Ex1;

public class TreeMainClass {
    public static void main(String args[]){
        TreeTest tree = new TreeTest();
        TreeNode root = new TreeNode();
        
        tree.insert(root, 15);
        tree.insert(root, 10);
        tree.insert(root, 20);
        tree.insert(root, 12);
        
        //tree.print(root);
    }
}
