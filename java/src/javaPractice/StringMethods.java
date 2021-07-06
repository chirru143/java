package javaPractice;

public class StringMethods {

	public static void main(String[] args) {
		String s1= new String("Hi Raghu");
		String s2= "I hate Myself";
//		String More Methods
//		check length of the string
		System.out.println(s1.length());
		System.out.println(s2.length());
//		check the place of the string
		System.out.println(s1.charAt(4));
		System.out.println(s2.charAt(10));
//		print the in single line
		System.out.println(s1.concat(s2));
		System.out.println(s2.concat(s1));
//		comparion of two strings
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

	}

}
