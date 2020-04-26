package BangunDatardanRuang;

public class Tabung extends Lingkaran{
    private double tinggi;
    
      public Tabung(double jari, double tinggi){
       super(jari);
       this.tinggi = tinggi;
    }

    public double getVolume() {
        double VolumeTabung = (super.Luas()*tinggi);
        return VolumeTabung;
    }

    public double getLuasPermukaan() {
        double luasSelimut= super.Keliling()*tinggi;
        double LuasPermukaanTabung = 2* super.Luas() + luasSelimut;
        return LuasPermukaanTabung;
    }
}