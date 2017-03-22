import java.util.Scanner;

public class maxmin {
	
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		maxmin nilai = new maxmin();
		int N, i=1, data, max=0, min=1000;
		char pil;
		System.out.print("\n");
		System.out.print("Masukkan banyaknya data (N) : ");
		N = input.nextInt();
		System.out.println("A = Minimum");
		System.out.println("B = Maksimum");
		System.out.print("Masukkan pilihan : ");
		pil = input.next().charAt(0);
		System.out.print("\n");
		while (i<=N) {
			System.out.print("Masukkan nilai ke-"+i+": ");data=input.nextInt();
			i++;
			if(pil == 'A'){
				min = nilai.pilihanA(data,min);
			} else {
				max= nilai.pilihanB(data,max);
			}
		}
		System.out.print("\n");
		System.out.println("Jumlah bilangan   : "+N);
		if(pil == 'A'){
			System.out.println("Pilihan           : "+pil);
			System.out.println("Bilangan Minumum  : "+min);
		} else {
			System.out.println("Pilihan           : "+pil);
			System.out.println("Bilangan Maksimum : "+max);
		}
	}
	
	int pilihanA(int x, int min){
		if (x < min){
			min=x;
			return min;
		} return min;
	}
	int pilihanB(int y, int max){
		if(y > max){
			max=y;
			return max;
		} return max;
	}
}