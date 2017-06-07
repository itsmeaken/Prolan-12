public class Persib {
    public <T> void namaClub(T namaClub) {
        System.out.println("Nama Club : "+namaClub);
    }
    public <U> void kota(U kota) {
        System.out.println("Kota Asal : "+kota);
    } 
    public <N> void jumlahPemain(N jumlahPemain) {
        System.out.println("Jumlah Pemain : "+jumlahPemain);
    }
    public <X,Y> void gajiPemain(X u ,Y v ) {
        System.out.println("Total Gaji Pemain (Dalam Juta) : "+u);
        System.out.println("Maksimal Gaji Pemain (Dalam Juta) : "+v);
    } 

    public static void main(String[] args) {
        Persib psb = new Persib();
        psb.namaClub("Persib");
		psb.kota("Bandung");
        psb.jumlahPemain("27");
        psb.gajiPemain(15000,20000);    
    }
	
}