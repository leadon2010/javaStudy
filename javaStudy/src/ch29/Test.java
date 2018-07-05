package ch29;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		List<Future<String>> futures = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			final int index = i;
			futures.add(executor.submit(() -> {
				Thread.sleep(5000);
				return Thread.currentThread().getName() + ", index=" + index + ", ended at " + new Date();
			}));
		}
		for (Future<String> eachFuture : futures) {
			String result = eachFuture.get();
			System.out.println("Thread result: " + result);
		}

		executor.shutdown();

	}
}
