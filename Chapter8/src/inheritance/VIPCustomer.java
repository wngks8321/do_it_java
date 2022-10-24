package inheritance;

public class VIPCustomer extends Customer {
	
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer(int customerID, String customerName) {
		// 2. Customer의 생성자가 customerID, customerName을 받고 있어서 VIPCustomer도 두개의 값을 받아서 super에 넘겨줌. 		
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer() 호출 ");
	}
	
	public int getAgentID() {
		return agentID;
	}
}
