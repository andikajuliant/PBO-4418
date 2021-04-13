package Transportasi;

public class bicycle {
    int speed = 0;
    int gear = 1;

    public void changeGear(int newValue) {
         gear = newValue;
    }

    public void speedUp(int increment) {
         speed = speed + increment;   
    }

    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    public void printStates() {
         System.out.println("speed:" + 
             speed + " gear:" + gear);
    }
}