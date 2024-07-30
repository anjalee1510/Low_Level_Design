package Concurrency_02;

import java.util.Arrays;
import java.util.List;

public class DownloadManagerApp {
public static void main(String[] args) {
	// TODO: Create a DownloadManager instance with an appropriate thread pool size.
	List<String> fileUrls=Arrays.asList("http://example.com/file1.txt",
            "http://example.com/file2.txt",
            "http://example.com/file3.txt");
	DownloadManager manager= new DownloadManager(3);
	manager.downloadFiles(fileUrls);
	manager.shutdown();
	// TODO: Test the download manager by downloading multiple files concurrently.
	// TODO: Display the progress of each download task.
	// TODO: Shutdown the download manager after completing the downloads.
}
}
