package Concurrency_01;

public class Main {
	public static void main(String[] args) {
//		Thread t=new Thread(new SimpleRunnable());
//		t.start();
//		// another way of using runnables-with lambda expressions
//		Thread myThread=new Thread(()->{
//			System.out.println(Thread.currentThread().getName());
//		});
//		myThread.start();
		
		for(int i=0;i<100;i++) {
			Thread t=new Thread(new NumberPrinter(i));
			t.start();
		}
	}
}
