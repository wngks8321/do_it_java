package staticEx;

public class Student3 {
	static int serialNum = 0;
	int numCard;
	
	public Student3() {
		serialNum += 100;
		numCard = serialNum;
	}
}
