public class main {
    public static void main(String[] args) throws Exception {
        Gplayer player=new Gplayer();
        player.setDimension(12,12);
        player.setposition(10,220);
        System.out.println("Posisi Player: "+player.getx()+","+player.gety());
        player.run(12);
        System.out.println("Posisi Player: "+player.getx()+","+player.gety());
        
        Gplayer kawan=new Gplayer();
        kawan.setDimension(12,32);
        kawan.setposition(10,10);
        
        Genemy musuh=new Genemy();
        musuh.setDimension(12,32);
        musuh.setposition(10,10);
        
        Genvironment scene = new Genvironment();
        scene.addPlayer(player);
        scene.addPlayer(player);
        scene.addPlayer(kawan);
        scene.getAllPlayers();
        scene.removePlayer(player);
        scene.getAllPlayers();
        scene.addEnemy(musuh);
        scene.interaction();
    }
}