package Planet;

public class Multithread implements Runnable{
    Thread t;
    String namaPlanet;

    Multithread(String nama) {
        namaPlanet = nama;
    }

    @Override
    public void run() {
        try {
//            !Start

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
