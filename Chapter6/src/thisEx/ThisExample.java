package thisEx;

class BirthDay {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {

	public static void main(String[] args) {
		BirthDay b1 = new BirthDay();
		BirthDay b2 = new BirthDay();
		
		b1.printThis();
		b2.printThis();
	}

}
