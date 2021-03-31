import java.util.ArrayList;

public class Genvironment {
    double width;
    double height;
    ArrayList<Gplayer> arrPlayer = new ArrayList<Gplayer>();
    ArrayList<Genemy> arrEnemy = new ArrayList<Genemy>();
    
    void GameEnvironment() {}
    
    public void GameEnvironment(double width, double height) {
        this.width=width;
        this.height=height;
    }
    public void addPlayer(Gplayer NewPlayer) {
        arrPlayer.add(NewPlayer);
    }
    public void removePlayer(Gplayer RemovePlayer) {
        arrPlayer.remove(RemovePlayer);
    }
    public void getAllPlayers() {
        System.out.println("All of players: "+arrPlayer);
    }
    public void addEnemy(Genemy NewEnemy) {
        arrEnemy.add(NewEnemy);
    }
    public void removeEnemy(Genemy RemoveEnemy) {
        arrEnemy.remove(RemoveEnemy);
    }
    public void getAllEnemies() {
        System.out.println(arrEnemy);
    }
    public void interaction() {
        
        if(arrPlayer.isEmpty() || arrEnemy.isEmpty()){
            System.out.println("player or enemy not sets");
        }
         for(int i=0;i<arrPlayer.size();i++){
             for(int j=0;j<arrEnemy.size();j++){
                 if(arrPlayer.get(i).gety()!=arrEnemy.get(j).gety()){
                     System.out.println("Player: "+arrPlayer.get(i)+" and Enemy: "+arrEnemy.get(j)+" is not in the same Y position");
                 }
                 if (EuclideanDistance(arrPlayer.get(i).getx(),arrPlayer.get(i).gety(),arrEnemy.get(j).getx(),arrEnemy.get(j).gety())<2){
                     System.out.println("Player: "+arrPlayer.get(i)+" attacked");
                     System.out.println("Enemy: "+arrEnemy.get(j)+" loses");
                     removeEnemy(arrEnemy.get(j));
                 }
                 else{
                     System.out.println("==> Player "+arrPlayer.get(i));
                     arrPlayer.get(i).run((int)Math.ceil(Math.random()*10));
                     System.out.println("current x position =  " + arrPlayer.get(i).getx() +" <==");
                 }
             }
         }
     }
    public int EuclideanDistance(int x1, int y1, int x2, int y2) {
        return (int) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));   
    }
}