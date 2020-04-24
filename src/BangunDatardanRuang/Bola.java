package BangunDatardanRuang;
import java.math.*;

public class Bola extends Lingkaran implements BangunRuang{

    private double volume,luaspermukaan;
    
    public Bola(double jari){
       super(jari);
    }
    
     public void volumeBola (){
     double hasil  = ((4 * Math.PI * (super.getJari() * super.getJari() * super.getJari()))/3);
     this.volume = hasil;
     }

    @Override
    public double getVolume() {
        VolumeBola = (2 * Luas() * super.getJari()) /3;
        return VolumeBola;
    }

    @Override
    public double getLuasPermukaan() {
        LuasPermukaanBola = 2* Luas();
        return LuasPermukaanBola;
    }
}
