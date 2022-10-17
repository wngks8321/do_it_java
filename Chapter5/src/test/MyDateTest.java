package test;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 2, 2022);
		MyDate date2 = new MyDate(2, 10, 2022);
		
		System.out.println(date1.isValid());
		System.out.println(date2.isValid());
	}

}
