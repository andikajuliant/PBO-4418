import vehicle.*;

public class ujivehicle{

    public static void main(String[] args){
        vehicle transport = new vehicle();
        bicycle sepeda = new bicycle();
        motorvehicle ngeng = new motorvehicle();
        motocycle ngueng = new motocycle();
        car mbem = new car();

        transport.goStraight();
        transport.turnLeft();
        transport.turnRight();
        sepeda.ringBell();
        sepeda.color();
        ngeng.set_sizeofEngine(250);
        ngeng.get_licencePlate();
        ngueng.set_gearfoot(5);
        mbem.set_seatbelt(1);

        System.out.println("Plat Nomor Revoku : "+ngeng.get_licencePlate());
        System.out.println("Engine size : "+ngeng.get_sizeofEngine()+"CC");
        System.out.println("Gigi motorku sekarang: " + ngueng.get_gearfoot());
        System.out.println("Apakah pakai seatbelt: " + mbem.get_seatbelt());
    }
}