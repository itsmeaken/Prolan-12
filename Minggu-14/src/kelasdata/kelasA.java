package kelasdata;

import kelasprogram.kelasInterface;

public class kelasA implements kelasInterface {

    @Override
    public void rataRataGaji() {
        System.out.println("Rata-rata gaji pemain kelas A yaitu 1 Milyar Rupiah."); 
    }

    @Override
    public void karir() {
        System.out.println("Pemain kelas A adalah pemain yang merupakan squad Timnas Indonesia atau pemain yang memiliki skill yang bagus."); 
    }
	
    @Override
    public void contohPemain() {
        System.out.println("Pemain yang termasuk kategori pemain kelas A diantarnya Irfan Bachdim, Boaz Solossa, Sergio Van Dijk."); 
    }
	
}