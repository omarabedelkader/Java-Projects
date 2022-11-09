
package Lab1;


public class UniversityDriver {
    
    public static void main(String[]args){
        
        University uni = new University();
        
        Student s1;
        Date d1 = new Date(6,5,1994);
        s1 = new Student("Roni",d1,true,"Bs");
        uni.addStudent(s1);
        
        Student s2;
        Date d2 = new Date(1,8,1996);
        s2 = new Student("Anthony",d2,true,"BS");
        uni.addStudent(s2);
        
        Student s3;
        Date d3 = new Date(9,12,1995);
        s3 = new Student("Nour",d3,false,"PhD");
        uni.addStudent(s3);
       
        System.out.println("Differnce in years is: " + uni.getYears("Anthony","Roni"));
        System.out.println(uni.toString());
        
    }
    
}
