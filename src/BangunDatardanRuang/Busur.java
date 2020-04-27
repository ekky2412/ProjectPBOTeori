package BangunDatardanRuang;

import java.math.*;

public class Busur extends Juring{
    
    Lingkaran bLingkaran = new Lingkaran(super.getJari());

    public Busur(double jari,double theta) {
        super(jari,theta);
        panjangbusur();
    }
  
   public void panjangbusur (){
       double busur =  super.getTheta()/360*bLingkaran.Keliling();
       super.setBusur(busur);
   }
}