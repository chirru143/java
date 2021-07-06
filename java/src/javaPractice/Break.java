package javaPractice;

public class Break {

	public static void main(String[] args) {
		int sum=0 , capacity=10;
		for (int i=0;i<=10;i++)
		{
			System.out.println(i);
			sum=sum+i;
			if(sum>=capacity) 
				break;
			}
			System.out.println(sum);
		}

	}


