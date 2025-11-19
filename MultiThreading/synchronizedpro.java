package MultiThreading;

import java.util.Scanner;

class BankAppDemo extends Thread{
	
	static int bal;
	void get() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Balance : ");
		bal = sc.nextInt();
	}
	
	synchronized static void Withdraw(int amt) {
		System.out.println(Thread.currentThread()+"is Accesing");
		
		if(bal<amt) {
			System.out.println("Insuficient Balance In Account");
		}
		else {
			bal= bal-amt;
			if(bal<5000) {
				System.out.println("Minimun Balance In Account Must Be RS:5000"+Thread.currentThread());
			}
			else {
				System.out.println("Transaction Successful By "+Thread.currentThread()+"Balance Is"+bal);
			}
		}
	}
	
	public void run() {
		for(int i=1; i<=5;i++) {
			try {
				Thread.sleep(2500);
				Withdraw(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class synchronizedpro {
	public static void main(String args[]) {
		
		BankAppDemo b1 = new BankAppDemo();
		b1.setName("Ganesh");
		b1.get();
		b1.start();
		
		BankAppDemo b2 = new BankAppDemo();
		b2.setName("shreyash");
		b2.get();
		b2.start();
		
	}

}
