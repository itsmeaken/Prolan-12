import java.util.Scanner;

public class mainClass {

    public static void main(String[] args) {
        int banyakPemainA, banyakPemainB, banyakPemainC, totalGajiA, totalGajiB, totalGajiC, totalGaji;
		
		hargaPemain hP = new hargaPemain();
        System.out.println("\n== GAJI PEMAIN SEPAK BOLA INDONESIA ==");
        System.out.println("*Gaji Pemain Dalam Nominal Juta");
        System.out.println("Pemain Kelas A = Rp."+hP.getKelasA());
        System.out.println("Pemain Kelas B = Rp."+hP.getKelasB());
        System.out.println("Pemain Kelas C = Rp."+hP.getKelasC());
		
		kelasA A = new kelasA();
		generic <String> classA = new generic <>();
		System.out.println("------------- KETERANGAN -------------");
		System.out.println("Pemain Kelas A");
		System.out.println("--------------");
		A.rataRataGaji();
		A.karir();
		classA.setType("Pemain yang termasuk kategori pemain kelas A diantarnya Irfan Bachdim, Boaz Solossa, Sergio Van Dijk.");
		System.out.println(classA.getType());
		
		kelasB B = new kelasB();
		generic <String> classB = new generic <>();
		System.out.println("--------------");
		System.out.println("Pemain Kelas B");
		System.out.println("--------------");
		B.rataRataGaji();
		B.karir();
		classB.setType("Pemain yang termasuk kategori pemain kelas B diantarnya Firman Utina, Bambang Pamungkas, Evan Dimas.");
		System.out.println(classB.getType());
		
		kelasC C = new kelasC();
		generic <String> classC = new generic <>();
		System.out.println("--------------");
		System.out.println("Pemain Kelas C");
		System.out.println("--------------");
		C.rataRataGaji();
		C.karir();
		classC.setType("Pemain yang termasuk kategori pemain kelas C diantarnya Febri Haryadi, Yandi Sofyan, Osvaldo Haay.");
		System.out.println(classC.getType());
		System.out.println("\n=== PERHITUNGAN TOTAL GAJI  PEMAIN ===");
        
        Scanner input = new Scanner(System.in);        
        System.out.print("Nama Club             : ");
        String nama = input.nextLine();
        hP.setNamaClub(nama);
        System.out.print("Jumlah Pemain Kelas A : ");
        banyakPemainA = input.nextInt();
        System.out.print("Jumlah Pemain Kelas B : ");
        banyakPemainB = input.nextInt();
        System.out.print("Jumlah Pemain Kelas C : ");
        banyakPemainC = input.nextInt();
        System.out.println("--------------------------------------");
        
		prosesHitung hitung = new prosesHitung();
        totalGajiA = hitung.hitungPemain(banyakPemainA, hP.getKelasA());
        totalGajiB = hitung.hitungPemain(banyakPemainB, hP.getKelasB());
        totalGajiC = hitung.hitungPemain(banyakPemainC, hP.getKelasC());
        totalGaji = hitung.hitungGaji(totalGajiA, totalGajiB, totalGajiC);
        
        System.out.println("Nama Club                 : "+hP.getNamaClub());
        System.out.println("Total Gaji Pemain Kelas A : Rp."+totalGajiA);
        System.out.println("Total Gaji Pemain Kelas B : Rp."+totalGajiB);
        System.out.println("Total Gaji Pemain Kelas C : Rp."+totalGajiC);
		System.out.println("------------------------------------- +");
        System.out.println("Total Gaji Pemain         : Rp."+totalGaji);
        System.out.println("--------------------------------------");
    }
    
}