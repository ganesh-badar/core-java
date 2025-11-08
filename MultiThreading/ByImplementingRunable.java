package MultiThreading;




class Mthread1 implements Runnable{
	
	public void run() {
		System.out.println("In run() method");
	}
			
}
public class ByImplementingRunable {

	public static void main(String[] args) {
		Mthread1 m = new Mthread1();
		Thread t = new Thread(m);
		t.start();

	}

}


o/p ---> In run() method
