package Concurrency_02;

public class Adder implements Runnable {

	private Count count;
	
	public Adder(Count count) {
		this.count=count;
	}
	@Override
	public void run() {
		for(int i=1;i<=5000;i++) {
			count.value+=i;
		}
	}

}
