package BangunDatardanRuang;

import java.math.*;

public class Tembereng extends Juring {
    
    public Tembereng (double jari,double theta) {
        super(jari,theta);
    }
   
    public double Keliling(){
        double talibusur = 2 * super.getJari()* Math.sin(Math.toRadians(super.getTheta()/2));
        double panjangbusur = super.getBusur();
        // rumus = panjang busur + panjang tali busur
        //double keliling = (super.getTheta( )/360*2*Math.PI*super.getJari( )) + 2*super.getJari( )*Math.sin( Math.toRadians(super.getTheta( )));
        return panjangbusur;
    }
    
    public double Luas(){
        double luas = (super.getTheta()/360* Math.PI * super.getJari() * super.getJari()) - super.getTheta() ;
        return luas;
    }
    
}
