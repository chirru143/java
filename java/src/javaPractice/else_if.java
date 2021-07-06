package javaPractice;

public class else_if {

	public static void main(String[] args) {
		int marks=90;
		if (marks>85) {
			System.out.println("A grade");
		}
		else if (marks>75) {
			System.out.println("B grade");
		}
		else if(marks>55) {
			System.out.println("c grade");
		}
		else {
			System.out.println("fail");
		}
	}

}
