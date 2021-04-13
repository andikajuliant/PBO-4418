package Transportasi;

public class mobil {
    String warna;
    int tahun = 2001;
    
    public mobil() {

    }
    
    public mobil(String color, int thn) {
        this.warna = color;
        this.tahun = thn;
    }
    
    public String getwarna() {
        return warna;
    }
    public int gettahun() {
        return tahun;
    }
}