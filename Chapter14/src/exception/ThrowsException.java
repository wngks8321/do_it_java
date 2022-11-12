package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) {

		ThrowsException ex = new ThrowsException();
		try {
			ex.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			// Exception 이 최상위 클래스라서 어떤 예외가 들어올지 모르는 상황에서는 위와 같이 Exception으로 사용해도됨.
			// 주의점은 catch문의 제일 위에 넣으면 나머지 catch문들의 Exception 들은 무용지물이 됨. 
			// 그래서 Exception으로 바로 사용하는 경우에는 제일 마지막에 사용해야함. 
			System.out.println(e);
		}
		
		System.out.println("end");
	}

}
