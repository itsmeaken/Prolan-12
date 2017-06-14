package kelasprogram;

public class prosesHitung extends abstrak {

    @Override
    protected int hitungPemain(int a, int b) {
        return a*b;
    }

    @Override
    protected int hitungTotalPemain(int a, int b, int c, int d) {
       return a+b+c+d;
    }
	
    @Override
    protected int hitungGaji(int a, int b, int c, int d) {
       return a+b+c+d;
    }
	
    @Override
    protected int hitungSisa(int a, int b) {
       return a-b;
    }
    
}