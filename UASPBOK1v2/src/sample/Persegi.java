package sample;

import java.text.DecimalFormat;

public class Persegi extends BangunDatar{
    private double panjang;
    private double lebar;

    public Persegi(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    public double getPanjang(){
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }

    public String hitungLuas(){
        double luas = lebar * panjang;
        return (new DecimalFormat(".00").format(luas));
    }

    public String hitungKeliling(){
        double keliling = (2 * panjang) + (2 * lebar);
        return (new DecimalFormat(".00").format(keliling));
    }
}