import java.util.Scanner;

public class BujurSangkar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int s;
        double luas;
        
        System.out.print("Masukan Sisi : ");
        s=input.nextInt();
        
        luas=s*s;
        System.out.println("Luas Bujursangkar : "+luas);
    }  
}