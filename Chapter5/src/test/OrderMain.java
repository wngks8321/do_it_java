package test;

import java.util.Date;

public class OrderMain {

	public static void main(String[] args) {
		Order order = new Order();
		
		/*
		int orderNumber;
		String userID;
		Date orderDate;
		String userName;
		String productNumber;
		String address;
		*/
		
		order.setOrderNumber(201803120001L);
		order.setUserID("abc123");
		order.setOrderDate("2018년 3월 12일");
		order.setUserName("홍길순");
		order.setProductNumber("PD0345-12");
		order.setAddress("서울시 영등포구 여의도동 20번지");

		System.out.println(order.getOrderNumber());
		System.out.println(order.getUserID());
		System.out.println(order.getOrderDate());
		System.out.println(order.getUserName());
		System.out.println(order.getProductNumber());
		System.out.println(order.getAddress());
	}

}
