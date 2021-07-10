package pertemuan8;
public class dosen extends univ{
    public String nmDosen;
    
    public dosen() {}
    
    void setnmDosen(){
        System.out.print("masukkan nama Dosen : ");
        this.nmDosen = str.nextLine();
    }
}