package BangunDatardanRuang;
import java.math.*;

public class Bola extends Lingkaran implements BangunRuang{
    //private double jari;
    private double VolumeBola;
    private double LuasPermukaanBola;

    public Bola(float jari) {
        super(jari);
    }
    @Override
    public double getVolume() {
        VolumeBola = (2 * Luas() * super.getJari()) /3;
        return VolumeBola;
    }
    public double getLuasPermukaan () {
        LuasPermukaanBola = 2* Luas();
        return LuasPermukaanBola;
    }
        
}
