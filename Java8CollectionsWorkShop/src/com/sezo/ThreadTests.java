package com.sezo;

import java.util.function.Consumer;

public class ThreadTests {

	public static void main(String[] args) {

		Consumer<Integer>  consumer= System.out::println;
		
		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				consumer.accept(i);
			}
		};
		Thread t = new Thread(r);
		t.start();

	}

}
