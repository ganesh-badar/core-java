package MultiThreading;


class sharedresource{
	
	private int data;
	private boolean hasData= false;
	public synchronized void produce(int value) {
		while(hasData) {
			try {wait();
			}
			catch(InterruptedException e ){
				Thread.currentThread().interrupt();
				
			}
		}
		
		
		data = value;
		hasData=true;
		System.out.println("produced:"+data);
		notify();
	}


public synchronized void consume() {
	while(!hasData) {
		try {
		wait();
		}
		catch(InterruptedException e ) {
			Thread.currentThread().interrupt();
		}
	}
	
	System.out.println("consume : "+ data);
	hasData=false;
	notify();
}}

class producer extends Thread{
	private sharedresource resource;

	public producer(sharedresource resource) {
		super();
		this.resource = resource;
	}
	
	public void run() {
		for(int i = 1; i<=5;i++) {
			resource.produce(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
	}
}


class consumer extends Thread{
	private sharedresource resource;

	public consumer(sharedresource resource) {
		super();
		this.resource = resource;
	}
	
	public void run() {
		for(int i= 1;i<=5;i++) {
			resource.consume();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
	}
	
}

public class Threadcomunicationex {

	public static void main(String[] args) {
		sharedresource resource = new sharedresource();
		producer producer = new producer(resource);
		consumer consumer = new consumer(resource);
		producer.start();
		consumer.start();
		

	}

}
