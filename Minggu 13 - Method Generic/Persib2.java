public class Persib2 <T> {
    
    public <T> void gajiPemain(T gajiPemain) {
        System.out.println("Total Gaji Pemain (Dalam Juta) : "+gajiPemain);
    }
    public <N> void sponsor(T sponsor) {
        System.out.println("Total Sponsor : "+sponsor);
    }
    public <T> void gajiMaks(T gajiMaks) {
        System.out.println("Maksimal Gaji Pemain (Dalam Juta) : "+gajiMaks);
    }
    public void namaClub(String namaClub) {
        System.out.println("Nama Club : "+namaClub);
    }
    public static void main(String[] args) {
        Persib2 psb2 = new Persib2();
        psb2.namaClub("Persib");
        Persib2<Integer> prsb2 = new Persib2<>();
		prsb2.sponsor(23);
        prsb2.gajiPemain(15000);
        prsb2.gajiMaks(20000);               
    }
	   
}