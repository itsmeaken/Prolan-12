package kelasdata;

import kelasprogram.kelasInterface;

public class marqueePlayer implements kelasInterface {

    @Override
    public void rataRataGaji() {
        System.out.println("Rata-rata gaji Marquee Player yaitu 5 Milyar Rupiah."); 
    }

    @Override
    public void karir() {
        System.out.println("Marquee Player adalah pemain yang pernah bermain di Piala Dunia selama 3 putaran terakhir (2006, 2010, 2014) atau liga top dunia."); 
    }
	
    @Override
    public void contohPemain() {
        System.out.println("Pemain yang termasuk kategori Marquee Player diantarnya Michael Essien, Carlton Cole, Peter Odemwingie."); 
    }
	
}