package lambda;

@FunctionalInterface
public interface MyNumber {

	// 함수형 interface 인 경우에는 메시드를 하나만 작성해야함.
	int getMaxNumber(int num1, int num2);
	// 아래 코드까지 작성할 경우 TestMyNumber.java 파일에서 MyNumber 형으로 선언할 때, 어떤 메서드의 매개변수인지 알 수 없음.
	//	int testNumber(int x, int y);
	
}
