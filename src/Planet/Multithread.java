package Planet;

public class Multithread extends Planet implements Runnable{
    Thread t;

    Multithread(double jari,double orbit,double kalarotasi,double kalarevolusi,String namaPlanet) {
        super(jari,orbit,kalarotasi,kalarevolusi,namaPlanet);
        System.out.println("Thread "+ namaPlanet + " Telah disimpan");
    }

    @Override
    public void run() {
        try {
//            !Start
//            luas = 4 * Math.PI * Math.pow(jari,2);
//            VolumeBola = (4 * Math.PI * Math.pow(jari,2))/3;
            System.out.println("Luas "+ namaPlanet + " : " + LuasPermukaanBola);
            System.out.println("Volume "+ namaPlanet + " : " + VolumeBola);
//            !End

            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Thread "+ namaPlanet +" Interrupted");
        }
    }

    public void start(){
        if (t == null){
            t = new Thread(this,namaPlanet);
            t.start();
        }
    }
}
