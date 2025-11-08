package MultiThreading;

class Mthread  extends Thread{
	@Override
	public void run() {
		System.out.println(" In (run() Method ");
	}
	  
	  
   }
public class ByextendThread {
	public static void main(String[] args) {
		Mthread m = new Mthread();
		m.start();

	}

}

o/p --->  In (run() Method
