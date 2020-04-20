package BangunDatardanRuang;

import java.math.*;

public class Lingkaran extends BangunDatar{
    private double jari;
    
    public Lingkaran(float jari) {
        this.jari = jari;
        this.kelilingLingkaran();
        this.luasLingkaran();
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
