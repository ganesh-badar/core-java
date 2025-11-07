package Exception;
import  java.util.Scanner;


class passout extends Exception {

	 passout(String msg) {
		super(msg);
	}	
}



public class Demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PassOut Year : ");
		int year = sc.nextInt();
		
		try
		   {
			if (year != 2024) {
				throw new passout("Pass Out Year Must Be 2024!..." +" Sorry You Can't Apply" );
				
			}
		else 
			
				System.out.println("Register Here! ");
		   }
		catch(passout p){
			System.out.println(p);
			
		}
		
		

	}
}

