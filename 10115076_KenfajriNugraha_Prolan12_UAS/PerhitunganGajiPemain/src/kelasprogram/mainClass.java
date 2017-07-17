package kelasprogram;

import java.util.Scanner;
import kelasdata.kelasA;
import kelasdata.kelasB;
import kelasdata.kelasC;
import kelasdata.marqueePlayer;
import kelasdata.kelasData;


public class mainClass {

    public static void main(String[] args) {
        int banyakPemain, banyakPemainA, banyakPemainB, banyakPemainC, banyakPemainMarquee, totalGajiA, totalGajiB, totalGajiC, totalGajiMarquee, totalGaji, totalSisa;
	String ulg = "y";
        
        while (ulg.equals("y")) {
            System.out.println(" ");
            Scanner input = new Scanner(System.in);
            String ul="",lagi;
            System.out.println("+---------SELAMAT DATANG---------+");
            System.out.println("                                  ");                              
            System.out.println("            Menu Utama            ");
            System.out.println("           +----------+           ");
            System.out.println(" 1. Keterangan Gaji Pemain        ");     
            System.out.println(" 2. Keterangan Kelas Pemain       ");    
            System.out.println(" 3. Perhitungan Total Gaji Pemain ");
            System.out.println(" 4. Keluar                        ");
            System.out.println("                                  ");
            System.out.println(" Pilihan [1/2/3/4] =              ");
            int pilih = input.nextInt();
            System.out.println("+--------------------------------+");
        
            switch (pilih) {
                case 1: {
                    kelasData kD = new kelasData();
                    System.out.println("\n+----------GAJI PEMAIN-----------+");
                    System.out.println("                                  ");
                    System.out.println("*Gaji Pemain Dalam Nominal Juta   ");
                    System.out.println("Marquee Player = Rp."+kD.getMarqueePlayer());
                    System.out.println("Pemain Kelas A = Rp."+kD.getKelasA());
                    System.out.println("Pemain Kelas B = Rp."+kD.getKelasB());
                    System.out.println("Pemain Kelas C = Rp."+kD.getKelasC());
                    break;
                }
                case 2:{                                                        
                    marqueePlayer Marquee = new marqueePlayer();                
                    System.out.println("\n+-----------KETERANGAN-----------+"); 
                    System.out.println("                                  ");   
                    System.out.println("          Marquee Player          ");   
                    System.out.println("         +--------------+         ");   
                    Marquee.rataRataGaji();                                     
                    Marquee.karir();                                            
                    Marquee.contohPemain();                                     
                                                                                
                    kelasA A = new kelasA();                                    
                    System.out.println("\n          Pemain Kelas A          ");   
                    System.out.println("         +--------------+         ");   
                    A.rataRataGaji();
                    A.karir();
                    A.contohPemain();
		
                    kelasB B = new kelasB();
                    System.out.println("\n          Pemain Kelas B          ");   
                    System.out.println("         +--------------+         ");   
                    B.rataRataGaji();
                    B.karir();
                    B.contohPemain();
		
                    kelasC C = new kelasC();
                    System.out.println("\n          Pemain Kelas C          ");   
                    System.out.println("         +--------------+         ");   
                    C.rataRataGaji();
                    C.karir();
                    C.contohPemain();
                    break;
                }
                case 3:{
                    kelasData kD = new kelasData();
                    System.out.println("\n+-----PERHITUNGAN TOTAL GAJI-----+");
                    prosesHitung hitung = new prosesHitung();
                    System.out.print("\nJumlah Marquee Player : ");
                    banyakPemainMarquee = input.nextInt();
                    System.out.print("Jumlah Pemain Kelas A : ");
                    banyakPemainA = input.nextInt();
                    System.out.print("Jumlah Pemain Kelas B : ");
                    banyakPemainB = input.nextInt();
                    System.out.print("Jumlah Pemain Kelas C : ");
                    banyakPemainC = input.nextInt();
                    System.out.println("------------------------------------ +");
                    banyakPemain = hitung.hitungTotalPemain(banyakPemainMarquee, banyakPemainA, banyakPemainB, banyakPemainC);
                    System.out.print("Jumlah Total Pemain   : "+banyakPemain);
                    System.out.println("\n------------------------------------");
        
                    totalGajiMarquee = hitung.hitungPemain(banyakPemainMarquee, kD.getMarqueePlayer());
                    totalGajiA = hitung.hitungPemain(banyakPemainA, kD.getKelasA());
                    totalGajiB = hitung.hitungPemain(banyakPemainB, kD.getKelasB());
                    totalGajiC = hitung.hitungPemain(banyakPemainC, kD.getKelasC());
                    totalGaji = hitung.hitungGaji(totalGajiA, totalGajiB, totalGajiC, totalGajiMarquee);
                    totalSisa = hitung.hitungSisa(kD.getBelanjaMax(), totalGaji);
        
                    System.out.println("Total Gaji Marquee Player : Rp."+totalGajiMarquee);
                    System.out.println("Total Gaji Pemain Kelas A : Rp."+totalGajiA);
                    System.out.println("Total Gaji Pemain Kelas B : Rp."+totalGajiB);
                    System.out.println("Total Gaji Pemain Kelas C : Rp."+totalGajiC);
                    System.out.println("------------------------------------ +");
                    System.out.println("Total Gaji Pemain         : Rp."+totalGaji);
                    System.out.println("Sisa Belanja Pemain 	  : Rp."+totalSisa);
                    break;
                }
                case 4:{
                    System.exit(4);
                    System.out.println("Warning !! Pilihan tidak tersedia !! ");
                }
                break;
            }
            System.out.println("+--------------------------------+");
            System.out.print("\nApakah anda ingin mengulang (y/t)? ");
            ulg = input.next();
        }
    }
}