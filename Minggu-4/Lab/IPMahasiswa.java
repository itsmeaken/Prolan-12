import java.util.Scanner;

public class IPMahasiswa {
	public static void main (String[] args) {
		IPMahasiswa ipmhs = new IPMahasiswa();
		
		Scanner input = new Scanner(System.in);
		float ip, jumlah = 0, ipRata = 0;
		int jmlMhs = 0, jmlMhsLls = 0, jmlMhsTdkLls = 0;
		System.out.println("Data IP Mahasiswa");
		System.out.println("=================");
		System.out.print("Masukkan IP : ");
		ip = input.nextFloat();
		while (ip != -999) {
			if (ipmhs.isWithinRange(ip, 0, 4) == 1) {
				jmlMhs++;
				jumlah = jumlah + ip;
				ipRata = jumlah / jmlMhs;
			}
			if (ip >= 2.75 && ip <= 4) {
				jmlMhsLls++;
			}
			if (ip >= 0 && ip < 2.75) {
				jmlMhsTdkLls++;
			}
			System.out.print("Masukkan IP : ");
			ip = input.nextFloat();
		}
		System.out.println("-----------------");
		System.out.println("Jumlah Mahasiswa adalah : " + jmlMhs);
		System.out.println("Jumlah Mahasiswa Lulus adalah : " + jmlMhsLls);
		System.out.println("Jumlah Mahasiswa Tidak Lulus adalah : " + jmlMhsTdkLls);
		System.out.println("IP Rata-Rata adalah : " + ipRata);
	}

	int isWithinRange(float X, int min, int max) {
		if (X >= min && X <= max) {
			return 1;
		} else {
			return 0;
		}
	}
}