/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author Omar
 */
public class Exchange extends Student {
    
    public Exchange(String name, String id, int credits) {
        super(name, id, credits);
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public String getId(){
        return id;
    }
    
    @Override
    public int getCredits(){
        return credits;
    }
    
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public void setId(String id){
        this.id = id;
    }
    
    @Override
    public void setCredits(int credits){
        this.credits = credits;
    }
    
    public double fees(){
        return credits*500;
    }
    
    public String toString(){
        return "Exchange student name = " + name + ", id = " + id + ", credits = " + fees();
    }
}
