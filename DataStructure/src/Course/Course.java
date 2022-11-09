/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class Course {
    
    private String code;
    private String title;
    private int credits;
            
    public Course(){
        code = " ";
        title = " ";
        credits = 0;
    }
    
    public Course(String code, String title, int credits){
        this.code = code;
        this.title = title;
        this.credits = credits;
    }
    
    public void setCode(String code){
        this.code = code;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setCredits(int credits){
        this.credits = credits;
    }
    
    public String getCode(){
        return this.code;
    }
    
    public String getTitle(){
        return this.title;
    }
            
    public int getCredits(){
        return this.credits;
    }
    
    public void print(){
        System.out.println("your code is: " + this.code + ", your title is: " + this.title + ", your crdits are: " + this.credits + ".");
    }
    
    @Override
    public String toString(){
        return "\"your code is: \" + this.code + \", your title is: \" + this.title + \", your crdits are: \" + this.credits + \".\"";
    }
    
}

    class TestCourse{
        
        public static void main(String [] args){
            
            Scanner input = new Scanner (System.in);
            
            Course arr [] = new Course[4];
            
            Course c = new Course();
            
            for(int i = 0; i <arr.length; i++){
                System.out.println("please entre your code: ");
                
                c.setCode(input.nextLine());
                              
                System.out.println("please entre your title ");
                
                c.setTitle(input.nextLine());
                
                System.out.println("please entre your Crdits: ");
                
                c.setCredits(input.nextInt());
                
                arr [i] = new Course(); 
                
                c.print();
                
                
            }
           
           
        }
    }
