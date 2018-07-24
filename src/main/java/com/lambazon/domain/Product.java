package com.lambazon.domain;

public class Product {
	
	private Integer id;
	private String name, description, details;
	private int quantity;
	private double price;
	private double inventoryPrice;

	public Product(int id, int quantity, double price, String name, String description, double inventory) {
		setId(id);
		setQuantity(quantity);
		setPrice(price);
		setName(name);
		setDescription(description);
		setInventoryPrice (inventory);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if getQuantity()>0 {quantity=0}
		if else {this.quantity = quantity};
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if getPrice()< 0 {price=0}
		if else getPrice()>1000 {price=1000}
		if else {this.price = price};

	}

	public double getInventoryPrice() {	return inventoryPrice; }

	public void setInventoryPrice (double inventoryPrice) {this.price = inventoryPrice; }
}
