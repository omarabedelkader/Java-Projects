
package Lab1;



public class University {
    
    private final String NAME = "UL";
    private Student [] st = new Student [3];
    private int numberOfStudents;
  
    public University () {
    }
    
    public int getRegisteredStudents(){
        return numberOfStudents;
     }
     
    public boolean addStudent(Student s){
           
        if (numberOfStudents < st.length){
            st [numberOfStudents] = s;
            numberOfStudents ++;
            return true;
        }
        
        return false;
    }
    
    public int getYears(String name1, String name2) {
         
        int n1 = 0;
        int n2 = 0;
        int i=0;
        int difference = 0;
        
        for( i = 0; i < st.length-1; i++){
            if( name1 == st[i].getName()){
                n1 = i;
            }  
        }    
            
        for( i = 0; i < st.length; i++){
            if( name2 == st[i].getName()){
                n2 = i;
            }
        }
        
        difference = st[n1].getBirthDay().getYear() - st[n2].getBirthDay().getYear();
            
         return difference;
    
    }
    
    public Student[] getSt(){
            return this.st;
     }

   @Override
   
   public String toString(){
       String b = "";
       String a = "Welcome to " + NAME + " University" + "\n"
                  + "Registered Student: " + getRegisteredStudents() + "\n"
                  + "Students: " + "\n"
                  + "\n";
       
                  for (int i = 0; i < st.length; i ++){
                  b += st[i].toString() + "\n";
                  }
               
                  return a + b;
   }
    
}
    
   
    
    


