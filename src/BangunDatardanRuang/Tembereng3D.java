package BangunDatardanRuang;

public class Tembereng3D extends Bola{

<<<<<<< HEAD
    private double tinggi;

=======
    protected double tinggi;
    protected double LuasTembereng;
    protected double VolumeTembereng;
    
>>>>>>> dee460df7fe36dbfae95d75f4ac620a16c0c122f
    public Tembereng3D(double jari, double tinggi){
        super(jari);
        this.tinggi = tinggi;
    }

<<<<<<< HEAD
    @Override
    public double getLuasPermukaan() {
        double LuasTembereng = 2 * Math.PI * getJari() * tinggi;
        return LuasTembereng;
    }

    @Override
    public double getVolume() {
        double VolumeTembereng = 1/3 * Math.PI * Math.pow(tinggi, 2) * (3 * super.getJari() - tinggi);
        return VolumeTembereng;
=======
    public void getLuasPermukaan() {
        LuasTembereng = super.LuasPermukaanBola * tinggi;
    }

    public void getVolume() {
        VolumeTembereng = (Math.PI * Math.pow(tinggi, 2) * (3 * super.getJari() - tinggi))/3;
>>>>>>> dee460df7fe36dbfae95d75f4ac620a16c0c122f
    }
}
