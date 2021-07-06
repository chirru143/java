package javaPractice;

public class MultiDimentionalArray {

	public static void main(String[] args) {
//		int arr[][]=new int[2][2];
		int arr[][]= {{1,4,3},{2,2,5},{2,3,0}};
		arr[0][0]=1;
		arr[0][1]=2;
		arr[1][0]=3;
		arr[1][1]=4;
		for(int[]x:arr) {
			for(int Y:x) {
				System.out.print(Y+" ");
			}
			System.out.println();
		}
		

	}

}
