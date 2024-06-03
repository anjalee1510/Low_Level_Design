package IterableIterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		for(Integer i:list) {
			System.out.println(i);
		}
		System.out.println("custom class output below:");
		Numbers numbers=new Numbers();
		numbers.list=List.of(2,5,10,12,15);
		//We can't iterate an object
		//my iterator should give me only elements divisible by 5
		for(Integer i:numbers) {
			System.out.println(i);
		}
	}

}
