/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Planet;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataPlanet {
    File f;
    FileWriter fw;
    PrintWriter fout;
    
    public DataPlanet() {
        try {
            f = new File("C:\\Users\\RIKI MARTUA\\Desktop\\Project_PBO_Teori\\DataPlanet.txt");
            fw = new FileWriter(f);
            fout = new PrintWriter(fw);
            
        } catch (IOException ex) {
            System.out.println("Error: File gagal dibuka!");
            System.exit(-1);
        }
    }
    
    public void DataAllPlanet(){
        String datamer[]={"Data Merkurius : ","double orbit=362.8","double kalarotasi = 1403.4","double kalarevolusi = 2105.098"};
        String datavenus[]={"Data Venus : ","double orbit = 677.9","double kalarotasi = 5815.6","double kalarevolusi = 5377.071"};
        String databumi[]={"Data Bumi : ","double orbit = 937","double kalarotasi = 23.93","double kalarevolusi = 8740.672"};
        String datamars[]={"Data Mars : ","double orbit = 1424.965","double kalarotasi = 24.65","double kalarevolusi = 16439.91"};
        String datayupiter[]={"Data Yupiter : ","double orbit = 4878.603","double kalarotasi = 9.92","double kalarevolusi = 103685.34"};
        String datasaturnus[]={"Data Saturnus : ","double orbit = 8867.421","double kalarotasi = 10.67","double kalarevolusi = 257068.98"};
        String dataneptunus[]={"Data Neptunus : ","double orbit = 28156.115","double kalarotasi = 16.1","double kalarevolusi = 1440357.8"};
        String datauranus[]={"Data Uranus : ","double orbit = 18068.622","double kalarotasi = 17.25","double kalarevolusi = 737013.45"};
        
  // fout.println("double orbit = 362.8");
  // fout.println("double kalarotasi = 1403.4");
  // fout.println("double kalarevolusi = 2105.098");
     
        for (int i = 0; i < datamer.length; i++) {
            fout.println(datamer[i]);
        }
        for (int i = 0; i < datavenus.length; i++) {
            fout.println(datavenus[i]);
        }
        for (int i = 0; i < databumi.length; i++) {
            fout.println(databumi[i]);
        }
        for (int i = 0; i < datamars.length; i++) {
            fout.println(datamars[i]);
        }
        for (int i = 0; i < datayupiter.length; i++) {
            fout.println(datayupiter[i]);
        }
        for (int i = 0; i < datasaturnus.length; i++) {
            fout.println(datasaturnus[i]);
        }
        for (int i = 0; i < dataneptunus.length; i++) {
            fout.println(dataneptunus[i]);
        }
        for (int i = 0; i < datauranus.length; i++) {
            fout.println(datauranus[i]);
        }
    fout.flush();
    fout.close();
        try {
            fw.close();
        }
        catch(IOException ex) {
            System.out.println("Error: FileWriter gagal ditutup!");
        }
        System.out.println("Data Berhasil ditulis ke file \"" + f.getAbsolutePath() + "\".");
    }

//    public static void main(String[] args) {
//        new DataPlanet().DataAllPlanet();
//    }
}
