import Transportasi.bicycle;
import Transportasi.mobil;

public class TransportasiDemo {
    public static void main(String[] args){
        bicycle Spda = new bicycle();
        Spda.speedUp(20);
        Spda.changeGear(5);
        Spda.printStates(); 
        
        mobil Mbl = new mobil("Magenta", 2007);
        Mbl.getwarna();
        Mbl.gettahun();
        
        System.out.println("Warna mobil : "+Mbl.getwarna());
        System.out.println("Thun mobil : "+Mbl.gettahun());
       
    }
}