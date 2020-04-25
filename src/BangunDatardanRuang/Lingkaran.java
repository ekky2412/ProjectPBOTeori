package BangunDatardanRuang;

import java.math.*;

public class Lingkaran{
    private double jari;
    
    public Lingkaran(double jari) {
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }
    
    public double luasLingkaran(){
        double hasil = Math.PI * jari * jari;
        return hasil;
    }
    
    public double kelilingLingkaran(){
        double hasil = 2 * Math.PI * jari;
        return hasil;
    }
    
}
