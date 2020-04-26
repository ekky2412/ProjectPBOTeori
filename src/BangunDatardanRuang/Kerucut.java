package BangunDatardanRuang;
import java.math.*;

public class Kerucut extends Lingkaran{
    private double tinggi;
   
    public Kerucut(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }
    public double getVolume() {
        double volumeKerucut = (super.Luas()* tinggi )/3;
        return volumeKerucut;
    }
    public double getLuasPermukaan() {
        double garisPelukis = Math.sqrt(Math.pow(super.getJari(),2)+Math.pow(tinggi,2));
        double permukaanKerucut = super.Luas()+Math.PI*super.getJari()*garisPelukis;
        return permukaanKerucut;
    }
}
