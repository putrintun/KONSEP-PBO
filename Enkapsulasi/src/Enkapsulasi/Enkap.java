package Enkapsulasi;
public class Enkap {
    public String nama = "Intan";
    protected String kelas = "X RPL 2";
    private int absen = 11;
    public void Tampil(String nama, String kelas, int absen){
        this.nama = nama;
        this.kelas = kelas;
        this.absen = absen;
    }
    protected void Output(){
        System.out.println("Nama    : "+nama);
        System.out.println("Kelas   : "+kelas);
        System.out.println("Absen   : "+absen);
    }
}