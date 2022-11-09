package testvoidmethod;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class test {
    
    
    

    public static void main(String args[]) {
        

//        double number1 = 10.123456;
//        double n = 17.777779;
//        double number2 = (int) (Math.floor(n * 10)) / 10.0;
//        System.out.println(number2);



//        int arr[] = {6, 2, 8, 4, 10};
//        int temp;
//        
//        for(int i = 0; i< arr.length-1; i++){
//            for(int j = i+1; j<arr.length; j++){
//                if(arr[i] > arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        
//        for(int i = 0; i< arr.length; i++){
//            System.out.println(arr[i]);
//        }
        

//        Stack <Object> stk = new Stack<>();
//        
//        stk.push("Anthony");
//        stk.push(1);
//        stk.push("test");
//        
//        Stack <Object> stk1 = new Stack();
//        
//        
//        for(Object o: stk){
//            System.out.println(o);
//        }
//        
//        stk.push("cherfane");
//        
//        System.out.println("------");
//        for(Object o: stk){
//            System.out.println(o);
//        }

//        ArrayList<Integer []> al = new ArrayList();
//        Integer arr[] = {76, 123456};
//        
//        al.add(arr);
//        
//        arr[0] = 71;
//        arr[1] = 12345;
//        
//        al.add(arr);
//        
//        
//        for(Integer[] i : al){
//            for(int y = 0; y < i.length; y++){
//                System.out.print(i[y] + " / ");
//            }
//            System.out.println();
//        }
        
        LinkedHashMap<Integer, LinkedList<Integer[]>> mainList = new LinkedHashMap<>();
        
//        for(Map.Entry<Integer, LinkedList<Integer[]>> i : mainList.entrySet()){
//            System.out.println();
//        }

//        Integer arr[] = new Integer[2];
//        
//        arr[0] = 70;
//        arr[1] = 12345;
//        
//        LinkedList<Integer[]> ll = new LinkedList<>();
//        ll.add(arr); 
//        
//        arr[0] = 71;
//        arr[1] = 678910;
//                
//        ll.add(arr);
//        
//        arr[0] = 81;
//        arr[1] = 12310;
//        
//        LinkedList<Integer[]> ll1 = new LinkedList<>();
//        ll1.add(arr);
//        
//        arr[0] = 81;
//        arr[1] = 12310;
//                
//        ll1.add(arr);
//        
//        mainList.put(1, ll);
//        mainList.put(2, ll1);
//        
//        for (Integer record: mainList.keySet()) {
//            String key = record.toString();
//            LinkedList<Integer[]> value = mainList.get(record);
//            System.out.print(key + " ");
//            for(Integer[] i : value){
//                for(int y = 0; y < i.length; y++){
//                    System.out.print(i[y] + " ");
//                }
//            }
//            System.out.println();
//            
//        }

    String s = "Anthony";
    
        System.out.println(test(s));
        System.out.println(s);
        
    }
    
    public static String test(String x){
        x += "haha";
        return x;
    }
}
