package BangunDatardanRuang;

import java.math.*;

public class Tembereng extends Juring {
    
    public Tembereng (double jari,double theta) {
        super(jari,theta);
    }
    
   
    public void kelilingtembereng(){
        double keliling = (super.getTheta( )/360*2*Math.PI*super.getJari( )) + 2*super.getJari( )*Math.sin( Math.toRadians(super.getTheta( )));
        super.setKeliling(keliling);
    }
    
    public void luastembereng(){
        double luas = (super.getTheta()/360* Math.PI * super.getJari() * super.getJari()) - super.getTheta() ;
        super.setLuas(luas);
    }
    
}
