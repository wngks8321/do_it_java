package interfaceEx;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		// 타입상속, CompleteCalc 클래스가 Calc 라는 타입을 가지고 있음.
		// Calc 타입으로 선언했기 때문에 CompleteCalc에 있는 showInfo는 사용할 수 없음. 사용하려면 타입 다운캐스팅 해야함.
		Calc calc = new CompleteCalc(); 
		System.out.println(calc.add(num1, num2));
		
		CompleteCalc calc1 = new CompleteCalc(); 
		System.out.println(calc1.square(num1));
		
		calc.description();
		
		// static method 사용
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
	}

}
