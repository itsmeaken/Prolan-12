public class posPemain {
	private String  nama,nomorPunggung,posisi;
	byte  umur;
	
	public static void main (String[] args) {
		centermf cmf = new centermf();
		System.out.println(cmf.nama);
        cmf.posisiPemain("Defensive Midfilder");
        cmf.posisiPemain("Defensive Midfilder","Center Midfilder");
	}
        
}