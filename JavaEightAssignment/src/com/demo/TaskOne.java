package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TaskOne {

	public static void main(String[] args) {
		List<Items> items=new ArrayList<Items>();
		items.add(new Items(134,"Moto24",15000,"Mobiles"));
		items.add(new Items(157,"SpiderMan",50,"Books"));
		items.add(new Items(204,"Acer",70000,"Laptops"));
		items.add(new Items(210,"Iphone",45000,"Mobiles"));
		items.add(new Items(215,"Shirt",1500,"Shirts"));
				
		System.out.println("Mobile Category Items");
		items.stream().filter(c->c.getCategory().equals("Mobiles"))
		.forEach(System.out::println);
		System.out.println();
		System.out.println("Mobile Category Items with Price greater than 20000");
		items.stream().filter(c->c.getCategory().startsWith("M")&&
				c.price>20000)
		.forEach(System.out::println);
		System.out.println();
		/*System.out.println("Items other than Mobiles Catrgory");
		items.stream().filter(c->
				c.category!="Mobiles").forEach(System.out::println);*/
		System.out.println("Items of Laptop Catrgory");		
		items.stream().filter(c->
		c.category=="Laptops").forEach(System.out::println);		
	}
}
