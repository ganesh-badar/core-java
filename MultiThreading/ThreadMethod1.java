package MultiThreading;



class TDemo extends Thread{
	
	
	public void run() {
		super.run();
		
		for(int i=1 ; i<5;i++) {
			try {
				Thread.sleep(2000);
				System.out.println("in run of current thread "+ Thread.currentThread().getName()+" , "+ " its priority is "+this.getPriority()+" priority");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}
public class ThreadMethod1 {

	public static void main(String[] args) throws InterruptedException {
		TDemo t1 = new TDemo();
		t1.setName("First");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t1.join();
		
		
		TDemo t2 = new TDemo();
		t2.setName("Second");
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		t2.join();
		
		TDemo t3 = new TDemo();
		t3.setName("Three");
		t3.setPriority(Thread.NORM_PRIORITY);
		t3.start();
		t3.join();

	}

}



o/p ---> 
		in run of current thread First,its priority is 10 priority
		in run of current thread First,its priority is 10 priority
		in run of current thread First,its priority is 10 priority
		in run of current thread First,its priority is 10 priority
		in run of current thread Second,its priority is 1 priority
		in run of current thread Second,its priority is 1 priority
		in run of current thread Second,its priority is 1 priority
		in run of current thread Second,its priority is 1 priority
		in run of current thread Three,its priority is 5 priority
		in run of current thread Three,its priority is 5 priority
		in run of current thread Three,its priority is 5 priority
		in run of current thread Three,its priority is 5 priority
		

