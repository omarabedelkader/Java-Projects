
package Lab1;

public class Date {
    
private int day;
private int month;
private int year;


    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year; 
    }
    
    public int getYear(){
        return this.year;
    }
    
    public int getMonth(){
        return this.month;
    }

    public int getDay() {
        return this.day;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public void setMonth(int month){
        this.month=month;
    }
    
    public void setDay(int day){
        this.day=day;
    }

    @Override
    public String toString() {
        
         /*
        Calendar currentDate = Calendar.getInstance(); //Get the current date
        java.util.Date x = currentDate.getTime();
        SimpleDateFormat formatyear = new SimpleDateFormat("yyyy");
        this.year = Integer.parseInt(formatyear.format(x));
        SimpleDateFormat formatmonth = new SimpleDateFormat("MM");
        this.month = Integer.parseInt(formatmonth.format(x));     
        SimpleDateFormat formatdd = new SimpleDateFormat("dd");
        this.day = Integer.parseInt(formatdd.format(x));       
        */        
      
        StringBuilder s = new StringBuilder();
        
        int yy = this.year % 100;
        
        if (this.day < 10) 
            s.append("0");
            s.append(String.valueOf(this.day));
            s.append("-"); 
       
        if (this.month < 10) 
            s.append("0");
            s.append(String.valueOf(this.month));
            s.append("-");
            
        if (yy < 10)
            s.append("0");
            s.append(String.valueOf(yy));
               
            
        return s.toString();
    
    }
    
}

    
   

    
   
   




