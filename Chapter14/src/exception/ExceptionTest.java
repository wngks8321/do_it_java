package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {

		
		
		/*
		 * try-catch-finally
		FileInputStream fis = null;  
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("finally");
		}
		System.out.println("end");
		*/
		
		// try-with-resources 문 
		// try에 바로 리소스 선언을 넣어버리고 catch에서는 IOException 으로 처리함. 
		try (FileInputStream fis = new FileInputStream("a.txt")){
			
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
