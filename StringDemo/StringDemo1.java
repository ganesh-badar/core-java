package StringDemo;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = new String("Ganesh");
		//String s2 = "Shreyash";--> Memory Efficient
		System.out.println(s1.length());
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(0,2));
		
		String s3 = "Shreyash";
		String s4 = "Shreyash";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.toUpperCase());
		String s5 = "ROHIT";
		System.out.println(s5.toLowerCase());
		System.out.println(s5.charAt(3));
		
		
		
		//concate
		String ss1 = "Pro";
		String ss2 = "Found";
		System.out.println(ss1.concat(ss2));
		
		
		//Splitfunction
		String ss3 = new String("Java Is Object Oriented Language");
		String arr[]=ss3.split("");
		for(String i : arr) {
			System.out.print(i);
		}
	}

}

