package sample;

import java.text.DecimalFormat;

public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(double jari){
        this.jari = jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public String hitungLuas(){
       double luas = Math.PI * jari * jari;
       return (new DecimalFormat(".00").format(luas));
    }

    public String hitungKeliling(){
        double keliling = Math.PI * 2 * jari;
        return (new DecimalFormat(".00").format(keliling));
    }
}