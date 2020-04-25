package BangunDatardanRuang;

import java.math.*;

public class Juring extends Lingkaran {
    private double panjangbusur;
    private double theta;

    public Juring(double jari,double theta) {
        super(jari);
        this.theta = theta;
    }
  public double Keliling (){
      double keliling =(super.getJari() + super.getJari()) + theta/360 * 2 * Math.PI * super.getJari();
      return keliling;
  } 
   public double Luas (){
       double luas = theta/360 * super.luasLingkaran();
       return luas;
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