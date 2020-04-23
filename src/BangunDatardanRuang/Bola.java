package BangunDatardanRuang;

import java.math.*;

public class Bola extends BangunRuang{
    private double jari2;
    double phi = 3.14;
    
    public Bola(float jari2){
    this.volumeBola();
    this.jari2 = jari2;
    }
   
    public double getJari2() {
        return jari2;
    }
    
     public void volumeBola (){
     double hasil  = ((4 * phi * (jari2 * jari2 * jari2))/3);
     super.setVolume(hasil);
     }
}
