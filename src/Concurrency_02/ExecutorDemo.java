package Concurrency_02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(10);
		for(int i=0;i<100;i++) {
			executor.execute(new NumberPrinter(i));
		}
		executor.shutdown();
	}

}
/*
 * Types of Thread Pool
 * 1. FixedThreadPool
 * 		ExecutorService executor=Executors.newFixedThreadPool(nThreads);
 * 2. CachedThreadPool
 * 		ExecutorService executor=Executors.newCachedThreadPool();
 * 3. SingleThreadExecutor
 * 		ExecutorService executor=Executors.newSingleThreadExecutor();
 * 4.ScheduledThreadPool
 * 		ScheduledExecutorService executor=Executors.newScheduledThreadPool(nThreads);
 * 5.WorkStealingPool
 * 	 ExecutorService executor= Executors.newWorkStealingPool(); 
 * 
 */
