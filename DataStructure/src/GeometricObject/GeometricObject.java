/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeometricObject;

/**
 *
 * @author Omar
 */
public abstract class GeometricObject {
    
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;
    
    protected GeometricObject(){
        dateCreated = new java.util.Date();
    }
    
    protected GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    
    @Override
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
    
    public abstract double getArea();
            
    public abstract double getPerimeter();   
}
