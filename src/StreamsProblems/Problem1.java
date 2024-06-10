package StreamsProblems;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Problem1 {



	    public static void main(String[] args) {
	 // Problem 1: join the list using "," as the delimiter using Stream API
	        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

	        // What does the following code snippet do?
	        String result = fruits.stream()
	                .collect(Collectors.joining(", "));

	        System.out.println("Result: " + result);
	        
//	  Problem 2:Finding the Second Highest Number
//	  Given a list of integers, find the second highest number using streams.
	        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
	        
	        Optional<Integer> secondhighest=numbers.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst();
	        System.out.println("2nd highest number :"+secondhighest.get());
//	        secondhighest.ifPresent(value -> System.out.println("Second highest: " + value));
	        
//	   Problem 3:Grouping and Counting
//	   Given a list of strings, group them by their length and count the number of strings of each length.
	        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
	        Map<Integer,Long> groupByLength=words.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
	        
//	    Problem 4: Flattening and Summing
//	    Given a list of lists of integers, flatten it into a single list and then sum all the integers.
	        
	        
	    }
	}


