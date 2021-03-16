import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int p, l;
        double luas4persegipanjang;
        
        System.out.print("Masukan panjang : ");
        p=input.nextInt();
        
        System.out.print("Masukan lebar : ");
        l=input.nextInt(); 
        
        luas4persegipanjang=4*p*l;
        System.out.println("Luas 4 Persegi Panjang : "+luas4persegipanjang);
    }  
}