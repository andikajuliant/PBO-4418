class Mobil {
    String warna;
	int gear = 0;
	int tahunProduksi;
	boolean on = false;

	void turnOn(){
		on = true;
        System.out.println("Menghidupkan mobil");
	}
    void turnOff(){
        on = false;
        System.out.println("Mematikan mobil");
    }
    void gearUp(){
        gear++;
    }
    void gearDown(){
        gear--; 
    }

}

public class MobilDemo2{
    public static void main(String[] args){
        Mobil mbl = new Mobil();
        
        mbl.warna = "Biru";
        mbl.tahunProduksi = 2007;
        System.out.println("Mobil saya berwarna : " +mbl.warna+ ", diproduksi pada tahun: "+mbl.tahunProduksi);
        mbl.turnOn();
        mbl.gearUp();
        System.out.println("Masukkan gigi : "+mbl.gear);
        mbl.gearUp();
        System.out.println("Masukkan gigi : "+mbl.gear);
        mbl.gearDown();
        System.out.println("Turunkan gigi : "+mbl.gear);

        mbl.turnOff();
}}