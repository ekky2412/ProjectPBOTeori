package BangunDatardanRuang;

import java.math.*;

public class Tembereng extends Juring {
    private double theta;
    public Tembereng (double jari,double theta) {
        super(jari,theta);
        this.theta = theta;
    }
    
    public double TaliBusur(){
        double rad = Math.toRadians(super.getTheta()/2);
        double talibusur = 2*super.getJari() * Math.sin(rad);
        return talibusur;
    }
   
    public double Keliling(){
        // rumus = panjang busur + panjang tali busur
        double keliling = 2*super.Luas()/super.getJari() + TaliBusur();
        return TaliBusur();
    }
    
    public double Luas(){
        //luas juring - segitiga
        double tinggisegitiga = Math.sqrt(Math.pow(super.getJari(), 2) - Math.pow(TaliBusur()/2, 2));
        double luas = super.Luas() - TaliBusur()/2*tinggisegitiga;
        return luas;
    }
    
}
