package com.jsp.beanfactory;

public class Pen {
	
	
	private String brand;
	private String color;
	private int price;
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	Pen(){
		System.out.println("Pen Object is created by Spring");
	}
	
	public void write() {
		System.out.println("Pen Write");
	}
}
