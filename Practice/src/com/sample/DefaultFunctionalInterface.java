package com.sample;

import java.util.function.Consumer;

public class DefaultFunctionalInterface {
	public static void greetUser(Consumer<String> g,String name) {
		g.accept(name);
	}
    public static void main(String args[]) {
    	Consumer<String> g=(name)->{
    		System.out.println("Welcome "+name);
    	};
    	String name="dhina";
    	greetUser(g,name);
    }
}
