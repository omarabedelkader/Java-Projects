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
public class Undergraduate extends Student{
    private boolean activities;
    private double gpa;

    public Undergraduate(String name, String id, int credits, boolean activities, double gpa) {
        super(name, id, credits);
        this.activities = activities;
        this.gpa = gpa;
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
    
    public boolean getActivities(){
        return activities;
    }
    
    public void setActivities(boolean activities){
        this.activities = activities;
    }
    
    public double getGpa(){
        return gpa;
    }
    
    public void setGpa(double gpa){
        do{
            if(gpa<1.0 || gpa>4.0)
                System.out.println("gpa should be between 1.0 and 4.0");
            else
                this.gpa = gpa;
        }while(gpa<1.0 || gpa>4.0); 
    }
    
    @Override
    public String toString(){
        return "name = " + name + ", id = " + id + ", credits = " + fees() + " gpa = " + gpa;
    }
    
    public double fees(){
        if(gpa>3.0){
            if(activities)
                return ((155*credits)+300) - (((155*credits)+300)*20/100);
            else
                return (155*credits) - ((155*credits)*20/100);
        }else{    
            if(activities)
                return (155*credits)+300;
            else
                return credits*155;
        }
    }
    
    public void changeGpa(double gpa){
        do{
            if(gpa<1.0 || gpa>4.0)
                System.out.println("gpa should be between 1.0 and 4.0");
            else
                this.gpa = gpa;
        }while(gpa<1.0 || gpa>4.0); 
    }
    
}
