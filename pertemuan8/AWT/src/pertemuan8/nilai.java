package pertemuan8;
public class nilai extends matkulTambah{
    public float nilaiAverage;
    
    nilai() {}
    
    void getNilaiAverage(){
        this.nilaiAverage = (this.nilaiMP * 60/100) + (this.nilaiMT * 40 / 100) ;
    }
    
    void showdata(){
        System.out.println("Kode Univ : "+this.kode);
        System.out.println("NIM : "+this.nim);
        System.out.println("NIP : "+this.nip);
        System.out.println("Mata Kuliah : "+this.nmMatkul);
        System.out.println("Semester : "+this.Semester);
        System.out.println("Jadwal : "+this.jadwal);
        System.out.println("Nilai Mata Kuliah Pokok : "+this.nilaiMP);
        System.out.println("Nilai Mata Kuliah Tambahan : "+this.nilaiMT);
        System.out.println("Nilai Rata-Rata : "+this.nilaiAverage);
    }
}