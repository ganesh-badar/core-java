package MultiThreading;




class Mthread2 extends Thread{

	@Override
	public void run() {
		
		System.out.println("In run of "+ Thread.currentThread());
	}
	
	 
}
public class ThreadMethods {

	public static void main(String[] args) throws InterruptedException {
		Mthread2 m = new Mthread2();
		m.setName("First");
		m.start();//run state
		System.out.println(m.isAlive());
		Mthread2 m1 = new Mthread2();
		m1.setName("Second");
		m1.sleep(2000);
		m1.start();
		

	}

}

o/p ---> true
		 In run of Thread[#29,First,5,main]
		 In run of Thread[#30,Second,5,main]
