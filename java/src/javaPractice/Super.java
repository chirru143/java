package javaPractice;

public class Super {
	
	
	class Animal{  
		String color="white";  
		}  
		class Dog extends Animal{  
		String color="black";  
		void printColor(){  
		System.out.println(color);//prints color of Dog class  
		System.out.println(super.color);//prints color of Animal class  
		}  
		}  
		class TestSuper1{  
		public void main(String args[]){  
		Dog d=new Dog();  
		d.printColor();  
		}}  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
//class A{
//	
//	int a=20;
//}
//class B extends A
//{
//	int b=30;
//	void show ()
//	{
//		int a=30;
//		{
//			System.out.println(a);
//			System.out.println(this.a);
//			System.out.println(super.a);
//		}
//	}
//}
//
//
//	public static void main(String[] args) {
//		
//
//	}
//
//}
