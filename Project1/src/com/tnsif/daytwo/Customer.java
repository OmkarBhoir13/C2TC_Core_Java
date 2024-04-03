package com.tnsif.daytwo;

public class Customer {
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int customerId;
	private String name;
	private String city;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	

	public String getCity() {
		return city;
	}

	public Customer(int customerId, String name, String city) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.city = city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", city=" + city + "]";
	}

	

//	public static void main(String args[])
//	{
//		Customer obj= new Customer();
//		obj.setName("Omkar");
//		System.out.println(obj.getName());
//	}
}
