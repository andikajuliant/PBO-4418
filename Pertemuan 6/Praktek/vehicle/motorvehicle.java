package vehicle;

public class motorvehicle extends vehicle{
    private int sizeofEngine = 1;
    public String licencePlate = "B 070 LR";

    public motorvehicle(){}

    public motorvehicle(int sizeofEngine, String licencePlate){
        this.sizeofEngine = sizeofEngine;
        this.licencePlate = licencePlate;
    }
    public void set_sizeofEngine(int sizeofEngine){
        this.sizeofEngine = sizeofEngine;
    }
    
    public int get_sizeofEngine(){
        return sizeofEngine;
    }
    
    public String get_licencePlate(){
        return licencePlate;
    }
}
