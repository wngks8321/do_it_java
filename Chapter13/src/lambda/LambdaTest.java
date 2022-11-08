package lambda;

interface PrintString{
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {

		// 변수에 바로 대입해서 사용하는 방법 
		PrintString lambdaPrint = str -> System.out.println(str);
		lambdaPrint.showString("test");
		
		// implements 된 내용 자체가 매개변수로 넘어가는 방법 
		showMyString(lambdaPrint);
		
		PrintString reStr = returnPrint();
		reStr.showString("hello");
	}
	
	// implements 된 내용 자체가 매개변수로 넘어가는 방법
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2");
	}
	
	// implements 된 내용 자체를 return 값으로 넘기는 방법 
	public static PrintString returnPrint() {
		return s -> System.out.println(s + " world");
	}

}
