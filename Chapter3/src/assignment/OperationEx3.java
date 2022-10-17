package assignment;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) || ((i = i+2) < 10);
		/*
		 * 위 코드에서 비교는 두가지를 함. num1, i
		 * 논리 연산자에 따라서 다르지만 앞의 결과가 true, false에 따라 뒤의 i는 대입이 안될수도 있음.
		 * */
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
