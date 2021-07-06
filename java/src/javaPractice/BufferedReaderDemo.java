package javaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader ab= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter 1st number");
       int x=Integer.parseInt(ab.readLine());
       System.out.println("enter 2nd  number");
       int y= Integer.parseInt(ab.readLine());
       System.out.println("sum is :"+(x+y));
	}

}
