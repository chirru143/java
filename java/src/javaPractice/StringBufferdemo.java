package javaPractice;

public class StringBufferdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer ab= new StringBuffer("Hi Raghu");
		System.out.println(ab);
        //print in single line 	
		System.out.println(ab.append("Muniganti"));
//		delete between 3 to 6 letters
       System.out.println(ab.delete(3, 6));	
//		delete single character 
       System.out.println(ab.deleteCharAt(4));

       System.out.println(ab.substring(3)); 
       System.out.println(ab.substring(1, 4));
       System.out.println(ab.insert(8, "daddy"));
       System.out.println(ab.length());
       System.out.println(ab.replace(4, 8, "mummy"));
       System.out.println(ab.reverse());
       
	}

}
				