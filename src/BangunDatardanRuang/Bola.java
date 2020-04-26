package BangunDatardanRuang;
import java.math.*;

public class Bola extends Lingkaran{

    public Bola(double jari){
       super(jari);
    }

    public double getVolume() {
        double VolumeBola = (4 * super.Luas()* super.getJari()) /3;
        return VolumeBola;
    }

    public double getLuasPermukaan() {
        double LuasPermukaanBola = 4* super.Luas();
        return LuasPermukaanBola;
    }
}
