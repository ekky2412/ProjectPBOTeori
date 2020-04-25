package BangunDatardanRuang;

public class Tabung extends Lingkaran{
    private float tinggi;
      public Tabung(double jari, double tinggi){
       super(jari);
    }

    public double getVolume() {
        double VolumeTabung = ( super.luasLingkaran()*tinggi);
        return VolumeTabung;
    }

    public double getLuasPermukaan() {
        double luasSelimut= super.kelilingLingkaran()*tinggi;
        double LuasPermukaanTabung = 2* super.luasLingkaran() + luasSelimut;
        return LuasPermukaanTabung;
    }
}