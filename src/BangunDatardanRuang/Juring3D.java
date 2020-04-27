package BangunDatardanRuang;

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

}