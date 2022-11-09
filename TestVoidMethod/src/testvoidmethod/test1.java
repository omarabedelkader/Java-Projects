package testvoidmethod;
import java.util.*;
class Enfant{
    public static void main(String args[]) {
        ArrayList<Integer> l=new ArrayList<>();
        l=extraire("1\"15dsjk"
                + "1234 ioer@ w%#fnhj  8763d*&kd 23  789 kk(%@dd3452\" 875");
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i)+",");
        }
    }
    public static ArrayList<Integer> extraire(String s){
        ArrayList<Integer> list=new ArrayList<>();
        String a="";
        for(int i=0;i<s.length();i++){
             if(Character.isDigit(s.charAt(i))){
                 for(int j=i;j<s.length();j++){
                        if(Character.isDigit(s.charAt(j))){
                            a+=s.substring(j,j+1);
                        }else{
                            break;
                        }
                }
                 i=i+a.length();
                 
                 list.add(Integer.parseInt(a));
                 a="";
             }
        }return list;
    }
}
