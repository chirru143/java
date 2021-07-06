package javaPractice;

public class MethodOverLoading {

	void show ()
	{
		System.out.println("without parameters");
		
	}
	void show (int a) {
		System.out.println("with parameters");
		
	}
	void show (int a, String b) {
		System.out.println("with 2 parameters");
	}
	
	}

class B
{
	public static void main(String[] args) {
		MethodOverLoading A=new MethodOverLoading();
		A.show();
		A.show(10);
		A.show(20, "Raghu");
}
}
                               //error