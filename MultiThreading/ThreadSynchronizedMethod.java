package MultiThreading;

class TableDemo{
	
	synchronized void show(int x ) {
		for (int i = 1 ; i <= 10 ;i++) {
			try {
				Thread.sleep(2500);
				System.out.println(i*x);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
}

class One extends Thread{
	TableDemo t;
	//Association :- creating reference of 1 class into another class
	
	public One(TableDemo t) {
		this.t = t;
	}
	@Override
	public void run() {
		t.show(5);
	}
}


class Two extends Thread{
	TableDemo t;
	public Two(TableDemo t) {
		this.t=t;
		
	}
	@Override
	public void run() {
		t.show(2);
	}
}



public class ThreadSynchronizedMethod {

	public static void main(String[] args) {
		
		TableDemo t1 = new TableDemo();
		One o = new One(t1);
		o.start();
		
		Two t = new Two(t1);
		t.start();
		
	}

}
