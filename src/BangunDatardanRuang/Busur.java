package BangunDatardanRuang;

import java.math.*;

public class Busur extends Juring{

    public Busur(double jari,double theta) {
        super(jari,theta);
        panjangbusur();
    }
  
   public void panjangbusur (){
       double busur =  super.getTheta()/360*2*Math.PI* super.getJari();
       super.setBusur(busur);
   }
}