/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class University {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Student> Students = new ArrayList<>();
        
        Students.add(new Exchange("Hadi","1005",3));
        Students.add(new Graduate("Samar","1020",9,true,"Dr.Walid"));
        Students.add(new Undergraduate("Julia","1025",15,false,3.5));
        Students.add(new Exchange("Ibrahim","1115",6));
        Students.add(new Undergraduate("Nawal","2040",18,true,2.8));
        Students.add(new Graduate("Fadi","2055",6, false, "Dr.Amar"));
        
        for(int i=0; i<Students.size(); i++){
            System.out.println(Students.get(i).toString());
        }
        
        int exchange = 0;
        int graduate = 0;
        int undergraduate = 0;

        for(int i=0; i<Students.size(); i++){
            if(Students.get(i) instanceof Exchange)
                exchange ++;
            else if(Students.get(i) instanceof Graduate)
                graduate ++;
            else
                undergraduate ++;
        }
        
        System.out.println("Exchange Students: " + exchange + "\nGraduate Students: " + graduate + "\nUndergraduate Students: " + undergraduate);
    
        for(int i=0; i<Students.size(); i++){
            System.out.println(Students.get(i).getName());
        }
        
        ((Undergraduate)Students.get(4)).setGpa(3.2);
        
        for(int i=0; i<Students.size(); i++){
            if(Students.get(i) instanceof Undergraduate)
                System.out.println(((Undergraduate)Students.get(i)).getGpa());
        }
        
        for(int i=0; i<Students.size(); i++){
            if(Students.get(i) instanceof Graduate)
                System.out.println(((Graduate)Students.get(i)).getAdvisor());
        }
        
    }

}

