public class BukuDemo1 {

    public static void main(String args[]) {
        System.out.println("Buku 1");
        buku buku1 = new buku("Pemrograman Berbasis Objek dengan Java", "Indrajani", "Elexmedia Komputindo", 2007);
        buku1.cetakbuku();
        System.out.println("Buku 2");
        buku buku2 = new buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004);
        buku2.cetakbuku();
    }
}

class buku{
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahun;
    
    public buku(String judul, String pengarang, String penerbit,int tahun){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    public void cetakbuku(){
        System.out.println("Judul      :  " + this.judul);
        System.out.println("Pengarang  :  " + this.pengarang);
        System.out.println("Penerbit   :  " + this.penerbit);
        System.out.println("Tahun      :  " + this.tahun);
    }
}