package Concurrency_02;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Main {
	public static void main(String[] args) throws Exception {
		List<Integer> list=List.of(7,3,1,2,4,6,17,12);
		ExecutorService executorService=Executors.newCachedThreadPool();
		Sorter sorter=new Sorter(list,executorService);// will return a callable object
		Future<List<Integer>> output=executorService.submit(sorter);
		System.out.println(output.get());
		executorService.shutdown();
		
		
	}
}
