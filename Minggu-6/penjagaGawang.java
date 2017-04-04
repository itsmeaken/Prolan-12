public class penjagaGawang extends posisiPemain {
	
	int overallRating;
	
	public penjagaGawang (int overallRating) {
		super(overallRating);
		System.out.println(overallRating);
	}

	@Override
	public void passing() {
		super.passing();
        System.out.println(". Penjaga gawang harus memiliki kemampuan menangkap bola di udara.");
    }

	@Override
	public void shooting() {
		super.shooting();
        System.out.println(". Berbeda dengan penjaga gawang yang tidak harus memiliki akurasi shooting yang bagus karena tugas utama penjaga gawang adalah menjaga gawang bukan mencetak gol.");
    }
	
	@Override
	public void jersey() {
		super.jersey();
        System.out.println(". Terkecuali penjaga gawang. Warna jersey penjaga gawang dibedakan dengan jersey pemain di timnya.");
    }
}