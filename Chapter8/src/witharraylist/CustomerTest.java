package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		 ArrayList<Customer> customerList = new ArrayList<Customer>();
		 
		 Customer customerLee = new Customer(10010, "이순신 ");
		 Customer customerKim = new Customer(10011, "김김김 ");
		 GoldCustomer customerKo = new GoldCustomer(10012, "고고고 ");
		 GoldCustomer customerWon = new GoldCustomer(10013, "원원원 ");
		 VIPCustomer customerVip = new VIPCustomer(10014, "VIP ", 100);
		 
		 customerList.add(customerLee);
		 customerList.add(customerKim);
		 customerList.add(customerKo);
		 customerList.add(customerWon);
		 customerList.add(customerVip);
		 
		 System.out.println("====== 고객정보 출력 ======");
		 for(Customer c : customerList) {
			 System.out.println(c.showCustomerInfo());
		 }
		 
		 System.out.println("====== 할인율과 보너스 포인트 결과 ======");
		 int price = 10000;
		 for(Customer c : customerList) {
			 int cost = c.calcPrice(price);
			 System.out.println(c.getCustomerName() + "님이 " + cost + "를 지불하셨습니다. ");
			 System.out.println(c.showCustomerInfo());
		 }
	}

}
