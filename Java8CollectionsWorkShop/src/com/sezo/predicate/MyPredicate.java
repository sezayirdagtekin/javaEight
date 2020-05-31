package com.sezo.predicate;


@FunctionalInterface
public interface MyPredicate<T> {

	public boolean check(T t);

	public default MyPredicate<T> and(MyPredicate<T> other) {
		return t -> check(t) && other.check(t);
	}

	public default MyPredicate<T> or(MyPredicate<T> other) {
		return t -> check(t) || other.check(t);

	}

	public static <U> MyPredicate<U> isEqualTo(U u) {
		return  s-> s.equals(u);
	}

}
