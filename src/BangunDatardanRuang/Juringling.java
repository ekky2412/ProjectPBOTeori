package BangunDatardanRuang;


public class Juringling {
  double keliling;
  double luas;
  double busur;
  double phi = 3.14;
  
  
  public double kelilingjuring (double jari_jari, double theta){
      keliling =(jari_jari + jari_jari) + theta/360 * 2 * phi * jari_jari;
      return keliling;
  } 
   public double luasjuring (double jari_jari, double theta){
       luas = theta/360* phi * jari_jari * jari_jari ;
       return luas;
   }
   public double busurjuring (double jari_jari, double theta){
       busur =  theta/360*phi* jari_jari;
       return busur;
   }
}