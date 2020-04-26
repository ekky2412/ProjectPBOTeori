package BangunDatardanRuang;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = 0, menudatar = 0, menuruang = 0;
        char balik;
        do {
            System.out.println("== Menghitung Bangun Datar dan Ruang ==");
            System.out.println("1. Bangun Datar");
            System.out.println("2. Bangun Ruang");
            System.out.print("Pilih : ");
            try {
                menu = input.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Input berupa angka!");
            } finally {
                balik = 'y';
            }
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
                            System.out.println("Luas Lingkaran adalah " + bLingkaran.Luas());
                            System.out.println("Keliling Lingkaran adalah " + bLingkaran.Keliling());
                            break;
                        }
                        case 2: {
                            //gatau salah apa bener
                            System.out.println("== Tembereng Lingkaran ==");
                            System.out.print("Masukkan jari-jari : ");
                            double jari = input.nextDouble();
                            System.out.print("Masukkan Besar Sudut Juring : ");
                            double sudut = input.nextDouble();
                            Juring bTembereng = new Tembereng(jari, sudut);
                            System.out.println("Luas Tembereng Lingkaran adalah " + bTembereng.Luas());
                            System.out.println("Keliling Tembereng Lingkaran adalah " + bTembereng.Keliling());
                            break;
                        }
                        case 3: {
                            System.out.println("== Juring Lingkaran ==");
                            System.out.print("Masukkan jari-jari : ");
                            double jari = input.nextDouble();
                            System.out.print("Masukkan Besar Sudut Juring : ");
                            double sudut = input.nextDouble();
                            Lingkaran bJuring = new Juring(jari, sudut);
                            System.out.println("Luas Juring Lingkaran adalah " + bJuring.Luas());
                            System.out.println("Keliling Juring Lingkaran adalah " + bJuring.Keliling());
                            break;
                        }
                        case 4: {
                            System.out.println("== Busur Lingkaran ==");
                            System.out.print("Masukkan jari-jari : ");
                            double jari = input.nextDouble();
                            System.out.print("Masukkan Besar Sudut Juring : ");
                            double sudut = input.nextDouble();
                            Juring bBusur = new Busur(jari, sudut);
                            System.out.println("Panjang Busur Lingkaran adalah " + bBusur.getBusur());
                            break;
                        }
                        default: {
                            System.out.println("Menu yang dipilih tidak ada");
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
                            System.out.print("Masukkan jari-jari : ");
                            double jari = input.nextDouble();
                            Bola bBola = new Bola(jari);
                            System.out.println("Luas Permukaan Bola adalah " + bBola.getLuasPermukaan());
                            System.out.println("Volume Bola adalah " + bBola.getVolume());
                            break;
                        }
                        case 2: {
                            System.out.println("== Tembereng Bola ==");
                            System.out.print("Masukkan jari-jari : ");
                            double jari = input.nextDouble();
                            System.out.print("Masukkan tinggi tembereng : ");
                            double tinggi = input.nextDouble();
                            Bola bTembereng = new Tembereng3D(jari, tinggi);
                            System.out.println("Luas Permukaan Tembereng Bola adalah " + bTembereng.getLuasPermukaan());
                            System.out.println("Volume Tembereng Bola adalah " + bTembereng.getVolume());
                            break;
                        }
                        case 3: {
                            System.out.println("== Juring Bola ==");
                            break;
                        }
                        case 4: {
                            System.out.println("== Tabung ==");
                            System.out.print("Masukkan jari-jari alas : ");
                            double jari = input.nextDouble();
                            System.out.print("Masukkan tinggi tabung : ");
                            double tinggi = input.nextDouble();
                            Tabung bTabung = new Tabung(jari, tinggi);
                            System.out.println("Luas Permukaan Tabung adalah " + bTabung.getLuasPermukaan());
                            System.out.println("Volume Tabung adalah " + bTabung.getVolume());
                            break;
                        }
                        case 5: {
                            System.out.println("== Kerucut ==");
                            System.out.print("Masukkan jari-jari : ");
                            double jari = input.nextDouble();
                            System.out.print("Masukkan tinggi kerucut : ");
                            double tinggi = input.nextDouble();
                            Kerucut bKerucut = new Kerucut(jari, tinggi);
                            System.out.println("Luas Permukaan Kerucut adalah " + bKerucut.getLuasPermukaan());
                            System.out.println("Volume Kerucut adalah " + bKerucut.getVolume());
                            break;
                        }
                        case 6: {
                            System.out.println("== Kerucut Terpancung ==");
                            break;
                        }
                        default: {
                            System.out.println("Menu yang dipilih tidak ada");
                            break;
                        }
                    }
                    break;
                }
                default: {
                    System.out.println("Menu yang dipilih tidak ada");
                }
            }
            System.out.print("Kembali ke menu? (y/n)");
            balik = input.next().charAt(0);
        } while (balik == 'y' || balik == 'Y');
    }

}
