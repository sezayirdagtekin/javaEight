package com.sezo;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class MethodRefereneTest {
	public static void main(String[] args) {
		
		Consumer<Integer> comsumer = System.out::println;
		
		BinaryOperator<Integer> sum = (a, b) -> Integer.sum(a, b);
		comsumer.accept(sum.apply(3, 5));
		
		
		BinaryOperator<Integer> sumMethodRef = Integer::sum;
		comsumer.accept(sumMethodRef.apply(4, 6));
		
		BinaryOperator<Integer> max= Integer::max;
		comsumer.accept(max.apply(7, 99));
	}

}
