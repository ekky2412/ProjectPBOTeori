package BangunDatardanRuang;
import java.math.*;

public class Bola extends Lingkaran{
    protected double VolumeBola;
    protected double LuasPermukaanBola;
    public Bola(double jari){
       super(jari);
       getVolume();
       getLuasPermukaan();
    }

    public void getVolume() {
        VolumeBola = (4 * super.Luas()* super.getJari()) /3;
    }

    public void getLuasPermukaan() {
        LuasPermukaanBola = 4* super.Luas();
    }
}
