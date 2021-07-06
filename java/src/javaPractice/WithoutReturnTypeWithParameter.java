package javaPractice;

public class WithoutReturnTypeWithParameter {
	void add(int x,int y) {
		int z=x+y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		WithoutReturnTypeWithParameter ad=new WithoutReturnTypeWithParameter();
		ad.add(10,20);

	}

}
