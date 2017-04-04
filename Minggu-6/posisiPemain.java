import java.util.Scanner;

public class posisiPemain {
	Scanner input=new Scanner(System.in);
	String nama; //posisi;
	byte nomorPunggung;
	int overallRating;
	
	posisiPemain(int overallRating) {
		this.overallRating = 80;
	}
	
	public void namaPemain() {
		System.out.print("Nama Pemain : ");
		nama=input.nextLine();
	}
	
	public void nomor() {
		System.out.print("Nomor Punggung : ");
		nomorPunggung=input.nextByte();
	}
	
	//public void posPemain() {
		//System.out.print("Posisi Pemain : ");
		//posisi=input.nextLine();
	//}
	
    public void passing() {
        System.out.print("Pemain sepak bola harus mempunyai akurasi passing yang bagus");
    }
    
	public void shooting() {
        System.out.print("Pemain sepak bola harus mempunyai akurasi shooting yang bagus");
    }
    
	public void jersey() {
        System.out.print("Dalam satu tim sepak bola, menggunakan warna jersey yang sama");
    }
}