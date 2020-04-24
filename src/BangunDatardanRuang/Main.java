package BangunDatardanRuang;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        char balik;
        do{
            System.out.println("== Menghitung Bangun Datar dan Ruang ==");
            System.out.println("1. Bangun Datar");
            System.out.println("2. Bangun Ruang");
            System.out.print("Pilih : ");
            menu = input.nextInt();
            switch(menu){
                case 1:{
                    System.out.println("");
                    System.out.println("=== Bangun Datar ===");
                    System.out.println("1. Lingkaran");
                    System.out.println("2. Tembereng Lingkaran");
                    System.out.println("3. Juring Lingkaran");
                    System.out.println("4. Busur Lingkaran");
                    break;
                }
                case 2:{
                    System.out.println("");
                    System.out.println("=== Bangun Ruang ===");
                    System.out.println("1. Bola");
                    System.out.println("2. Tembereng Bola");
                    System.out.println("3. Juring Bola");
                    System.out.println("4. Tabung");
                    System.out.println("5. Kerucut");
                    System.out.println("6. Kerucut Terpancung");
                    break;
                }
            }
            System.out.print("Kembali ke menu? (y/n)");
            balik = input.next().charAt(0);
        } while (balik == 'y' || balik == 'Y');
    }
    
}
