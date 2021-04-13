package vehicle;

public class bicycle extends vehicle{
    public bicycle(){}

    public void ringBell(){
        System.out.println("Kringg..");
    }

    public void color(){
        System.out.println("Warna sepeda saya adalah : "+super.color);
    }
}
