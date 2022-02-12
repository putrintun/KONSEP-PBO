package KontruktorParameter;
public class KonPar {
    String nama = "Intan";
    String kelas = "X RPL 2";
    String jurusan = "RPL";
    KonPar(String nama){
        this.nama = nama;
    }
    void Data(String kelas, String jurusan){
        this.kelas = kelas;
        this.jurusan = jurusan;
    }
    void Tampil(){
        System.out.println("Nama    : "+nama);
        System.out.println("Kelas   : "+kelas);
        System.out.println("Jurusan : "+jurusan);
    }
}