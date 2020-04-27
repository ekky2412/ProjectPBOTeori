package BangunDatardanRuang;

<<<<<<< HEAD
public class Juring3D extends Bola{
    private double tinggi;

    Tembereng3D tem = new Tembereng3D(super.getJari(),tinggi);
    Kerucut ker = new Kerucut(super.getJari(),tinggiKer());
    Lingkaran ling = new Lingkaran(rKecil());

    public Juring3D (double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }
    public double getLuasPermukaan () {
		double luasJuring = tem.getLuasPermukaan() + ker.getLuasPermukaan() - (ling.Luas()*2);
        return luasJuring;
    }
    public double getVolume () {
        double VolumeJuring = tem.getVolume() + ker.getVolume();
        return VolumeJuring;
    }
    private double tinggiKer() {
        double hasil = super.getJari() - tinggi;
        return hasil;
    }
    private double rKecil () {
        double hasil = Math.sqrt(Math.pow(super.getJari(),2) - Math.pow(tinggi,2));
        return hasil;
    }
=======
public class Juring3D extends Bola {

  private double jarit;

  public Juring3D(double jari, double jarit) {
    super(jari);
    this.jarit = jarit;
  }

  @Override
  public double getLuasPermukaan() {
    double LuasJaring = (2 * Math.PI * jarit) + (Math.PI * super.getJari());
    return LuasJaring;
  }

  @Override
  public double getVolume() {
    double VolumeJaring = (2 * Math.PI * Math.pow(super.getJari(), 2) * jarit) / 3;
    return VolumeJaring;
  }

>>>>>>> 3f8748d3e7474d9f91fbe2f8d539befadc2fb897
}