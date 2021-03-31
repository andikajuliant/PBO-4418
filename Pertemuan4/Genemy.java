public class Genemy {
    private double witdh;
    private double height;
    int positionx;
    int positiony;
    
    public Genemy(){
        
    }
    public Genemy(double witdh, double height, int positionx, int positiony){
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
        System.out.println("Enemy is running");
    }
}