/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TVmodels;

/**
 *
 * @author Omar
 */
public class TV {
    
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    
    public TV(){
        
    }
    
    public void turnOn(){
        on = true;
    }
    
    public void turnOff(){
        on = false;
    }
    
    public void setChannel(int newChannel){
        if (on && newChannel <= 120 && newChannel >= 1)
        channel = newChannel;
    }
    
    public void setVolume(int newVolumeLevel){
        if (on && newVolumeLevel <= 7 && newVolumeLevel >= 1)
        volumeLevel = newVolumeLevel;
    }
    
    public void channelUp(){
        if(on && channel < 120)
        channel ++;
    }
    
    public void channelDown(){
        if(on && channel > 1)
        channel --;
    }
    
    public void volumeUp(){
        if(on && volumeLevel < 7)
        volumeLevel ++;
    }
    
    public void volumeDown(){
        if(on && volumeLevel > 1)
        volumeLevel --;
    }
}
   class TestTV{
    public static  void main(String args[]){
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
}
