package Planet;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        System.out.println("Menghitung Rotasi Revolusi Planet");
        System.out.println("Pilih Planet : ");
        System.out.println("1. Merkurius");
        System.out.println("2. Venus");
        System.out.println("3. Bumi");
        System.out.println("4. Mars");
        System.out.println("5. Jupiter");
        System.out.println("6. Saturnus");
        System.out.println("7. Uranus");
        System.out.println("8. Neptunus");
        System.out.println("9. Matahari");
        System.out.println("Pilih : ");
        menu = input.nextInt();
        switch(menu){
            case 1:{
                int jari; double orbit; double rotasi; double revolusi;
                System.out.println("Input Jari-jari : ");
                jari = input.nextInt();
                System.out.println("Input Panjang Orbit : ");
                orbit = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                rotasi = input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                revolusi = input.nextDouble();
                Planet pMerkurius = new Merkurius(jari, orbit, rotasi, revolusi);
                System.out.println(pMerkurius.kecepatanrevolusi+"  "+ pMerkurius.kecepatanrotasi);
                break;
            }
            case 2:{
                int jari; double orbit; double rotasi; double revolusi;
                System.out.println("Input Jari-jari : ");
                jari = input.nextInt();
                System.out.println("Input Panjang Orbit : ");
                orbit = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                rotasi = input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                revolusi = input.nextDouble();
                Planet pVenus = new Venus(jari, orbit, rotasi, revolusi);
                System.out.println(pVenus.kecepatanrevolusi+"  "+ pVenus.kecepatanrotasi);
                break;
            }
            case 3:{
                int jari; double orbit; double rotasi; double revolusi;
                System.out.println("Input Jari-jari : ");
                jari = input.nextInt();
                System.out.println("Input Panjang Orbit : ");
                orbit = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                rotasi = input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                revolusi = input.nextDouble();
                Planet pBumi = new Bumi(jari, orbit, rotasi, revolusi);
                System.out.println(pBumi.kecepatanrevolusi+"  "+ pBumi.kecepatanrotasi);
                break;
            }
            case 4:{
                int jari; double orbit; double rotasi; double revolusi;
                System.out.println("Input Jari-jari : ");
                jari = input.nextInt();
                System.out.println("Input Panjang Orbit : ");
                orbit = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                rotasi = input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                revolusi = input.nextDouble();
                Planet pMars = new Mars(jari, orbit, rotasi, revolusi);
                System.out.println(pMars.kecepatanrevolusi+"  "+ pMars.kecepatanrotasi);
                break;
            }
            case 5:{
                int jari; double orbit; double rotasi; double revolusi;
                System.out.println("Input Jari-jari : ");
                jari = input.nextInt();
                System.out.println("Input Panjang Orbit : ");
                orbit = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                rotasi = input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                revolusi = input.nextDouble();
                Planet pJupiter = new Jupiter(jari, orbit, rotasi, revolusi);
                System.out.println(pJupiter.kecepatanrevolusi+"  "+ pJupiter.kecepatanrotasi);
                break;
            }
            case 6:{
                int jari; double orbit; double rotasi; double revolusi;
                System.out.println("Input Jari-jari : ");
                jari = input.nextInt();
                System.out.println("Input Panjang Orbit : ");
                orbit = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                rotasi = input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                revolusi = input.nextDouble();
                Planet pSaturnus = new Saturnus(jari, orbit, rotasi, revolusi);
                System.out.println(pSaturnus.kecepatanrevolusi+"  "+ pSaturnus.kecepatanrotasi);
                break;
            }
            case 7:{
                int jari; double orbit; double rotasi; double revolusi;
                System.out.println("Input Jari-jari : ");
                jari = input.nextInt();
                System.out.println("Input Panjang Orbit : ");
                orbit = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                rotasi = input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                revolusi = input.nextDouble();
                Planet pUranus = new Uranus(jari, orbit, rotasi, revolusi);
                System.out.println(pUranus.kecepatanrevolusi+"  "+ pUranus.kecepatanrotasi);
                break;
            }
            case 8:{
                int jari; double orbit; double rotasi; double revolusi;
                System.out.println("Input Jari-jari : ");
                jari = input.nextInt();
                System.out.println("Input Panjang Orbit : ");
                orbit = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                rotasi = input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                revolusi = input.nextDouble();
                Planet pNeptunus = new Neptunus(jari, orbit, rotasi, revolusi);
                System.out.println(pNeptunus.kecepatanrevolusi+"  "+ pNeptunus.kecepatanrotasi);
                break;
            }
            case 9:{
                int jari; double orbit; double rotasi;
                System.out.println("Input Jari-jari : ");
                jari = input.nextInt();
                System.out.println("Input Panjang Orbit : ");
                orbit = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                rotasi = input.nextDouble();
                Planet pMatahari = new Matahari(jari, rotasi);
                System.out.println(pMatahari.kecepatanrevolusi+"  "+ pMatahari.kecepatanrotasi);
                break;
            }
        }
    }

}
