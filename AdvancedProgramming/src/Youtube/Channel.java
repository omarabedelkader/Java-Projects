package Youtube;

import java.util.ArrayList;

public class Channel {
    private String name, title;
    private ArrayList<Subscriber> subscribers;
    
    public Channel(String name){
        this.name = name;
        subscribers = new ArrayList<>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void subscribe(Subscriber sub){
        subscribers.add(sub);
    }
    
    public void unSubscribe(Subscriber sub){
        subscribers.remove(sub);
    }
    
    public void notifySubscribers(){
        for(Subscriber sub : subscribers){
            sub.update();
        }
    }
    
    public void upload(String title){
        this.title = title;
        this.notifySubscribers();
    }
}
