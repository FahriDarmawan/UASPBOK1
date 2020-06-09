package sample;

import java.text.DecimalFormat;

public class Bola extends BangunRuang {
    private double jari;

    public Bola(double jari) {
        this.jari = jari;
    }
    public double getJari()
    {
        return jari;
    }
    public void setJari(double jari)
    {
        this.jari = jari;
    }
    public String hitungLuasPermukaan(){
        double luasPermukaan = (Math.PI*jari*jari)*4;
        return (new DecimalFormat(".00").format(luasPermukaan));
    }
    public String hitungVolume(){
        double volume =  (Math.PI*jari*jari*jari)*4/3;
        return (new DecimalFormat(".00").format(volume));
    }
}