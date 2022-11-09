package Testing;

import java.util.HashMap;

public class GenericsTest {
    public static void main(String args[]){
        HashMap happy = new HashMap();
        
        happy.put("a", 10);
        happy.put("b", 2);
        happy.put("c", 5);
        
        System.out.println(happy.get("c"));
    }
}
