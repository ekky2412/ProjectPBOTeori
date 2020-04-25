package BangunDatardanRuang;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu, menudatar, menuruang;
        char balik;
            do {
                System.out.println("== Menghitung Bangun Datar dan Ruang ==");
                System.out.println("1. Bangun Datar");
                System.out.println("2. Bangun Ruang");
                System.out.print("Pilih : ");
                menu = input.nextInt();
                switch (menu) {
                    case 1: {
                        System.out.println("");
                        System.out.println("=== Bangun Datar ===");
                        System.out.println("1. Lingkaran");
                        System.out.println("2. Tembereng Lingkaran");
                        System.out.println("3. Juring Lingkaran");
                        System.out.println("4. Busur Lingkaran");
                        System.out.print("Pilih : ");
                        menudatar = input.nextInt();
                        switch (menudatar) {
                            case 1: {
                                System.out.println("== Lingkaran ==");
                                System.out.print("Masukkan jari-jari : ");
                                double jari = input.nextDouble();
                                Lingkaran bLingkaran = new Lingkaran(jari);
                                System.out.println("Luas Lingkaran adalah " + bLingkaran.luasLingkaran());
                                System.out.println("Keliling Lingkaran adalah " + bLingkaran.kelilingLingkaran());
                                break;
                            }
                            case 2: {
                                System.out.println("== Tembereng Lingkaran ==");
                                break;
                            }
                            case 3: {
                                System.out.println("== Juring Lingkaran ==");
                                break;
                            }
                            case 4: {
                                System.out.println("== Busur Lingkaran ==");
                                break;
                            }
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("");
                        System.out.println("=== Bangun Ruang ===");
                        System.out.println("1. Bola");
                        System.out.println("2. Tembereng Bola");
                        System.out.println("3. Juring Bola");
                        System.out.println("4. Tabung");
                        System.out.println("5. Kerucut");
                        System.out.println("6. Kerucut Terpancung");
                        System.out.print("Pilih : ");
                        menuruang = input.nextInt();
                        switch (menuruang) {
                            case 1: {
                                System.out.println("== Bola ==");
                                break;
                            }
                            case 2: {
                                System.out.println("== Tembereng Bola ==");
                                break;
                            }
                            case 3: {
                                System.out.println("== Juring Bola ==");
                                break;
                            }
                            case 4: {
                                System.out.println("== Tabung ==");
                                break;
                            }
                            case 5: {
                                System.out.println("== Kerucut ==");
                                break;
                            }
                            case 6: {
                                System.out.println("== Kerucut Terpancung ==");
                                break;
                            }
                        }
                        break;
                    }
                }
                System.out.print("Kembali ke menu? (y/n)");
                balik = input.next().charAt(0);
            } while (balik == 'y' || balik == 'Y');
    }

}
