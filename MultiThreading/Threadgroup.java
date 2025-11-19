package MultiThreading;

class mythread11 extends Thread{
	public void run() {
		super.run();
		System.out.println("In run() of "+ Thread.currentThread().getName());
	}
	
}

public class Threadgroup {

	public static void main(String[] args) {

		mythread11 m1 = new mythread11();
		mythread11 m2 = new mythread11();
		mythread11 m3 = new mythread11();
		
		ThreadGroup tg = new ThreadGroup("parent");
		Thread t1 = new Thread (tg,m1,"First");
		Thread t2= new Thread (tg,m2,"Second");
		Thread t3 = new Thread (tg,m3,"Third");
		
		t1.start();
		t2.start();
		t3.start();
		tg.list();
		

	}

}
