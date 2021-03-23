public class Genemy {
    double witdh;
    double height;
    int potitionX;
    int potitionY;
    
    public Genemy(){
        
    }
    public Genemy(double witdh, double height, int potitionX, int potitionY){
    }
    void setDimension(double witdh, double height){
        this.witdh = witdh;
        this.height = height;
    }
    void setPotition(int potitionx, int potitiony){
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
        System.out.println("enemy is running");
    }
}