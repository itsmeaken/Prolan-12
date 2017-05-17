import java.util.Scanner;


public class Enkapsulasi {

    public static void main(String[] args) {
        int banyakPemainA, banyakPemainB, banyakPemainC, totalGajiA, totalGajiB, totalGajiC, totalGaji;
        
        hargaPemain hP = new hargaPemain();
        prosesHitung hitung = new prosesHitung();
        System.out.println("\n========= TOTAL GAJI PEMAIN =========");
        System.out.println("*Gaji Pemain Dalam Nominal Juta");
        System.out.println("Pemain Kelas A = Rp."+hP.getKelasA());
        System.out.println("Pemain Kelas B = Rp."+hP.getKelasB());
        System.out.println("Pemain Kelas C = Rp."+hP.getKelasC());
        System.out.println("-------------------------------------");
        
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
        System.out.println("-------------------------------------");
        
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
        System.out.println("-------------------------------------");
    }
    
}