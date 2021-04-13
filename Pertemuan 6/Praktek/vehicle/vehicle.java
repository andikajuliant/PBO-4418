package vehicle;

public class vehicle{
    public double speed = 0;
    public String color = "Soklat";

    public vehicle(){}

    public void goStraight(){
        System.out.println("Maju");
    }

    public void turnLeft(){
        System.out.println("Belok kiri");
    }

    public void turnRight(){
        System.out.println("Belok kanan");
    }

    public String set_color(String new_color){
        this.color = new_color;
        return color;
    }
    
    public int set_speed(int speed){
        this.speed = speed;
        return speed;
    }
}
