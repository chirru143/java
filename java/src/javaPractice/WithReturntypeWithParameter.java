package javaPractice;

public class WithReturntypeWithParameter {
	int add(int x,int y) {
	int z=x+y;
	return z;
	}
	public static void main(String[] args) {
		WithReturntypeWithParameter ad=new WithReturntypeWithParameter();
		int results=ad.add(20, 30);
		System.out.println(results);
	}

}
