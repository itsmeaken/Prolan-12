public class prosesHitung extends abstrak {

    @Override
    protected int hitungPemain(int x, int y) {
        return x*y;
    }

    @Override
    protected int hitungTotalPemain(int x, int y, int z) {
       return x+y+z;
    }
	
	@Override
    protected int hitungGaji(int x, int y, int z) {
       return x+y+z;
    }
	
	@Override
	protected int hitungSisa(int x, int y) {
		return x-y;
	}
    
}