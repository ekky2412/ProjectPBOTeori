package BangunDatardanRuang;

import java.math.*;

public class Lingkaran extends BangunDatar{
    private double jari;
    
    public Lingkaran(double jari) {
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }
    
    public void luasLingkaran(){
        double hasil = 2 * Math.PI * Math.pow(jari, 2);
        super.setLuas(hasil);
    }
    
    public void kelilingLingkaran(){
        double hasil = 2 * Math.PI * jari;
        super.setKeliling(hasil);
    }
    
}
