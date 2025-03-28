package com.reactive.programming.udemy.reactive.section6.composition;

public interface Function<T, R> {
	
	R apply(T t);
	
	default <V> Function<V,R> compose(Function<V, T> before) {
		
		return (V v) ->  apply(before.apply(v)) ;
		
	}

}
