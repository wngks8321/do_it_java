package test;

import inheritance.Customer;
import inheritance.VIPCustomer;

public class OverridingTest {

	public static void main(String[] args) {
		/*
		Customer customerLee = new Customer(100010, "LEE");
		customerLee.calcPrice(10000);
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(100011, "KIM", 100);
		customerKim.calcPrice(10000);
		System.out.println(customerKim.showCustomerInfo());
		*/
		
		// 형태는 Customer이지만 인스턴스인 VIPCustomer의 calcPrice 메서드가호출됨.
		Customer customerWho = new VIPCustomer(100012, "Who", 101);
		int price = customerWho.calcPrice(10000); 
		System.out.println(price + customerWho.showCustomerInfo());
	}

}
