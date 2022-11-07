package Youtube;

public class Subscriber {
    private String name;
    private Channel channel;
    
    public Subscriber(String name){
        this.name = name;
    }
    
    public void update(){
        System.out.println("hey " + this.name + " " + this.channel.getName() + " uploaded a video");
    }
    
    public void subscribe(Channel channel){
        this.channel = channel;
       
    }
    
}
