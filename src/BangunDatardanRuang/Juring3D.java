package BangunDatardanRuang;

public class Juring3D extends Bola{
    protected double tinggi;
    protected double luasJuring;
    protected double VolumeJuring;

    Tembereng3D tem = new Tembereng3D(super.getJari(),tinggi);
    Kerucut ker = new Kerucut(super.getJari(),tinggiKer());
    Lingkaran ling = new Lingkaran(rKecil());

    public Juring3D (double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }
    public void getLuasPermukaan () {
        luasJuring = tem.LuasTembereng + ker.getLuasPermukaan() - (ling.Luas()*2);
    }
    public void getVolume () {
        VolumeJuring = tem.VolumeTembereng + ker.getVolume();
    }
    private double tinggiKer() {
        double hasil = super.getJari() - tinggi;
        return hasil;
    }
    private double rKecil () {
        double hasil = Math.sqrt(Math.pow(super.getJari(),2) - Math.pow(tinggi,2));
        return hasil;
    }
}