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
    
    public double Luas(){
        double hasil = Math.PI * jari * jari;
        return hasil;
    }
    
    public double Keliling(){
        double hasil = 2 * Math.PI * jari;
        return hasil;
    }
    
}
