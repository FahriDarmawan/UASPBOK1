package sample;

import java.text.DecimalFormat;

public class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    public double getSisi()
    {
        return sisi;
    }
    public void setSisi(double sisi)
    {
        this.sisi = sisi;
    }
    public String hitungLuasPermukaan(){
        double luasPermukaan = Math.pow(sisi,2) * 6;
        return (new DecimalFormat(".00").format(luasPermukaan));
    }
    public String hitungVolume(){
        double volume =  sisi * sisi * sisi;
        return (new DecimalFormat(".00").format(volume));
    }
}