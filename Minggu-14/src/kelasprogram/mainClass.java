package kelasprogram;

import java.util.Scanner;
import kelasdata.marqueePlayer;
import kelasdata.kelasA;
import kelasdata.kelasB;
import kelasdata.kelasC;
import kelasdata.kelasData;


public class mainClass {

    public static void main(String[] args) {
        int banyakPemainMarquee, banyakPemainA, banyakPemainB, banyakPemainC, banyakPemain, totalGajiMarquee, totalGajiA, totalGajiB, totalGajiC, totalGaji, totalSisa;
		
	kelasData kD = new kelasData();
        System.out.println("\n== GAJI PEMAIN SEPAK BOLA INDONESIA ==");
        System.out.println("*Gaji Pemain Dalam Nominal Juta");
        System.out.println("Marquee Player = Rp."+kD.getMarqueePlayer());
        System.out.println("Pemain Kelas A = Rp."+kD.getKelasA());
        System.out.println("Pemain Kelas B = Rp."+kD.getKelasB());
        System.out.println("Pemain Kelas C = Rp."+kD.getKelasC());
		
        marqueePlayer Marquee = new marqueePlayer();
	System.out.println("------------- KETERANGAN -------------");
	System.out.println("Marquee Player");
	System.out.println("--------------");
	Marquee.rataRataGaji();
	Marquee.karir();
	Marquee.contohPemain();
        
        kelasA A = new kelasA();
        System.out.println("--------------");
	System.out.println("Pemain Kelas A");
	System.out.println("--------------");
	A.rataRataGaji();
	A.karir();
	A.contohPemain();
		
	kelasB B = new kelasB();
	System.out.println("--------------");
	System.out.println("Pemain Kelas B");
	System.out.println("--------------");
	B.rataRataGaji();
	B.karir();
	B.contohPemain();
		
	kelasC C = new kelasC();
	System.out.println("--------------");
	System.out.println("Pemain Kelas C");
	System.out.println("--------------");
	C.rataRataGaji();
	C.karir();
	C.contohPemain();
		
	System.out.println("\n=== PERHITUNGAN TOTAL GAJI  PEMAIN ===");
	Scanner input = new Scanner(System.in);
	prosesHitung hitung = new prosesHitung();        
        System.out.print("Nama Club             : ");
        String nama = input.nextLine();
        kD.setNamaClub(nama);
        System.out.print("Jumlah Marquee Player : ");
        banyakPemainMarquee = input.nextInt();
        System.out.print("Jumlah Pemain Kelas A : ");
        banyakPemainA = input.nextInt();
        System.out.print("Jumlah Pemain Kelas B : ");
        banyakPemainB = input.nextInt();
        System.out.print("Jumlah Pemain Kelas C : ");
        banyakPemainC = input.nextInt();
	System.out.println("-------------------------------------- +");
	banyakPemain = hitung.hitungTotalPemain(banyakPemainA, banyakPemainB, banyakPemainC, banyakPemainMarquee);
	System.out.print("Jumlah Total Pemain   : "+banyakPemain);
        System.out.println("\n--------------------------------------");
        
        totalGajiMarquee = hitung.hitungPemain(banyakPemainMarquee, kD.getMarqueePlayer());
        totalGajiA = hitung.hitungPemain(banyakPemainA, kD.getKelasA());
        totalGajiB = hitung.hitungPemain(banyakPemainB, kD.getKelasB());
        totalGajiC = hitung.hitungPemain(banyakPemainC, kD.getKelasC());
        totalGaji = hitung.hitungGaji(totalGajiA, totalGajiB, totalGajiC, totalGajiMarquee);
	totalSisa = hitung.hitungSisa(kD.getBelanjaMax(), totalGaji);
        
        System.out.println("Nama Club                 : "+kD.getNamaClub());
        System.out.println("Total Gaji Marquee Player : Rp."+totalGajiMarquee);
        System.out.println("Total Gaji Pemain Kelas A : Rp."+totalGajiA);
        System.out.println("Total Gaji Pemain Kelas B : Rp."+totalGajiB);
        System.out.println("Total Gaji Pemain Kelas C : Rp."+totalGajiC);
	System.out.println("-------------------------------------- +");
        System.out.println("Total Gaji Pemain         : Rp."+totalGaji);
	System.out.println("Sisa Belanja Pemain 	  : Rp."+totalSisa);
        System.out.println("--------------------------------------");
    }
    
}