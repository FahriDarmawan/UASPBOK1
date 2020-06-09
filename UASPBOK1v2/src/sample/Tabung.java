package sample;

import java.text.DecimalFormat;

public class Tabung extends BangunRuang {
    private double jari;
    private double tinggi;

    public Tabung(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }
    public double getJari()
    {
        return jari;
    }
    public double getTinggi()
    {
        return tinggi;
    }
    public void setJari(double jari)
    {
        this.jari = jari;
    }
    public void setTinggi(double tinggi)
    {
        this.tinggi = tinggi;
    }
    public String hitungLuasPermukaan(){
        double luasPermukaan = 2 * Math.PI * jari * (jari + tinggi);
        return (new DecimalFormat(".00").format(luasPermukaan));
    }
    public String hitungVolume(){
        double volume =  Math.PI * Math.pow(jari, 2) * tinggi;
        return (new DecimalFormat(".00").format(volume));
    }
}