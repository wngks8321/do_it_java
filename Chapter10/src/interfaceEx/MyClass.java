package interfaceEx;

// MyInterface 가 상속받은 X, Y interface의 메서드도 구현해야함.
public class MyClass implements MyInterface {

	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");		
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");		
	}

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		X xClass = myClass;
		xClass.x();
	}
}
