package com.pack7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableClient {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService pool = Executors.newCachedThreadPool();
		MyCallable c1 = new MyCallable();
		Future<Integer> future = pool.submit(c1);
		/*System.out.println("main line1");
		System.out.println("main line2");
		System.out.println("main line3");*/
		for(int i=1;i<=500;i++){
			System.out.println("main thread "+i);
		}
		
		int res=future.get();
		System.out.println(res);

	}

}
