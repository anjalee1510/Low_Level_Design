package LambdasAndStreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {
		Integer[] intArray= {1,2,3,4,5};
		List<Integer> list=Arrays.asList(intArray);
		//Collecting all elements of the list into a new list using collect() method
		List<Integer> evenNumbersList=list.stream()
											.filter(i-> i%2==0)
											.collect(Collectors.toList());
		System.out.println(evenNumbersList);
		
		//Finding the maximum of all the values in the stream
		Integer max=list.stream()
						.collect(Collectors.maxBy(Integer::compare)).get();
		
		System.out.println("max : "+max);
		
		// Finding the sum of all the values in the stream
		Integer sum=list.stream()
						.collect(Collectors.summingInt(i->i));
		System.out.println("sum : "+sum);
		
		//Finding minimum of all the values
		Integer min=list.stream()
						.collect(Collectors.minBy(Integer::compare)).get();
		System.out.println("min: "+min);
		
		//Counting the values in the stream
		
		Long count=list.stream().collect(Collectors.counting());
		System.out.println("count: "+count);
	}

}
