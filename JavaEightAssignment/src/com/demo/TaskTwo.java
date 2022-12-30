package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskTwo {

	public static void main(String[] args) {
		List<Orders> orders=new ArrayList<Orders>();
		orders.add(new Orders(1,"delivered","12-Nov-2021","14-Nov-2021",204,"1"));
		orders.add(new Orders(2,"delivered","19-May-2022","24-May-2022",204,"4"));
		orders.add(new Orders(3,"delivered","31-Jul-2021","04-Aug-2021",210,"2"));
		orders.add(new Orders(4,"pending","29-Oct-2022","29-Oct-2022",204,"3"));
		orders.add(new Orders(5,"pending","30-Oct-2021","30-Oct-2021",134,"5"));

		List<Customer> customers=new ArrayList<Customer>();
		customers.add(new Customer("1","Tom","male","bangalore"));
		customers.add(new Customer("2","Mike","male","mumbai"));
		customers.add(new Customer("3","Steve","female","chennai"));
		customers.add(new Customer("4","Max","male","bangalore"));
		customers.add(new Customer("5","Alex","female","chennai"));
		System.out.println("Female Customer List");
		List<Customer> C=customers.stream().filter(c->c.gender.startsWith("f"))
				.collect(Collectors.toList());
		C.forEach(list->System.out.println(list));
		System.out.println("Female Customer Ordered Item List");
		orders.stream().filter(c->c.customer.equalsIgnoreCase("3"))
		.forEach(System.out::println);
		orders.stream().filter(c->c.customer.equalsIgnoreCase("3"))
		.forEach(System.out::println);
		
	}

}
