package Planet;

import java.io.*;
import java.util.Date;

public class InfoFile {
    public InfoFile(){
        
    }
    public static void main(String[] args) throws IOException {
        String namaFile = new String();
        try {
            //namaFile = "D:\\MyData\\laguku.txt";
            namaFile = "DataPlanet.txt";
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Anda harus menyebutkan nama file atau directory!");
        }
        File f = new File(namaFile);
        f.createNewFile();
        if (f.isDirectory()) {
            System.out.println(namaFile + " adalah Directory");
            String s[] = f.list();
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
            }
        }
        else {
            System.out.println(namaFile + " adalah File");
            Date tanggal = new Date(f.lastModified());
            System.out.println("Tanggal modifikasi: " + tanggal);
        }
    }
}
