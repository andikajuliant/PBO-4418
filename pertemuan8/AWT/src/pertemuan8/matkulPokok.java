package pertemuan8;
public class matkulPokok extends matkul{
    public int nilaiMP;
    
    matkulPokok() {}
    
    void setnilaiMP() {
        System.out.print("masukkan Nilai Kuliah Pokok : ");
        this.nilaiMP = intr.nextInt();
    }
}