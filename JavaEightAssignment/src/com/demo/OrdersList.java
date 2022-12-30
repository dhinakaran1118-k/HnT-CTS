package com.demo;

import java.util.List;

public class OrdersList {
	
	private int id;
	private String status;
	private String orderDate;
	private String deliveryDate;
	private Items items;
	private Customer customer;
	
	public OrdersList(int id, String status, String orderDate, String deliveryDate, Items items,
			Customer customer) {
		super();
		this.id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.items = items;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "OrdersList [id=" + id + ", status=" + status + ", orderDate=" + orderDate + ", deliveryDate="
				+ deliveryDate + ", items=" + items + ", customer=" + customer + "]";
	}
	
	
}
