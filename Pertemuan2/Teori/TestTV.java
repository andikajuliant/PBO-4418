public class TestTV {
  public static void main(String[] args) {
    TV tvl = new TV();
    tvl.turnOn();
    tvl.setChannel(30);
    tvl.setVolume(3);

    TV tv2 = new TV();
    tv2.turnOn();
    tv2.channelUp();
    tv2.channelUp();
    tv2.volumeUp();
    
    System.out.println("tv1's channel is " + tvl.channel + " and volume level is " + tvl.volumeLevel);
    System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
  }
}

class TV {
	int channel;
	int volumeLevel;
	boolean on = false;
        
        	public TV(){}
	public void turnOn(){
		on = true;
	}
	public void setChannel(int newChannel){
		channel = newChannel;
	}
	public void setVolume(int newVolumeLevel){
		volumeLevel = newVolumeLevel; 
        }
        void channelUp(){
            channel++;
        }
        void channelDown(){
            channel--;
        }
        void volumeUp(){
            volumeLevel++;
        }
        void volumeDown(){
            volumeLevel--;
        }
    }