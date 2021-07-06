package javaPractice;

public class Fibonaci {

	public static void main(String[] args) {
		int i1=0;
		int i2=1;
		
		 System.out.print(i1+" "+i2);    
		    
		 for(int i=0;i<=5;++i)   
		 {    
		  int i3=i1+i2;    
		  System.out.print(" "+i3);    
		  i1=i2;    
		  i2=i3;    
		 }    

	}

}
