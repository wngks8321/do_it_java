package singleton;

public class Car {
	private static int serialNumber = 10000;
	int carNumber;
	
	public Car() {
		serialNumber += 1;
		carNumber = serialNumber; 
	}
	
	public int getCarNum() {
		return carNumber;
	}
}
