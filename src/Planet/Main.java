package Planet;

import java.io.*;
import java.time.chrono.MinguoEra;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        RandomAccessFile isiFile = null;
        String dirFile = "D:\\File Java\\FilePlanet.txt";
        try{
        isiFile = new RandomAccessFile(dirFile, "r");
        isiFile.seek(0);
        }catch(IOException ioe){
            System.err.println(ioe.getMessage());
            System.err.println("Terjadi IOException");
        }
        double[][] data = new double[10][5];
        Scanner input = new Scanner(System.in);
        int menu; char balik;
        do{
        System.out.println("Menghitung rotasi Revolusi Planet");
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
        System.out.println("10. Threading");
        System.out.println("Pilih : ");
        menu = input.nextInt();
        switch(menu){
            case 1:{
                System.out.println("Input Jari-jari : ");
                data[0][0] = input.nextDouble();
                System.out.println("Input Panjang Orbit : ");
                data[0][1] = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                data[0][2] = input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                data[0][3] = input.nextDouble();
//                System.out.println(pMerkurius.kecepatanrevolusi+"  "+ pMerkurius.kecepatanrotasi);
                break;
            }
            case 2:{
                System.out.println("Input Jari-jari : ");
                data[1][0] = input.nextDouble();
                System.out.println("Input Panjang Orbit : ");
                data[1][1] = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                data[1][2] = input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                data[1][3] = input.nextDouble();
//                System.out.println(pVenus.kecepatanrevolusi+"  "+ pVenus.kecepatanrotasi);
                break;
            }
            case 3:{
                System.out.println("Input Jari-jari : ");
                data[2][0] = input.nextDouble();
                System.out.println("Input Panjang Orbit : ");
                data[2][1] = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                data[2][2] = input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                data[2][3] = input.nextDouble();
//                System.out.println(pBumi.kecepatanrevolusi+"  "+ pBumi.kecepatanrotasi);
                break;
            }
            case 4:{
                System.out.println("Input Jari-jari : ");
                data[3][0] = input.nextDouble();
                System.out.println("Input Panjang Orbit : ");
                data[3][1] = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                data[3][2] = input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                data[3][3] = input.nextDouble();
//                System.out.println(pMars.kecepatanrevolusi+"  "+ pMars.kecepatanrotasi);
                break;
            }
            case 5:{
                System.out.println("Input Jari-jari : ");
                data[4][0] = input.nextDouble();
                System.out.println("Input Panjang Orbit : ");
                data[4][1] = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                data[4][2] = input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                data[4][3] = input.nextDouble();
//                System.out.println(pJupiter.kecepatanrevolusi+"  "+ pJupiter.kecepatanrotasi);
                break;
            }
            case 6:{
                System.out.println("Input Jari-jari : ");
                data[5][0] = input.nextDouble();
                System.out.println("Input Panjang Orbit : ");
                data[5][1] = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                data[5][2] = input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                data[5][3] = input.nextDouble();
//                System.out.println(pSaturnus.kecepatanrevolusi+"  "+ pSaturnus.kecepatanrotasi);
                break;
            }
            case 7:{
                System.out.println("Input Jari-jari : ");
                data[6][0] = input.nextDouble();
                System.out.println("Input Panjang Orbit : ");
                data[6][1] = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                data[6][2] = input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                data[6][3] = input.nextDouble();
//                System.out.println(pUranus.kecepatanrevolusi+"  "+ pUranus.kecepatanrotasi);
                break;
            }
            case 8:{
                System.out.println("Input Jari-jari : ");
                data[7][0] = input.nextDouble();
                System.out.println("Input Panjang Orbit : ");
                data[7][1] = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                data[7][2] = input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                data[7][3] = input.nextDouble();
//                System.out.println(pNeptunus.kecepatanrevolusi+"  "+ pNeptunus.kecepatanrotasi);
                break;
            }
            case 9:{
                System.out.println("Input Jari-jari : ");
                data[8][0] = input.nextDouble();
//                System.out.println("Input Panjang Orbit : ");
                data[8][1] = 0.0;
                System.out.println("Input Kala Rotasi : ");
                data[8][2] = input.nextDouble();
                data[8][3] = 0.0;
//                System.out.println(pMatahari.kecepatanrevolusi+"  "+ pMatahari.kecepatanrotasi);
                break;
            }
            case 10:{
                boolean selesai = true;
                for (int i = 0; i < 9; i++) {
                    if (data[i] == null) {
                        System.out.println("Data Menu ke-"+ i +" Masih Kosong");
                        selesai = false;
                    }
                }
                if (selesai){
                    Multithread pMerkurius = new Multithread(data[0][0],data[0][1],data[0][2],data[0][3],"Merkurius");
                    Multithread pVenus = new Multithread(data[1][0],data[1][1],data[1][2],data[1][3],"Venus");
                    Multithread pBumi = new Multithread(data[2][0],data[2][1],data[2][2],data[2][3],"Bumi");
                    Multithread pMars = new Multithread(data[3][0],data[3][1],data[3][2],data[3][3],"Mars");
                    Multithread pJupiter = new Multithread(data[4][0],data[4][1],data[4][2],data[4][3],"Jupiter");
                    Multithread pSaturnus = new Multithread(data[5][0],data[5][1],data[5][2],data[5][3],"Saturnus");
                    Multithread pUranus = new Multithread(data[6][0],data[6][1],data[6][2],data[6][3],"Uranus");
                    Multithread pNeptunus = new Multithread(data[7][0],data[7][1],data[7][2],data[7][3],"Neptunus");
                    Multithread pMatahari = new Multithread(data[8][0],data[8][1],data[8][2],data[8][3],"Matahari");
                    
//                    Thread pMerkurius = new Thread((Runnable)new Merkurius(data[0][0],data[0][1],data[0][2],data[0][3],"Merkurius"));
//                    Thread pVenus = new Thread((Runnable)new Venus(data[1][0],data[1][1],data[1][2],data[1][3],"Venus"));
//                    Thread pBumi = new Thread((Runnable) new Bumi(data[2][0],data[2][1],data[2][2],data[2][3],"Bumi"));
//                    Thread pMars = new Thread((Runnable)new Mars(data[3][0],data[3][1],data[3][2],data[3][3],"Mars"));
//                    Thread pJupiter = new Thread((Runnable)new Jupiter(data[4][0],data[4][1],data[4][2],data[4][3],"Jupiter"));
//                    Thread pSaturnus = new Thread((Runnable)new Saturnus(data[5][0],data[5][1],data[5][2],data[5][3],"Saturnus"));
//                    Thread pUranus = new Thread((Runnable)new Uranus(data[6][0],data[6][1],data[6][2],data[6][3],"Uranus"));
//                    Thread pNeptunus = new Thread((Runnable)new Neptunus(data[7][0],data[7][1],data[7][2],data[7][3],"Neptunus"));
//                    Thread pMatahari = new Thread((Runnable)new Matahari(data[8][0],data[8][1],data[8][2],data[8][3],"Matahari"));
                    pMerkurius.start();
                    pVenus.start();
                    pBumi.start();
                    pMars.start();
                    pJupiter.start();
                    pSaturnus.start();
                    pUranus.start();
                    pNeptunus.start();
                    pMatahari.start();
                }
                break;
            }
        }
            System.out.println("Kembali? : ");
            balik = input.next().charAt(0);
       }while(balik=='y'||balik=='Y');
    }

}
