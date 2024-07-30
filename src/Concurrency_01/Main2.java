package Concurrency_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
	public static void main(String[] args) throws InterruptedException {
		List<Long> inputNumbers=Arrays.asList(100000000L, 3435L, 35435L, 2324L,4656L, 23L, 5556L);
		List<FactorialThread> threads=new ArrayList<>();
		for(long number:inputNumbers) {
			FactorialThread t=new FactorialThread(number);
			threads.add(t);
		}
		for(Thread t:threads) {
			t.start();
		}
		for(Thread t:threads) {
			t.join(2000);
		}
		for(int i=0;i<inputNumbers.size();i++) {
			FactorialThread t=threads.get(i);
			if(t.isFinished()) {
				System.out.println(t.getResult());
			}
			else {
				System.out.println("Couldn't complete calc in 2s");
			}
		}
		System.out.println("Main is completed!");
		
	}
}
