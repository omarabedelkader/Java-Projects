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
public class Graduate extends Student{
    private boolean thesis;
    private String advisor;

    public Graduate(String name, String id, int credits, boolean thesis, String advisor) {
        super(name, id, credits);
        this.thesis = thesis;
        this.advisor = advisor;
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
    
    public String getAdvisor(){
        return advisor;
    }
    
    public void setAdvisor(String advisor){
        this.advisor = advisor;
    }
    
    public boolean getThesis(){
        return thesis;
    }
    
    public void setThesis(boolean thesis){
        this.thesis = thesis;
    }
    
    @Override
    public String toString(){
        return "name = " + name + ", id = " + id + ", credits = " + fees() + " advisor = " + advisor;
    }
    
    public double fees(){
        if(thesis)
            return (credits*255)+1000;
        else
            return credits*255;
    }
    
    public void addAdvisor(String advisor){
        this.advisor += advisor;
    }
}
