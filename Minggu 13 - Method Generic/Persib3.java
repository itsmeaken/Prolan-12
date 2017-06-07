public class Persib3 {

	public <V> Persib2 Data (V Data) {
        return (Persib2) Data;
    }
    
	public static void main(String[] args) {
		Persib3 psb3 = new Persib3();
        psb3.Data(new Persib2<>()).namaClub("Persib");
        psb3.Data(new Persib2<>()).gajiPemain(15000);
		psb3.Data(new Persib2<>()).gajiMaks(20000);
	}
	
}