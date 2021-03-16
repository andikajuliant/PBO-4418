public class MatematikaDemo1 {

    public static void main(String args[]) {
        matematika hasil = new matematika();
        hasil.pertambahan(10, 20);
        hasil.pengurangan(10, 5);
        hasil.perkalian(10, 20);
        hasil.pembagian(20, 2);
        
    }
}

class matematika{
    void pertambahan(int a, int b){
        System.out.println(a+b);
    }
    void pengurangan(int a, int b) {
        System.out.println(a-b);
    }
    void perkalian(int a, int b){
        System.out.println(a*b);
    }
    void pembagian(int a, int b){
        double bagi = a/b;
        System.out.println(bagi);
    }
}