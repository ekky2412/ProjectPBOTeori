package BangunDatardanRuang;

public class Tembereng3D extends Bola{

    protected double tinggi;
    protected double LuasTembereng;
    protected double VolumeTembereng;
    
    public Tembereng3D(double jari, double tinggi){
        super(jari);
        this.tinggi = tinggi;
    }

    public void getLuasPermukaan() {
        LuasTembereng = super.LuasPermukaanBola * tinggi;
    }

    public void getVolume() {
        VolumeTembereng = (Math.PI * Math.pow(tinggi, 2) * (3 * super.getJari() - tinggi))/3;
    }
}
