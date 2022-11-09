package FruitExercice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Basket{
    ArrayList <Fruit> fruitBasket = new ArrayList<Fruit>();
    
    public void add(Fruit f){
        fruitBasket.add(f);
    }
    
    public double getPrice(){
        double sum = 0;
        
        for(int i = 0; i < fruitBasket.size(); i ++)
            sum += fruitBasket.get(i).getPrice();
        
        return sum;
    }
    
    public void deleteItemsByCountry(String  c){
        Fruit x;
        String ct;
        Iterator<Fruit> iter = fruitBasket.iterator();
        while(iter.hasNext()){
            x=iter.next();
            ct = x.getCountry();
            if(c.equals(ct)) 
                iter.remove();
        }
    }
    
    public Fruit findFirstItemByCountry(String c){
        String f = "";
        String ct;
        Fruit x;
        Iterator <Fruit> it = fruitBasket.iterator();
        while(it.hasNext()){
            x = it.next();
            ct = x.getCountry();
            if(c.equals(ct))
                return x;
        }
        return null;
    }
    
    public void SortCountryType(){
            Collections.sort(fruitBasket, new CompareFruit());
    }
    
    private class CompareFruit implements Comparator<Fruit>{
        public int compare(Fruit f1, Fruit f2){
            String c1 = f1.getCountry();
            String c2 = f2.getCountry();
            int res = c1.compareTo(c2);
            if(res != 0)
                return res;
            res = (f1.getType()).compareTo(f2.getType());
            return res;
        }
    }
    
    public String toString(){
        String aff = "";
        for (Fruit x : fruitBasket){
            aff = aff + x.toString() + "\n";
        }
        return aff;
    }
}
