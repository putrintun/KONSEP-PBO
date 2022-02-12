package projek.settergetter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //membuat Scanner supaya user dapat menginputkan dari keyboard
        Scanner input = new Scanner(System.in);
        
        //membuat judul
        System.out.println("============================================");
        System.out.println("|          PENDATAAN HEWAN TERNAK          |");
        System.out.println("============================================");
        
        //membuat object untuk pilihan ayam beserta pemanggilan method dengan isi data ayam
        SetterGetter a = new SetterGetter();
        a.setNama("Ayam");
        a.setJenis("Kampung, Boiler, Pejantan");
        a.setJumlah(50);
        a.setJantan(26);
        a.setBetina(24);
        
        //membuat object untuk pilihan bebek beserta pemanggilan method dengan isi data bebek
        SetterGetter b = new SetterGetter();
        b.setNama("Bebek");
        b.setJenis("Peking, Manila, Serati");
        b.setJumlah(70);
        b.setJantan(32);
        b.setBetina(38);
        
        //membuat object untuk pilihan sapi beserta pemanggilan method dengan isi data sapi
        SetterGetter c = new SetterGetter();
        c.setNama("Sapi");
        c.setJenis("Brahman, Bali, limosin");
        c.setJumlah(20);
        c.setJantan(10);
        c.setBetina(10);
        
        //membuat object untuk pilihan kambing beserta pemanggilan method dengan isi data kambing
        SetterGetter d = new SetterGetter();
        d.setNama("Kambing");
        d.setJenis("Boer, Jawarandu");
        d.setJumlah(35);
        d.setJantan(13);
        d.setBetina(12);
        
        //membuat data bertipe boolean untuk melakukan perulangan
        boolean balik = true;
        //membuat perulangan
        while(balik){
            //judul
            System.out.println("----------- Pilihan Hewan Ternak -----------");
            //jenis jenis pilihan hewan
            String[] jenis = {"", "Ayam", "Bebek", "Sapi", "Kambing", "Semua Data"};
            //output pilihan hewan
            for(int pilih=1; pilih<jenis.length; pilih++){
                System.out.println(pilih+". "+jenis[pilih]);
                }   
            //perintah kepada user
            System.out.print("PILIHAN ANDA : ");
            //jawaban user
            int jawab = input.nextInt();
            //batas supaya lebih rapi
            System.out.println("============================================");
            //membuat percabangan
            switch(jawab){
                //menampilkan output data ayam jika memilih 1
                case 1 : System.out.println("Jenis Hewan      : "+a.getNama());
                         System.out.println("Tipe Hewan       : "+a.getJenis());
                         System.out.println("Jumlah Hewan     : "+a.getJumlah());
                         System.out.println("Jumlah Jantan    : "+a.getJantan());
                         System.out.println("Jumlah Betina    : "+a.getBetina());
                         System.out.println("============================================");
                         balik = false; //tidak akan kembali ke pilihan
                         break;
                //menampilkan output data bebek jika memilih 2
                case 2 : System.out.println("Jenis Hewan      : "+b.getNama());
                         System.out.println("Tipe Hewan       : "+b.getJenis());
                         System.out.println("Jumlah Hewan     : "+b.getJumlah());
                         System.out.println("Jumlah Jantan    : "+b.getJantan());
                         System.out.println("Jumlah Betina    : "+b.getBetina());
                         System.out.println("============================================");
                         balik = false; //tidak akan kembali ke pilihan
                         break;
                //menampilkan output data sapi jika memilih 3
                case 3 : System.out.println("Jenis Hewan      : "+c.getNama());
                         System.out.println("Tipe Hewan       : "+c.getJenis());
                         System.out.println("Jumlah Hewan     : "+c.getJumlah());
                         System.out.println("Jumlah Jantan    : "+c.getJantan());
                         System.out.println("Jumlah Betina    : "+c.getBetina());
                         System.out.println("============================================");
                         balik = false; //tidak akan kembali ke pilihan
                         break;
                //menampilkan output data kambing jika memilih 4
                case 4 : System.out.println("Jenis Hewan      : "+d.getNama());
                         System.out.println("Tipe Hewan       : "+d.getJenis());
                         System.out.println("Jumlah Hewan     : "+d.getJumlah());
                         System.out.println("Jumlah Jantan    : "+d.getJantan());
                         System.out.println("Jumlah Betina    : "+d.getBetina());
                         System.out.println("============================================");
                         balik = false; //tidak akan kembali ke pilihan
                         break;
                //menampilkan output semua data hewan jika memilih 5
                case 5 : System.out.println("Jenis Hewan      : "+a.getNama());
                         System.out.println("Tipe Hewan       : "+a.getJenis());
                         System.out.println("Jumlah Hewan     : "+a.getJumlah());
                         System.out.println("Jumlah Jantan    : "+a.getJantan());
                         System.out.println("Jumlah Betina    : "+a.getBetina()+"\n");
                         System.out.println("Jenis Hewan      : "+b.getNama());
                         System.out.println("Tipe Hewan       : "+b.getJenis());
                         System.out.println("Jumlah Hewan     : "+b.getJumlah());
                         System.out.println("Jumlah Jantan    : "+b.getJantan());
                         System.out.println("Jumlah Betina    : "+b.getBetina()+"\n");
                         System.out.println("Jenis Hewan      : "+c.getNama());
                         System.out.println("Tipe Hewan       : "+c.getJenis());
                         System.out.println("Jumlah Hewan     : "+c.getJumlah());
                         System.out.println("Jumlah Jantan    : "+c.getJantan());
                         System.out.println("Jumlah Betina    : "+c.getBetina()+"\n");
                         System.out.println("Jenis Hewan      : "+d.getNama());
                         System.out.println("Tipe Hewan       : "+d.getJenis());
                         System.out.println("Jumlah Hewan     : "+d.getJumlah());
                         System.out.println("Jumlah Jantan    : "+d.getJantan());
                         System.out.println("Jumlah Betina    : "+d.getBetina()+"");
                         System.out.println("============================================");
                         balik = false; //tidak akan kembali ke pilihan
                         break;
               //jika memilih selain angka 1, 2, 3, dan 4
               default : System.out.println("|  Maaf Pilihan Anda Tidak Ada, Coba Lagi  |");
                         System.out.println("============================================");
                         balik = true; //akan kembali ke pilihan
                         break;
            }
        }
    }
}