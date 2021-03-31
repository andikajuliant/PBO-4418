public class Gplayer {
    private double witdh;
    private double height;
    private int positionx;
    private int positiony;
    
    public Gplayer(){
        
    }
    public Gplayer(double witdh, double height, int positionx, int positiony){
    }
    void setDimension(double witdh, double height){
        this.witdh = witdh;
        this.height = height;
    }
    void setposition(int positionx, int positiony){
        this.positionx = positionx;
        this.positiony = positiony;
    }
    double getwitdh(){
        return this.witdh;
    }
    double getheight(){
        return this.height;
    }
    int getx(){
        return this.positionx;
    }
    int gety(){
        return this.positiony;
    }
    void run(){
        System.out.println("Player is running");
    }
    void run(int incrementX){
        incrementX += positionx;
        System.out.println("Player is running current X position= "+ incrementX);
    }
}
