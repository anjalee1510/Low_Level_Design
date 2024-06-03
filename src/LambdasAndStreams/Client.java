package LambdasAndStreams;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public class Client {
	public static void main(String[] args) {
		
		//Runnable : Class which would implement our method
		//Method 2
		Runnable runnable=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hey! in anonymous class");
				
			}
			
		};
		Thread t=new Thread(runnable);
		
		//Lambdas
		//Runnable r2={// try to take the parameter) -> {//body of the function}
		
		Runnable r2=() -> {
			System.out.println("Hey in Lambdas");
		};
		Thread t1=new Thread(r2);
		t1.start();
		
		// another way
		Thread t2=new Thread(() -> System.out.println("Hey!"));
		
		//Comparator
		
		List<Integer> l1= List.of(1,5,3,6,2,8);
		
		Collections.sort(l1,(x,y)->{
			if(x>y) return -1;
			else if(x<y) return 1;
			else return 0;
		});
	}

}
