package BangunDatardanRuang;

import java.math.*;

public class Lingkaran{
    protected double jari;
    protected double luas;
    protected double keliling;
    
    public Lingkaran(double jari) {
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }
    
    public double Luas(){
        luas = Math.PI * jari * jari;
        return luas;
    }
    
    public double Keliling(){
        keliling = 2 * Math.PI * jari;
        return keliling;
    }
    
}
