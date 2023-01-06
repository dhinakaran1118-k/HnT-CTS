package com.demo;

import java.util.List;
import java.util.function.Consumer;

public class TestOne {
	public static void main(String args[]) {
		List<String> superHeros=List.of("SpiderMan","SuperMan","Hulk","IronMan","HawkEye");
		//System.out.println(superHeros);
	Consumer<List<String>>	consumer= (list)->{	
			list.forEach((sh)->
			{
				if(sh.endsWith("Man"))
				System.out.println(sh);
			}
			);
	};
	doTask(consumer,superHeros);
}
	private static void doTask(Consumer<List<String>>	consumer,List<String> superHeros) {
		consumer.accept(superHeros);
	}
}