package BangunDatardanRuang;

import java.math.*;

public class Juring extends Lingkaran {
    private double panjangbusur;
    private double theta;

    public Juring(double jari,double theta) {
        super(jari);
        this.theta = theta;
    }
  public void kelilingjuring (){
      double keliling =(super.getJari() + super.getJari()) + theta/360 * 2 * Math.PI * super.getJari();
      super.setKeliling(keliling);
  } 
   public void luasjuring (){
       double luas = theta/360* Math.PI * super.getJari() * super.getJari() ;
       super.setLuas(luas);
   }
    public double getBusur() {
        return panjangbusur;
    }
    public void setBusur(double busur) {
        this.panjangbusur = busur;
    }

    public double getTheta() {
        return theta;
    }

}