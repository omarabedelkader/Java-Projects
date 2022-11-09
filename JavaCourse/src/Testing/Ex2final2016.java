/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author Omar
 */
public class Ex2final2016 {
    public static void main(String args[]){
        System.out.println(StringToDouble("3,56"));
    }
    public static double StringToDouble(String a){
        int count =0;
        double r = 0;
        boolean b = false;
        for(int i=0; i<a.length();i++)
            if(a.charAt(i)==',')
                count ++;
        if(count == 1)
           for(int i=0; i<a.length();i++)
               if((a.charAt(i)>='0' && a.charAt(i)<='9') || a.charAt(i) ==',')
                   b = true;
        if(b)
            r = Double.parseDouble("a");
        else
            return 0.0;
        return r;
    }
}
