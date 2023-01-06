package com.sample;

import java.util.List;
import java.util.stream.Collectors;

public class SequenceOfData {
	public static void main(String args[]) {
		List<String> superHeros=List.of("SpiderMan","SuperMan","Hulk","IronMan","HawkEye");
		
		List<String> list=
				superHeros.stream()
				.filter((n)->  n.endsWith("Man"))
				.filter((n)->  n.startsWith("s") || n.startsWith("S"))
				.map((n)-> n.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(list);
	}

}
