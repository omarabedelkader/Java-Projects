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
public class Student {
    protected String name;
    protected String id;
    protected int credits;
    
    Student (String name, String id, int credits){
        this.name = name;
        this.id = id;
        this.credits = credits;
    }
    
    public String getName(){
        return name;
    }
    
    public String getId(){
        return id;
    }
    
    public int getCredits(){
        return credits;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setCredits(int credits){
        this.credits = credits;
    }
    
    @Override
    public String toString(){
        return "name = " + name + ", id = " + id + ", credits = " + credits;
    }
    
}
