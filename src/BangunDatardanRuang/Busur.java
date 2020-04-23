package BangunDatardanRuang;


public class Busur {
  double keliling;
  double luas;
  double busur;
  double phi = 3.14;
  
   public double busurjuring (double jari_jari, double theta){
       busur =  theta/360*2*phi* jari_jari;
       return busur;
   }
}