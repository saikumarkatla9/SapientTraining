package com.pack2;

public class RunnableClient {

	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		
		Runnable r2=()->{
			for(int i=0;i<=1000;i++){
					System.out.println(Thread.currentThread().getName()+" "+(1*9));
			}
		};
		
		Thread t1 =new Thread(r1);
		t1.setName("tiger");
		
		Thread t2 =new Thread(r1);
		t2.setName("lion");
		
		t1.start();
		t2.start();
		
		System.out.println("main over");

	}

}