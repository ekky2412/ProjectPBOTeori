package Planet;
import BangunDatardanRuang.Bola;
public class Planet extends Bola{
    protected double orbit;
    protected double kalarotasi;
    protected double kalarevolusi;
    protected double kecepatanrotasi;
    protected double kecepatanrevolusi;
    
    public Planet(double jari,double orbit,double kalarotasi,double kalarevolusi) {
        super(jari);
        this.orbit = orbit;
        this.kalarotasi = kalarotasi;
        this.kalarevolusi = kalarevolusi;
        getKecepatanRevolusi();
        getKecepatanRotasi();
    }
    
    public void getKecepatanRotasi(){
        kecepatanrotasi = super.Keliling() / kalarotasi;
    }
    
    public void getKecepatanRevolusi(){
        kecepatanrevolusi = orbit * Math.pow(10,6) / kalarevolusi;
    }
    
}
