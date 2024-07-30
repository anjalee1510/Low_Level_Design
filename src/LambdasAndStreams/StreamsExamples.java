package LambdasAndStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExamples {
	public static void main(String[] args) {
		List<String> fruits=Arrays.asList("Apple","Banana","Orange","Mango");
		List<String> result=fruits.stream()
								.filter(fruit -> fruit.startsWith("A"))
								.map(String::toUpperCase)
								.collect(Collectors.toList());
		
		System.out.println(result);
		
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		Stream<Integer> evenNumbers = stream.filter(number -> number % 2 == 0);
		evenNumbers.forEach(System.out::println);
		Comparator<Integer> comparator = (number1, number2) -> number1 - number2;
		Stream<Integer> stream2 = Stream.of(5, 3, 1, 4, 2);
		Stream<Integer> sortedNumbers = stream2.sorted(comparator);
		//sortedNumbers.forEach(System.out::println);
		sortedNumbers.forEach(number-> System.out.println(number));
		
		Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);
		int sum = stream3.reduce(0, (number1, number2) -> number1 + number2);
		System.out.println("sum : "+sum);
		
		List<String> words = Arrays.asList("Hello", " ", "Stream", " ", "API");
		// Concatenating strings
		String result2 = words.stream()
		.collect(Collectors.joining());
		System.out.println("Concatenated String: " + result2); 
		
	}

}
