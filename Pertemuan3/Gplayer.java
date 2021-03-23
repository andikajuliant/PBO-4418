public class Gplayer {
    private double witdh;
    private double height;
    private int potitionX;
    private int potitionY;
    
    public Gplayer(){
        
    }
    public Gplayer(double witdh, double height, int potitionX, int potitionY){
    }
    void setDimension(double witdh, double height){
        this.witdh = witdh;
        this.height = height;
    }
    void setPotition(int potitionX, int potitionY){
        this.potitionX = potitionX;
        this.potitionY = potitionY;
    }
    double getwitdh(){
        return this.witdh;
    }
    double getheight(){
        return this.height;
    }
    int getx(){
        return this.potitionX;
    }
    int gety(){
        return this.potitionY;
    }
    void run(){
        System.out.println("Player is running");
    }
    void run(int incrementX){
        incrementX += potitionX;
        System.out.println("Player is running current X position= "+ incrementX);
    }
}