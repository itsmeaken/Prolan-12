public class posisiPemain {
	
	int ability;
	
	posisiPemain(int ability) {
		this.ability = 70;
	}
    public void passing() {
        System.out.println("Akurasi passing :" + ability);
    }
    
	public void shooting() {
        System.out.println("Akurasi shooting :" + ability);
    }
    
	public void speed() {
        System.out.println("Kecepatan lari :" + ability);
    }
}