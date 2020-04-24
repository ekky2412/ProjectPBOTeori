package BangunDatardanRuang;
import java.math.*;

public class Kerucut extends Lingkaran implements BangunRuang{
    private float tinggi;
   
    public Kerucut(float jari, float tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }
    public double getVolume() {
        double volumeKerucut = (super.Luas() * tinggi )/3;
        return volumeKerucut;
    }
    public double getLuasPermukaan() {
        double garisPelukis = Math.sqrt(Math.pow(super.getJari(),2)+Math.pow(tinggi,2));
        double permukaanKerucut = super.Luas()+Math.PI*super.getJari()*garisPelukis;
        return permukaanKerucut;
    }
}
