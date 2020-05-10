
package BangunDatardanRuang;
import java.math.*;

public class KerucutTerpancung extends Kerucut{
     private double jarikecil;
   
    public KerucutTerpancung(double jari,double jarikecil,double tinggi) {
        super(jari,tinggi);
        this.jarikecil= jarikecil;
    }
    public double getVolume() {
        double volumeKerucutT =Math.PI*super.getTinggi() * (Math.pow(super.getJari(),2)+super.getJari()*jarikecil+Math.pow(jarikecil,2))/3;
        return volumeKerucutT;
    }
    public double getLuasPermukaan() {
        double garisPelukis = Math.sqrt(Math.pow((super.getJari()-jarikecil),2)+Math.pow(super.getTinggi(),2));
       //double luasR2= Math.PI*(Math.pow(jari2, 2));
        double permukaanKerucutT = garisPelukis*Math.PI*(super.getJari()+jarikecil);
        return permukaanKerucutT;
    }
    
}
