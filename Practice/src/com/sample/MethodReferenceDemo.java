package com.sample;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class Calculator{
	public static void addition(int a,int b) {
		System.out.println(a+b);
	}
	
	public int multiply(int a,int b) {
		return a*b;
	}
}

public class MethodReferenceDemo {
	public static void main(String args[]) {
		Calculator calc=new Calculator();
		BiConsumer<Integer,Integer> addition=Calculator::addition;
		addition.accept(1, 1);
		BiFunction<Integer,Integer,Integer> multiply=calc::multiply;
		System.out.println(multiply.apply(5, 5));
	}

}
