package Overriding;
public class Main {
    public static void main(String[] args) {
        Persegi a = new Persegi();
        PersegiPanjang b = new PersegiPanjang();
        Main c = new Main();
        
        c.luas();
        c.keliling();
        a.sisi = 10;
        a.luas();
        a.keliling();
        b.panjang = 10;
        b.lebar = 8;
        b.luas();
        b.keliling();
    }
    float luas(){
        System.out.println("Menghitung laus bangun datar");
        return 0;
    }
    float keliling(){
        System.out.println("Menghitung keliling bangun datar");
        return 0;
    }
}