public class Kenfajri extends Mahasiswa {
	
	@Override
	protected void kuliah(){
		System.out.println("Berangkat ke kampus, masuk kelas tepat pada waktunya, selalu mengerjakan tugas, mengikuti uts, mengikuti uas.");
	}
	
	@Override
	protected void lulus(){
		System.out.println("Supaya mendapatkan indeks nilai bagus. Indeks minimal yang harus didapat supaya lulus adalah D.");
	}
	
	@Override
	protected void tidakLulus(){
		System.out.println("Jika mendapatkan indeks nilai E, berarti tidak lulus.");
	}
}