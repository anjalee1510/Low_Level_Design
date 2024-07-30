package Concurrency_02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArrayRepaintingExample {
	public static void main(String[] args) {
		int[][] originalArray= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		int rows=originalArray.length;
		int cols=originalArray[0].length;
		
		ExecutorService executor=Executors.newFixedThreadPool(4);
		// Divide the array into four quadrants
		int midRow= rows/2;
		int midCol=cols/2;
		
		//Create tasks for each quadrant
		ArrayRepainterTask task1=new ArrayRepainterTask(originalArray,0,midRow-1,0,midCol-1);
		ArrayRepainterTask task2=new ArrayRepainterTask(originalArray,0,midRow-1,midCol,cols-1);
		ArrayRepainterTask task3=new ArrayRepainterTask(originalArray,midRow,rows-1,0,midCol-1);
		ArrayRepainterTask task4=new ArrayRepainterTask(originalArray,midRow,rows-1,midCol,cols-1);
		
		//Submit tasks to the ExecutorService
		executor.submit(task1);
		executor.submit(task2);
		executor.submit(task3);
		executor.submit(task4);
		
		//Shutdown the ExecutorService
		executor.shutdown();
		
		//wait for all tasks to complete
		while(!executor.isTerminated()) {
			//wait
		}
		//Print the repainted array
		for(int[] row : originalArray) {
			for(int value:row) {
				System.out.println(value+" ");
			}
			System.out.println();
		}
		
		
	}

}
