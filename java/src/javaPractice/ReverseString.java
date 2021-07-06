package javaPractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="testing team";
	        String rev="";
	        char a[]= str.toCharArray();
	        int len=a.length;
	        for(int i=len-1;i>=0;i--) {
	             rev=rev+a[i];
	}
	}
}
