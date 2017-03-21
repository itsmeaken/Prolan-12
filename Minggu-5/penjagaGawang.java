public class penjagaGawang extends posisiPemain {

	int ability = 80;
	
	public penjagaGawang(int kemampuan) {
		super(kemampuan);
	}
	
	public void menangkap() {
        System.out.println("Kemampuan menangkap bola :" + ability);
    }
	
	public void shooting() {
        System.out.print("Akurasi shooting :" + super.ability);
		System.out.println(", Penjaga gawang tidak harus memiliki akurasi shooting yang bagus");
    }
	
	public void posisiPemain() {
		passing();
        super.shooting();
		shooting();
		speed();
		menangkap();
    }

    public static void main(String args[]) {
        penjagaGawang pg = new penjagaGawang(80);
        pg.posisiPemain();
    }
}