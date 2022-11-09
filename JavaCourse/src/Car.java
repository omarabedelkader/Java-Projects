
package javacourse;
        
public class Car {
    
    public int speed;
    
    public Car ()
    {
            
    }
    public void setSpeed (int s)
    {
        this.speed = s;
                
               switch (this.speed)
               {
                   case 40:
                       System.out.println("40Km");
                       break;
                   case 100:
                       System.out.println("100Km");
                       break;
                   case 120:
                       System.out.println("Slow Down");
                   default:
                       System.out.println("None");
               }
               
               int y = (this.speed == 100 ? 10 : 20);
               
    }
    
    public void getSpeed (int y)
    {
        this.speed = y;
        y = (this.speed == 100 ? 10 : 20);
        int i = y;
        System.out.println(i);
        
    }
    
}
