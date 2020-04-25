package BangunDatardanRuang;
import java.math.*;

public class Bola extends Lingkaran{

    public Bola(double jari){
       super(jari);
    }

    public double getVolume() {
        double VolumeBola = (4 * super.luasLingkaran()* super.getJari()) /3;
        return VolumeBola;
    }

    public double getLuasPermukaan() {
        double LuasPermukaanBola = 2* super.luasLingkaran();
        return LuasPermukaanBola;
    }
}
