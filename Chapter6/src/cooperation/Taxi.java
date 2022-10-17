package cooperation;

public class Taxi {
	int taxiNumber;
	int passengerCount;
	int money;
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(taxiNumber + "택시의 승객수는 " + passengerCount + "명이고, 수입은 " + money);
	}
}
