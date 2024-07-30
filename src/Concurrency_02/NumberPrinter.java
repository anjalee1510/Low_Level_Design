package Concurrency_02;

public class NumberPrinter implements Runnable{
	int number;
	NumberPrinter(int number){
		this.number=number;
	}
	@Override
	public void run() {
		System.out.println("Prining "+ number +" from "+Thread.currentThread().getName());
	}

}
