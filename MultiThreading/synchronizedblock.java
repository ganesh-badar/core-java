package MultiThreading;
class TableDemo1{
	void show(int x) {
		synchronized(this) {
			for(int i = 1;i<=10;i++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(i*x);
			}
		}
	}
}
class one1 extends Thread{
	TableDemo1 t1;

	public one1(TableDemo1 t1) {
		//super();
		this.t1 = t1;
	}
	public void run() {
		t1.show(3);
	}
}


class two1 extends Thread{
	TableDemo1 t1;

	public two1(TableDemo1 t1) {
	//	super();
		this.t1 = t1;
	}
	
	public void run() {
		t1.show(10);
	}
	
}

public class synchronizedblock {
	
	public static void main(String args[]) {
		TableDemo1 t1 = new TableDemo1();
		one1 o = new one1(t1);
		o.start();
		
		two1 o1 = new two1(t1);
		o1.start();
		
		
	}

}
