package Youtube;

public class Youtube {
    public static void main(String args[]){
        Channel test = new Channel("Test");
        
        Subscriber s1 = new Subscriber("Anthony");
        Subscriber s2 = new Subscriber("Nicolas");
        Subscriber s3 = new Subscriber("Maria");
        Subscriber s4 = new Subscriber("Sami");
        
        test.subscribe(s1);
        test.subscribe(s2);
        test.subscribe(s3);
        test.subscribe(s4);
        
        s1.subscribe(test);
        s2.subscribe(test);
        s3.subscribe(test);
        s4.subscribe(test);
        
        test.upload("video one");
    }
}
