package pertemuan8;
public class matkulTambah extends matkulPokok{
    public int nilaiMT;
    
    matkulTambah() {}
    
    void setnilaiMT(){
        System.out.print("masukkan Mata kuliah tambahan: ");
        this.nilaiMT = intr.nextInt();
    }
}