package pertemuan8;
import java.util.Scanner;
public class univ {
    public String kode;
    public String nim;
    public String nip;
    public Scanner str = new Scanner(System.in);
    
    public univ() {};
    
    public void setkode(){
        System.out.print("masukkan kode kampus : ");
        this.kode = str.nextLine();
    }
    public void setnip() {
        System.out.print("masukkan kode nip : ");
        this.nip = str.nextLine();
    }
    
    public void setnim(){
        System.out.print("masukkan kode Nim : ");
        this.nim = str.nextLine();
    }
}