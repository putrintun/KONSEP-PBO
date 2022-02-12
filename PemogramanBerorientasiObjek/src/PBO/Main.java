package PBO;
public class Main {
    String nama = "Intan";
    String gender = "Perempuan";
    public static void main(String[] args) {
        Main a = new Main();
        SubClass b = new SubClass();
        System.out.println("Nama          : "+a.nama);
        System.out.println("Jenis Kelamin : "+a.gender);
        b.Data();
    }
}