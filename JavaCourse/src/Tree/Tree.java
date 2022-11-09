package Tree;

public class Tree {
    public static void main(String args[]){
        int lines = 5;
        int spaces = 4;
        int stars = 1;
        
        for(int i = 0; i<lines; i++){
            for(int j = 0; j<spaces; j++){
                System.out.print(" ");
            }
            for(int z = 0; z < stars; z++){
                System.out.print("*");
            }
            System.out.println();
            spaces --;
            stars += 2;
        }
        for(int a=0;a<2;a++){
            System.out.println("   * *"); 
        }
    }
}
