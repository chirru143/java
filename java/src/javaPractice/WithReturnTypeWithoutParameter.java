package javaPractice;

public class WithReturnTypeWithoutParameter {
int add() {
int a=10;
int b=20;
int c=a+b;
return c;
}
	
	public static void main(String[] args) {
		WithReturnTypeWithoutParameter ad=new WithReturnTypeWithoutParameter();
		int result=ad.add();
		System.out.println(result);
		
	

	}

}
