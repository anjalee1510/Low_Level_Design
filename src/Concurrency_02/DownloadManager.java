package Concurrency_02;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class DownloadManager {
	private ExecutorService executorService;
	
	public DownloadManager(int threadPoolSize) {
	// TODO: Initialize the ExecutorService with a fixed-size thread pool.
		executorService= Executors.newFixedThreadPool(threadPoolSize);
	}
	
	public void downloadFiles(List<String> fileUrls) {
	// TODO: Implement a method to submit download tasks for each file URL.
		CountDownLatch latch=new CountDownLatch(fileUrls.size());
		for(String url:fileUrls) {
			executorService.submit(()->{
				//Simulate file download 
				System.out.println("Downloading file from: "+url);
				// Simulate downlaod progress
				for(int progress=0;progress<=100;progress+=10) {
					System.out.println("Downlaod progress for "+url+": "+progress+"%");
					try {
						Thread.sleep(1000);// simulate download time
					}catch(InterruptedException e) {
						e.printStackTrace();					
					}finally {
						latch.countDown();
					}
				}
				System.out.println("Download complete for: "+url);
			});
		}
		try {
			latch.await();//wait for all downlaods to complete
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	//by using a CountDownLatch we can cause a thread to
	//block until other threads have completed a given task.
	// TODO: Implement a method to track and display the progress of each download task.
	
	public void shutdown() {
	// TODO: Shutdown the ExecutorService when the download manager is done.
		executorService.shutdown();
	}
}
