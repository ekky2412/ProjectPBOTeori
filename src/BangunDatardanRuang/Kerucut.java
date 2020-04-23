package BangunDatardanRuang;

public class Kerucut extends Lingkaran{
    private float tinggi;
   
    public Kerucut(float jari, float tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }
    public double getVolumeKerucut() {
        double volumeKerucut = (super.Luas() * tinggi )/3;
        return volumeKerucut;
    }
    public double getKelilingKerucut() {
        double garisPelukis = Math.sqrt(Math.pow(super.getJari(),2)+Math.pow(tinggi,2));
        double permukaanKerucut = super.Luas()+Math.PI*super.getJari()*garisPelukis;
        return permukaanKerucut;
    }
}