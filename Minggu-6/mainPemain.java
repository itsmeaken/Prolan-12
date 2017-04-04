public class mainPemain {
	
	public static void main(String args[])
	{
		System.out.println("\n");
		posisiPemain pp = new posisiPemain(0);
		pp.namaPemain();
		pp.nomor();
		System.out.print("Overall Rating : ");
		penjagaGawang pg = new penjagaGawang(80);
		pg.passing();
		pg.shooting();
		pg.jersey();
	}
}