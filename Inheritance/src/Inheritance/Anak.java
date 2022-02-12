package Inheritance;
public class Anak extends Induk{
    String hidup;
    String makan;
    public void Tambahan(String hidup, String makan){
        this.hidup = hidup;
        this.makan = makan;
        System.out.println("Makannya Adalah  : "+makan);
        System.out.println("Hidupnya secara  : "+hidup);
    }
}