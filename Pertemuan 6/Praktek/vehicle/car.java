package vehicle;

public class car extends vehicle {
    private boolean seatbelt = false;
    
    public car(){}

    public void set_seatbelt(int seatbelt) {
        if(seatbelt == 0){
            this.seatbelt = true;
        }
        else if(seatbelt == 1){
            this.seatbelt = false;
        }
    }
    public boolean get_seatbelt() {
        return seatbelt;
    }
}