package BangunDatardanRuang;

import java.math.*;

public class Bola extends Lingkaran implements BangunRuang{
    
    private double volume,luaspermukaan;
    
    public Bola(double jari2){
       super(jari2);
    }
    
     public void volumeBola (){
     double hasil  = ((4 * Math.PI * (super.getJari() * super.getJari() * super.getJari()))/3);
     this.volume = hasil;
     }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getLuasPermukaan() {
        return 0;
    }
}
