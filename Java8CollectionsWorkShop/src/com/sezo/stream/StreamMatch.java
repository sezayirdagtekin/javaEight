package com.sezo.stream;

import java.util.stream.Stream;

public class StreamMatch {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("java", "Python", "Angular", "Vue.js", "Sring", "Apache Kafka");
		boolean b1 = stream.anyMatch(s -> s.contains("Angular"));
		System.out.println("any mathc for Angular:" + b1);
		
		boolean b2 = stream.noneMatch(s -> s.contains("Perl"));
		System.out.println("any mathc for Perl:" + b2);
		boolean b3 = stream.allMatch(s -> s.length()>3);
		System.out.println(":" + b3);


	}

}
