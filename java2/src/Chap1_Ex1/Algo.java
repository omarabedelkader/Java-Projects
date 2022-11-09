/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap1_Ex1;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Omar
 */
public class Algo {
    public static Queue<Integer> queue;
    public static void main(String args[]){
        int arr[] = {-4, 3, -9, 0, 4, 1};
        int arr1[] = {1,2,3,4,5};
        
        arr = sortArr(arr);
        
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
//        plusMinus(arr);
//        
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
        
        
        //reversequeue();
        
//        int arr1[] = {1,2,3,4,5};
//        
//        int arr3[] = rotateLeft(4, arr1);
//        
//        for(int i = 0; i<arr3.length; i++){
//            System.out.println(arr3[i]);
//        }


        
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Enter string arr length");
//        int stringsSize = input.nextInt();
//        
//        String stringArr[] = new String[stringsSize];
//        System.out.println("Enter strings");
//        for(int i = 0; i<stringsSize; i++){
//            stringArr[i] = input.next();
//        }
//        System.out.println("Enter queries arr length");
//        int queriesSize = input.nextInt();
//        
//        String querieArr[] = new String[queriesSize];
//        System.out.println("Enter queries");
//        for(int i = 0; i<queriesSize; i++){
//            querieArr[i] = input.next();
//        }

//        int [] arr = new int[querieArr.length];
//        arr = matchingStrings(stringArr,querieArr);
//            
//        for(int i = 0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }

//        String stringArr[] = {"aba", "baba", "aba", "xzxb"};
//        String querieArr[] = {"aba", "xzxb", "ab"};
        
        

    }
    
    public static void plusMinus(int arr[]) {
    
        double pos=0, neg=0, zero=0;
        double posRes, negRes, zeroRes;
        
        for(int value:arr){
            if(value>0){
                pos ++;
            }else if(value<0){
                neg ++;
            }else{
                zero ++;
            }
        }
        
        posRes = pos/arr.length;
        negRes = neg/arr.length;
        zeroRes = zero/arr.length;
        
        System.out.format("%.6f", posRes);
        System.out.println();
        System.out.format("%.6f", negRes);
        System.out.println();
        System.out.format("%.6f", zeroRes);
        System.out.println();
    }
    
    
    static void reversequeue()
    {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
    }
    
    public static int[] rotateLeft(int d, int[] arr) {
    // Write your code here
        
        for(int j = 0; j < d; j++){
            int temp = arr[0];
            for(int i = 1; i < arr.length; i++){
                arr[i-1] = arr[i];
            }
            arr[arr.length-1] = temp;
        }
        return arr;
    }
    
    public static void fibonacci(int n) {
        if (n == 0) {
            System.out.print(0);
        } else if (n == 1) {
            System.out.print(0);
            System.out.print(1);
        } else {
            int res[] = new int[n];
            res[0] = 0;
            res[1] = 1;
            for (int i = 2; i < n; i++) {
                res[i] = res[i - 1] + res[i - 2];
            }
            for (int i = 0; i < n; i++) {
                System.out.println(res[i]);
            }
        }
    }
    
    public static void printFibonacci(int n){
        int num1=0, num2=1, res;
        
        System.out.print(num1 + " " + num2);
        for(int i = 2; i < n; i++){
            res = num1 + num2;
            System.out.print(" "+res);
            num1 = num2;
            num2 = res;
        }
    }
    
    public static int[] matchingStrings(String[] strings, String[] queries) {
    // Write your code here
        int count[] = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int num = 0;
            for(int j = 0; j < strings.length; j++){
                if(strings[j].equals(queries[i])){
                    System.out.println("test");
                    num ++;
                }
                    
            }
            
            count[i] = num;
        }
        return count;
    }
    
    public static int[] reverseArr(int[] arr){
        int temp[] = new int[arr.length];
        int j = arr.length-1;
        for(int i = 0; i<=arr.length/2; i++){
            temp[j] = arr[i];
            temp[i] = arr[j];
            j--;
        }
        return temp;
    }
    
    public static int[] sortArr(int [] arr){
        int temp, temp2=1;
        
        for(int i = 0; i<arr.length-1; i++){
            for(int j = temp2; j<arr.length; j++){
                if(arr[i] >= arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            temp2 ++;
        }
        return arr;
    }
    
}
