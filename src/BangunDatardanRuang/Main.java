package BangunDatardanRuang;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu, menudatar, menuruang;
        char balik;
        do {
            menu = 0;
            menudatar = 0;
            menuruang = 0;
            System.out.println("== Menghitung Bangun Datar dan Ruang ==");
            System.out.println("1. Bangun Datar");
            System.out.println("2. Bangun Ruang");
            System.out.print("Pilih : ");
            try {
                menu = input.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Input berupa angka!");
                balik = input.next().charAt(0);
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
                    try {
                        menudatar = input.nextInt();
                    } catch (InputMismatchException e) {
                        System.err.println("Input berupa angka!");
                        balik = input.next().charAt(0);
                    }
                    switch (menudatar) {
                        case 1: {
                            try {
                                System.out.println("== Lingkaran ==");
                                System.out.print("Masukkan jari-jari : ");
                                double jari = input.nextDouble();
                                Lingkaran bLingkaran = new Lingkaran(jari);
                                System.out.println("Luas Lingkaran adalah " + bLingkaran.Luas());
                                System.out.println("Keliling Lingkaran adalah " + bLingkaran.Keliling());
                            } catch (InputMismatchException e) {
                                System.err.println("Input berupa Angka!");
                                balik = input.next().charAt(0);
                            }
                            break;
                        }
                        case 2: {
                            try {
                                // gatau salah apa bener
                                System.out.println("== Tembereng Lingkaran ==");
                                System.out.print("Masukkan jari-jari : ");
                                double jari = input.nextDouble();
                                System.out.print("Masukkan Besar Sudut Juring : ");
                                double sudut = input.nextDouble();
                                Juring bTembereng = new Tembereng(jari, sudut);
                                System.out.println("Luas Tembereng Lingkaran adalah " + bTembereng.Luas());
                                System.out.println("Keliling Tembereng Lingkaran adalah " + bTembereng.Keliling());
                            } catch (InputMismatchException e) {
                                System.err.println("Input berupa Angka!");
                                balik = input.next().charAt(0);
                            }
                            break;
                        }
                        case 3: {
                            try {
                                System.out.println("== Juring Lingkaran ==");
                                System.out.print("Masukkan jari-jari : ");
                                double jari = input.nextDouble();
                                System.out.print("Masukkan Besar Sudut Juring : ");
                                double sudut = input.nextDouble();
                                Lingkaran bJuring = new Juring(jari, sudut);
                                System.out.println("Luas Juring Lingkaran adalah " + bJuring.Luas());
                                System.out.println("Keliling Juring Lingkaran adalah " + bJuring.Keliling());
                            } catch (InputMismatchException e) {
                                System.err.println("Input berupa Angka!");
                                balik = input.next().charAt(0);
                            }
                            break;
                        }
                        case 4: {
                            try {
                                System.out.println("== Busur Lingkaran ==");
                                System.out.print("Masukkan jari-jari : ");
                                double jari = input.nextDouble();
                                System.out.print("Masukkan Besar Sudut Juring : ");
                                double sudut = input.nextDouble();
                                Juring bBusur = new Busur(jari, sudut);
                                System.out.println("Panjang Busur Lingkaran adalah " + bBusur.getBusur());
                            } catch (InputMismatchException e) {
                                System.err.println("Input berupa Angka!");
                                balik = input.next().charAt(0);
                            }
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
                    try {
                        menuruang = input.nextInt();
                    } catch (InputMismatchException e) {
                        System.err.println("Input berupa angka!");
                        balik = input.next().charAt(0);
                    }
                    switch (menuruang) {
                        case 1: {
                            try {
                                System.out.println("== Bola ==");
                                System.out.print("Masukkan jari-jari : ");
                                double jari = input.nextDouble();
                                Bola bBola = new Bola(jari);
                                System.out.println("Luas Permukaan Bola adalah " + bBola.getLuasPermukaan());
                                System.out.println("Volume Bola adalah " + bBola.getVolume());
                            } catch (InputMismatchException e) {
                                System.err.println("Input berupa Angka!");
                                balik = input.next().charAt(0);
                            }
                            break;
                        }
                        case 2: {
                            try {
                                double tinggi;
                                System.out.println("== Tembereng Bola ==");
                                System.out.print("Masukkan jari-jari Bola : ");
                                double jari = input.nextDouble();
                                do {
                                    System.out.print("Masukkan tinggi tembereng : ");
                                    tinggi = input.nextDouble();
                                    if (tinggi >= jari) {
                                        System.err.println("Tinggi tembereng tidak melebihi jari-jari!");
                                    }
                                } while (tinggi >= jari);
                                Bola bTembereng = new Tembereng3D(jari, tinggi);
                                System.out.println("Luas Permukaan Tembereng Bola adalah " + bTembereng.getLuasPermukaan());
                                System.out.println("Volume Tembereng Bola adalah " + bTembereng.getVolume());
                            } catch (InputMismatchException e) {
                                System.err.println("Input berupa Angka!");
                                balik = input.next().charAt(0);
                            }
                            break;
                        }
                        case 3: {
                            try {
                                double tinggi;
                                System.out.println("== Juring Bola ==");
                                System.out.print("Masukkan jari-jari : ");
                                double jari = input.nextDouble();
                                do {
                                    System.out.print("Masukkan tinggi tembereng : ");
                                    tinggi = input.nextDouble();
                                    if (tinggi >= jari) {
                                        System.err.println("Tinggi tembereng tidak melebihi jari-jari!");
                                    }
                                } while (tinggi >= jari);
                                Bola bJuring3D = new Juring3D(jari, tinggi);
                                System.out.println("Luas Permukaan Juring Bola adalah " + bJuring3D.getLuasPermukaan());
                                System.out.println("Volume Juring Bola adalah " + bJuring3D.getVolume());
                            } catch (InputMismatchException e) {
                                System.err.println("Input berupa Angka!");
                                balik = input.next().charAt(0);
                            }
                            break;
                        }
                        case 4: {
                            try {
                                System.out.println("== Tabung ==");
                                System.out.print("Masukkan jari-jari alas : ");
                                double jari = input.nextDouble();
                                System.out.print("Masukkan tinggi tabung : ");
                                double tinggi = input.nextDouble();
                                Tabung bTabung = new Tabung(jari, tinggi);
                                System.out.println("Luas Permukaan Tabung adalah " + bTabung.getLuasPermukaan());
                                System.out.println("Volume Tabung adalah " + bTabung.getVolume());
                            } catch (InputMismatchException e) {
                                System.err.println("Input berupa Angka!");
                                balik = input.next().charAt(0);
                            }
                            break;
                        }
                        case 5: {
                            try {
                                System.out.println("== Kerucut ==");
                                System.out.print("Masukkan jari-jari : ");
                                double jari = input.nextDouble();
                                System.out.print("Masukkan tinggi kerucut : ");
                                double tinggi = input.nextDouble();
                                Kerucut bKerucut = new Kerucut(jari, tinggi);
                                System.out.println("Luas Permukaan Kerucut adalah " + bKerucut.getLuasPermukaan());
                                System.out.println("Volume Kerucut adalah " + bKerucut.getVolume());
                            } catch (InputMismatchException e) {
                                System.err.println("Input berupa Angka!");
                                balik = input.next().charAt(0);
                            }
                            break;
                        }
                        case 6: {
                            try {
                                double jarikecil;
                                System.out.println("== Kerucut Terpancung ==");
                                System.out.print("Masukkan jari-jari lingkaran besar : ");
                                double jari = input.nextDouble();
                                do {
                                    System.out.print("Masukkan jari-jari lingkaran kecil : ");
                                    jarikecil = input.nextDouble();
                                    if (jarikecil >= jari) {
                                        System.err.println("Jari-jari lingkaran kecil harus lebih kecil dari lingkaran besar!");
                                    }
                                } while (jarikecil >= jari);
                                System.out.print("Masukkan tinggi kerucut terpancung : ");
                                double tinggi = input.nextDouble();
                                Kerucut bKerucutTerpancung = new KerucutTerpancung(jari, jarikecil, tinggi);
                                System.out.println("Luas Permukaan Kerucut Terpancung adalah " + bKerucutTerpancung.getLuasPermukaan());
                                System.out.println("Volume Kerucut Terpancung adalah " + bKerucutTerpancung.getVolume());
                            } catch (InputMismatchException e) {
                                System.err.println("Input berupa Angka!");
                                balik = input.next().charAt(0);
                            }
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
