package test;

import inheritance.Customer;
import inheritance.GoldCustomer;
import inheritance.VIPCustomer;

public class CustomerTest1 {

	public static void main(String[] args) {
		/*
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Lee");
		*/
		VIPCustomer customerKim = new VIPCustomer(10101, "Kim", 100);
		customerKim.setBonusPoint(1000);
		
		//System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		
		Customer customerGold = new GoldCustomer();
	}

}
