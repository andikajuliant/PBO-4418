package vehicle;

public class motocycle extends motorvehicle {
    private int numGear = 0;
    
    public motocycle() {
        
    }
    public void set_gearfoot(int numGear) {
        this.numGear = numGear;
    }
    public int get_gearfoot() {
        return numGear;
    }
}