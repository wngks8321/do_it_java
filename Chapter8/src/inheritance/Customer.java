package inheritance;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	double bonusRatio;
	
	/*
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() 호출 ");
	}
	*/
	
	// 1. 생성자를 사용하는 경우, 하위클래스에서도 변수를 받아서 super()에 매개변수로 전해주는 형태로 사용 (VIPCustomer로 이동)	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName; 
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;	
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
}
