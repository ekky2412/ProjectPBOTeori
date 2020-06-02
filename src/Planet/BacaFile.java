package Planet;

import java.io.*;
public class BacaFile {
    
    FileInputStream fin;
    boolean eof;

    public BacaFile() {
        byte dataIn[]=new byte[4000];
        File f = new File("C:\\Users\\RIKI MARTUA\\Desktop\\Project_PBO_Teori\\DataPlanet.txt");
        if (f.exists()&&f.isFile()) {
            System.out.println("File ada");
            
        }
        else{
            System.out.println("File not found");
        }
        try {
            int len;
            fin = new FileInputStream(f);
            len = fin.read(dataIn, 0, dataIn.length);//proses baca
            //fin.close();
            String teks = new String(dataIn, 0, len);//hasil baca dipindah ke var biasa
            System.out.println(teks);
            //*********************************
            fin = new FileInputStream(f);
            eof = false;
            int count = 0;
            while (!eof) {
                int masuk = fin.read();
                if (masuk == -1) {
                    eof = true;
                } 
                else {
                    count++;
                }
            }
            fin.close();
            System.out.println("Kapasitas = " + count + " Byte");
        }
        catch(IOException ex) {
            System.out.println("Ada error!");
        }
        
    }
    
    
    
    
}
