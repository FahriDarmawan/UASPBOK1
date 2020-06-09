package sample;

import java.text.DecimalFormat;

public class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
    private double sisiC;
    
    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public Segitiga(double sisiA, double sisiB, double sisiC){
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    public void setAlas(double alas){
        this.alas = alas;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public void setsisiA(double sisiA){
        this.sisiA = sisiA;
    }

    public void setsisiB(double sisiB){
        this.sisiB = sisiB;
    }

    public void setsisiC(double sisiC){
        this.sisiC = sisiC;
    }

    public double getAlas(){
        return alas;
    }

    public double getTinggi(){
        return tinggi;
    }

    public double sisiA(){
        return sisiA;
    }

    public double sisiB(){
        return sisiB;
    }

    public double sisiC(){
        return sisiC;
    }

    public String hitungLuas(){
        double luas = 0.5 * alas * tinggi;
        return (new DecimalFormat(".00").format(luas));
    }

    public String hitungKeliling(){
        double keliling = sisiA + sisiB + sisiC;
        return (new DecimalFormat(".00").format(keliling));
    }
}
