package kelasdata;

import kelasprogram.kelasInterface;

public class kelasB implements kelasInterface {

    @Override
    public void rataRataGaji() {
        System.out.println("Rata-rata gaji pemain kelas B yaitu 700 Juta Rupiah."); 
    }

    @Override
    public void karir() {
        System.out.println("Pemain kelas B adalah pemain yang mempunyai nama besar di persepak bolaan tanah air."); 
    }
	
    @Override
    public void contohPemain() {
	System.out.println("Pemain yang termasuk kategori pemain kelas B diantarnya Firman Utina, Bambang Pamungkas, Evan Dimas.");
    }
	
}