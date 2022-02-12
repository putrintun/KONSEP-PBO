package Inheritance;
public class Induk {
    public String warna;
    public int berat;
    public int umur;
    public void Data(String warna, int berat, int umur){
        this.warna = warna;
        System.out.println("Warna : "+warna);
        this.berat = berat;
        System.out.println("Berat : "+berat);
        this.umur = umur;
        System.out.println("Umur  : "+umur);
    }
    public static void main(String[] args) {
        Anak a = new Anak();
        Induk b = new Induk();
        
        b.Data("Putih", 23, 5);
        a.Data("Hitam", 20, 3);
        a.Tambahan("Berkelompok", "Herbivora");
    }
}