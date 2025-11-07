package Exception;
import java.text.NumberFormat;
import java.util.Scanner;
//ATM


class InsufficientFundException extends Exception{

	public InsufficientFundException(String msg) {
		super(msg);
	}
	
	
}
public class Demo4 {

	public static void main(String[] args)  {
		Double Balance = 10000.00;
		System.out.println("Enter Amount : ");
		Scanner sc = new Scanner(System.in);
		
		try {
		Double Amount = sc.nextDouble();
		if(Amount<=0) {
			throw new IllegalArgumentException("Amount must be greater than 0");
		}
		
		if(Amount > Balance) {
			throw new InsufficientFundException("Withdraw Amount should less than Balance "+" Insufficient Balance");
		}
		
		
		Balance = Balance - Amount;
		System.out.println("Transaction Sucessfull: "+"Updated Balance Is :"+Balance );
      
		}
		
		catch(NumberFormatException ne) {
			System.out.println("Invalid Argument");
			
		} 
		catch(IllegalArgumentException | InsufficientFundException e) {
			System.out.println(( e).getMessage());
			
		}
		catch (Exception e) {
			System.out.println("Unexpected Error Occured!");
		}
		finally {
			System.out.println("thank you! for using the Atm");
		}
	 sc.close();
}
}