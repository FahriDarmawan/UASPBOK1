package sample;

import java.text.DecimalFormat;

public class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public double getPanjang()
    {
        return panjang;
    }
    public double getLebar()
    {
        return lebar;
    }
    public double getTinggi()
    {
        return tinggi;
    }
    public void setPanjang(double panjang)
    {
        this.panjang = panjang;
    }
    public void setLebar(double lebar)
    {
        this.lebar = lebar;
    }
    public void setTinggi(double tinggi)
    {
        this.tinggi = tinggi;
    }
    public String hitungLuasPermukaan(){
        double luasPermukaan = 2 * panjang * lebar + 2 * panjang * tinggi + 2 * lebar * tinggi;
        return (new DecimalFormat(".00").format(luasPermukaan));
    }

    public String hitungVolume(){
        double volume = panjang * tinggi * lebar;
        return (new DecimalFormat(".00").format(volume));
    }

}