package com.demo;

public class Items {
     
	   int id;
	   String name;
	   double price;
	   String category;
     
     public Items(int id, String name, double price, String category) {
 		
 		this.id = id;
 		this.name = name;
 		this.price = price;
 		this.category = category;
 	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
    
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	
}
