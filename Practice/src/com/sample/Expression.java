package com.sample;

@FunctionalInterface
interface Greete {
	public void greete(String name);
	public String toString();
}

public class Expression {
	public static void greetUser(Greete g,String name) {
		g.greete(name);
	}
	public static void main(String args[]) {
		
		Greete g=(name)->{
			System.out.println("Welcom "+name);
		};
		String name="dhina";
		greetUser(g,name);
	}

}
