package com.tnsif.daytwo;
import java.util.Scanner;

public class Executor {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer ID : ");
		int  id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer Name  : ");
		String name  = sc.nextLine();
		
		System.out.println("Enter Customer City  : ");
		String city = sc.nextLine()	;
		
//		Customer c  = new Customer();
//		
//		c.setCustomerId(id);
//		c.setName(name);
//		c.setCity(city);
//		System.out.println(c.getCustomerId());
//		System.out.println(c.getName());
//		System.out.println(c.getCity());
		Customer c2= new Customer(id,name,city);
		System.out.println(c2);
		
	}
	

}
