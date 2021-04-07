class vehicle{
    public double speed = 0;
    public String color = "Orange";

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

class bicycle extends vehicle{
    public bicycle(){}

    public void ringBell(){
        System.out.println("Kringg..");
    }

    public void color(){
        System.out.println("Warna sepeda-nya adalah : "+super.color);
    }
}

class motorvehicle extends vehicle{
    public int sizeofEngine = 1;
    public String licencePlate = "B 070 LR";

    public motorvehicle(){}

    public motorvehicle(int sizeofEngine, String licencePlate){
        this.sizeofEngine = sizeofEngine;
        this.licencePlate = licencePlate;
    }

    public int get_sizeofEngine(){
        return sizeofEngine;
    }
    
    public String get_licencePlate(){
        return licencePlate;
    }
    
    public void get_speed(int new_speed){
        System.out.println("Top speed motor ini adalah : "+super.set_speed(new_speed));
    }
}

public class ujivehicle{
    public static void main(String[] args){
        bicycle testbicycle = new bicycle();
        testbicycle.color();
        motorvehicle ngeng = new motorvehicle();
        ngeng.get_speed(170);
    }
}