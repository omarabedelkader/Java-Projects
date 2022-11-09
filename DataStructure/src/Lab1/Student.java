
package Lab1;

public class Student {
    
    private String name;
    private Date birthDay;
    private boolean gender;
    private String diploma;
    
    public Student(String name, Date birthDay, boolean gender, String diploma){
        
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.diploma = diploma;
    }

    public String getName(){
        return name;
    }
    
    public Date getBirthDay(){
        
        return birthDay;
    }
    
    /*public boolean getGender(String g){
        
        if ( g == "F" && g == "f") 
            this.gender = false;
            
        
        else if (g == "M" && g =="m") 
            this.gender = true;
        
        else 
            return false;
        
        return this.gender;

    }
    */
    public String getGender(boolean g){
        
        if (g == true)
            return "Male";
        else
            return "Female";
    }
    
    public String getDiploma(){
        return diploma;
    }
    
    
    public void setbirthDay(Date birthDay){
        this.birthDay = birthDay;
    }
    
    
    public void setDiploma(String diploma){
        this.diploma = diploma;
    }
    
    @Override
    
    public String toString(){
        
        if (this.diploma == "PhD")
            return "Dr." + name + ", " + getGender(this.gender) + ", " + birthDay;
        else
            return name + ", " + getGender(this.gender) + ", " + birthDay;
    }
 
}
