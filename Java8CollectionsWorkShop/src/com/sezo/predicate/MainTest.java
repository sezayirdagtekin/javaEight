package com.sezo.predicate;

public class MainTest {

	public static void main(String[] args) {

		MyPredicate<String> p1 = s -> s.length() > 5;
		MyPredicate<String> p2 = s -> s.length() < 10;
		
		boolean b1 = p1.check("sezayir");
		System.out.println(b1);
		
		MyPredicate<String> p3=p1.and(p2);
		System.out.println(p3.check("Sezayir Dagtekin"));
		
		MyPredicate<String> p4=p1.or(p2);
		System.out.println(p4.check("Sezayir Dagtekin"));
		
		MyPredicate<String> p5=MyPredicate.isEqualTo("Yes");
		System.out.println(p5.check("No"));
		System.out.println(p5.check("Yes"));
		
		MyPredicate<Integer> p6=MyPredicate.isEqualTo(1);
		System.out.println(p6.check(1));
		
		
	}

}
