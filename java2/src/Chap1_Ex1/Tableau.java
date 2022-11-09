package Chap1_Ex1;

public class Tableau {

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 5,7};
        int somme = 0;
        int produit = 1;
        int carre [][] = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};

        for (int i = 0; i < arr.length; i++) {
            somme += arr[i];
            produit *= arr[i];
        }

        System.out.println("trie?: " + trie(arr));
        
        printTable(arr);
        
        arr = inverser(arr);

        printTable(arr);
        
        arr = inverser(arr);

        printTable(arr);
        
        System.out.println("trie?: " + trie(arr));

        System.out.println("somme: " + somme + " produit: " + produit);
        
        arr = supprimerOccurence(arr, 5);
        
        printTable(arr);
        
        printCarre(carre);
    }
    
    public static void printTable(int[] arr1){
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(i + ": " + arr1[i]);   
        }
        System.out.println();
    }
    
    public static void printCarre(int[][] arr1){
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j] + ", ");
            }
            System.out.println();
        }
    }
    
    public static void pointsCols(int[][] arr1){
        int max = arr1[0][0];
        int maxJ = 0;
        int min = arr1[0][arr1[0].length];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                if(arr1[i][j]>=max){
                    max = arr1[i][j];
                    min = arr1[i][j];
                    maxJ = j;
                }    
            }
            for(int z=i; z<arr1[i].length; z++){
                if(arr1[i][maxJ]>=min){
                    
                }
            }
        }
    }

    public static int[] inverser(int arr1[]) {
        int arrLength = arr1.length;
        int tempArr[] = new int[arr1.length];

        int l = arr1.length;
        int n;

        if (l % 2 == 0) {
            n = l / 2;
        } else {
            n = (l / 2);
        }

        for (int i = 0; i < n; i++) {
            tempArr[l - 1 - i] = arr1[i];
            tempArr[i] = arr1[l - 1 - i];
        }

        if (l % 2 != 0) {
            tempArr[n] = arr1[n];
        }

        return tempArr;
    }

    public static boolean trie(int arr1[]) {
        int next = 1;
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] > arr1[next]) {
                return false;
            }
            next++;
        }
        return true;
    }
    
    public static int[] supprimerOccurence(int arr1[], int v){
        
        int j = 0, count = 0;
        
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != v){
                count ++;
            }
        }
        
        int[] tempArr = new int[count];
        
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != v){
                tempArr[j] = arr1[i];
                j ++;
            }
        }
        return tempArr;
    }

}
