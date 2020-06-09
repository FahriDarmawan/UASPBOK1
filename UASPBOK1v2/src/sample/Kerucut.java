package sample;

import java.text.DecimalFormat;

public class Kerucut extends BangunRuang {
    private double jari;
    private double sisi;
    private double tinggi;

    public Kerucut(double jari, double sisi) {
        this.jari = jari;
        this.sisi = sisi;
    }
    public Kerucut(double jari, double sisi, double tinggi) {
        this.jari = jari;
        this.sisi = sisi;
        this.tinggi = tinggi;
    }
    public double getJari()
    {
        return jari;
    }
    public double getSisi()
    {
        return sisi;
    }
    public double getTinggi()
    {
        return tinggi;
    }
    public void getJari(double jari)
    {
        this.jari = jari;
    }
    public void getSisi(double sisi)
    {
        this.sisi = sisi;
    }
    public void getTinggi(double tinggi)
    {
        this.tinggi = tinggi;
    }
    public String hitungLuasPermukaan(){
        double luasPermukaan = (Math.PI*jari) * (jari + sisi);
        return (new DecimalFormat(".00").format(luasPermukaan));
    }
    public String hitungVolume(){
        double volume = Math.PI * jari * jari * jari * tinggi / 3;
        return (new DecimalFormat(".00").format(volume));
    }
}