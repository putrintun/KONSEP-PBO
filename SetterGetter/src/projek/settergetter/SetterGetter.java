package projek.settergetter;
public class SetterGetter {
    //membuat variabel instance
    protected String nama;
    protected String jenis;
    private int jumlah;
    private int jantan;
    private int betina;
    
    //membuat method setNama untuk menyetel nama menggunakan parameter
    public void setNama(String nama){
        this.nama = nama;
    }
    //membuat method nonvoid getNama ntuk menyimpan variabel nama
    public String getNama(){
        return nama;
    }
    
    //membuat method setJenis untuk menyetel jenis menggunakan parameter
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    //membuat method nonvoid getJenis ntuk menyimpan variabel jenis
    public String getJenis(){
        return jenis;
    }
    
    //membuat method setJumlah untuk menyetel jumlah menggunakan parameter
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    //membuat method nonvoid getJumlah ntuk menyimpan variabel jumlah
    public int getJumlah(){
        return jumlah;
    }
    
    //membuat method setJantan untuk menyetel jumlah jantan menggunakan parameter
    public void setJantan(int jantan){
        this.jantan = jantan;
    }
    //membuat method nonvoid getJantan ntuk menyimpan variabel jantan
    public int getJantan(){
        return jantan;
    }
    
    //membuat method setBetina untuk menyetel jumlah betina menggunakan parameter
    public void setBetina(int betina){
        this.betina = betina;
    }
    //membuat method nonvoid getBetina ntuk menyimpan variabel betina
    public int getBetina(){
        return betina;
    }
}