package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TaskThree {

	public static void main(String[] args) {
		List<OrdersList> orderlist = Arrays.asList(
		new OrdersList(1, "delivered", "12-Nov-2021", "14-Nov-2021",
		new Items(134,"Moto24",15000,"Mobiles"), 
		new Customer("1", "Tom", "male", "bangalore")),
		
		new OrdersList(2,"delivered","19-May-2022","24-May-2022",
		new Items(157,"SpiderMan",50,"Books"), 
		new Customer("2","Mike","male","mumbai")),
		
		new OrdersList(3,"delivered","31-Jul-2021","04-Aug-2021",
		new Items(204,"Acer",70000,"Laptops"), 
		new Customer("3","Rachel","female","chennai")),
		
		new OrdersList(4,"pending","29-Oct-2022","29-Oct-2022",
		new Items(210,"Iphone",45000,"Mobiles"), 
		new Customer("4","Max","male","bangalore")),
		
		new OrdersList(5,"pending","30-Oct-2021","30-Oct-2021",
		new Items(215, "Shirt", 1500, "Shirts"), 
		new Customer("5","Scarlet","female","chennai"))
		);

		//orderlist.forEach(list -> System.out.println(list));
		
		Consumer<List<OrdersList>> orders=
				listoforder->{
					listoforder.forEach(
					lists->{
					if(lists.getCustomer().getGender().equals("female")) {
						System.out.println(lists.getItems()+" Orders Id: "
					+lists.getId()+" Status: "+lists.getStatus()+" "+lists.getCustomer());
					}
					}							);	
				};
		System.out.println("female Customer Orders");		
		femaleCustomerOrders(orders,orderlist);
		
		Consumer<List<OrdersList>> orders1=
				listoforder->{
					listoforder.forEach(
					lists->{
					if(lists.getItems().getCategory()!="Mobiles") {
						System.out.println(
				"Order Id:"	+ lists.getId() + " Order Status: "	+ lists.getStatus()
				+" "+lists.getItems()+" "+lists.getCustomer());
					}
					}							);	
		};
		
		System.out.println("orders Without Mpbile Category");
		ordersWithoutMpbileCategory(orders1,orderlist);
		
		System.out.println("orders betweeen 1-jan-2022 and 31-oct-2022");
		orderlist.stream().filter(list->list.getOrderDate().endsWith("2022"))
		.forEach(System.out::println);
			
}

	private static void ordersWithoutMpbileCategory(Consumer<List<OrdersList>> orders1, List<OrdersList> orderlist) {
		// TODO Auto-generated method stub
		orders1.accept(orderlist);
	}

	private static void femaleCustomerOrders(Consumer<List<OrdersList>> orders, List<OrdersList> orderlist) {
		// TODO Auto-generated method stub
		orders.accept(orderlist);
	}

}
