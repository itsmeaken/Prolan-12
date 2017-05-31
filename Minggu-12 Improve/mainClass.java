import java.util.Scanner;

public class mainClass {

    public static void main(String[] args) {
        int banyakPemain, banyakPemainA, banyakPemainB, banyakPemainC, totalGajiA, totalGajiB, totalGajiC, totalGaji, totalSisa;
		
		kelasData kD = new kelasData();
        System.out.println("\n== GAJI PEMAIN SEPAK BOLA INDONESIA ==");
        System.out.println("*Gaji Pemain Dalam Nominal Juta");
        System.out.println("Pemain Kelas A = Rp."+kD.getKelasA());
        System.out.println("Pemain Kelas B = Rp."+kD.getKelasB());
        System.out.println("Pemain Kelas C = Rp."+kD.getKelasC());
		
		kelasA A = new kelasA();
		System.out.println("------------- KETERANGAN -------------");
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
        System.out.print("Jumlah Pemain Kelas A : ");
        banyakPemainA = input.nextInt();
        System.out.print("Jumlah Pemain Kelas B : ");
        banyakPemainB = input.nextInt();
        System.out.print("Jumlah Pemain Kelas C : ");
        banyakPemainC = input.nextInt();
		System.out.println("-------------------------------------- +");
		banyakPemain = hitung.hitungTotalPemain(banyakPemainA, banyakPemainB, banyakPemainC);
		System.out.print("Jumlah Total Pemain   : "+banyakPemain);
        System.out.println("\n--------------------------------------");
        
        totalGajiA = hitung.hitungPemain(banyakPemainA, kD.getKelasA());
        totalGajiB = hitung.hitungPemain(banyakPemainB, kD.getKelasB());
        totalGajiC = hitung.hitungPemain(banyakPemainC, kD.getKelasC());
        totalGaji = hitung.hitungGaji(totalGajiA, totalGajiB, totalGajiC);
		totalSisa = hitung.hitungSisa(kD.getBelanjaMax(), totalGaji);
        
        System.out.println("Nama Club                 : "+kD.getNamaClub());
        System.out.println("Total Gaji Pemain Kelas A : Rp."+totalGajiA);
        System.out.println("Total Gaji Pemain Kelas B : Rp."+totalGajiB);
        System.out.println("Total Gaji Pemain Kelas C : Rp."+totalGajiC);
		System.out.println("-------------------------------------- +");
        System.out.println("Total Gaji Pemain         : Rp."+totalGaji);
		System.out.println("Sisa Belanja Pemain 	  : Rp."+totalSisa);
        System.out.println("--------------------------------------");
    }
    
}