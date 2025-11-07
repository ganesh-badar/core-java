package Exception;

import java.util.Scanner;

class ADemo2{
	int x,y;
	
	void get() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number : ");
		
		x = sc.nextInt();
		y = sc.nextInt();
	}
	
	
	void display() {
		try {
		if(y==0) 
			throw new ArithmeticException();
		else if(x<y)
			throw new Exception();
		else
			System.out.println("Division "+ (x/y));
	
	}
	
	catch(ArithmeticException ae) {
		System.out.println("Division is not posible");
	}
	
		catch(Exception e ) { // e = java is focuses on object hence we hava to create  reference  of "Exception" class
			System.out.println("First no is Smaller than Second  no ");
		}
		finally {
			System.out.println("Thank You!!");
	

		System.out.println("Addition is "+(x+y) );
		System.out.println("Substraction "+ (x-y));
		System.out.println("Multilpication" + (x*y));
	
		
		
		}


	}}


public class ADemo {

	public static void main(String[] args) {
		ADemo2  a = new ADemo2();
		a.get();
		a.display();
		
		
		

	}

}
