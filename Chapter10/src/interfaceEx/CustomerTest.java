package interfaceEx;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		customer.order();
		// buyer가 Buy타입이라서 Buy의 order가 불릴 것이라고 생각하는데, customer가 대입되었기 때문에 Customer의 order가 호출됨. (seller도 마찬가지)
		buyer.order();
		seller.order();
	}

}
