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
                break;
            }
            case 2:{
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
                break;
            }
            case 5:{
                break;
            }
            case 6:{
                break;
            }
            case 7:{
                break;
            }
            case 8:{
                break;
            }
            case 9:{
                break;
            }
        }
    }

}
