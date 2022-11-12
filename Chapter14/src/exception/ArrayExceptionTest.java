package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5};
		// try안에 있는 반복문이 진행되는 동안 오류가 발생한다면 catch로 이동.
		// 그런데 발생한 오류가 catch의 매개변수로 들어가 있는 항목이라면 안에 있는 코드 진행.
		/*
		 * 아래에서는 for문을 돌리는 동안 오류가 발생한다면 catch로 넘어가고  
		 * 오류가 ArrayindexOutOfBoundsException 이므로 e를 출력함.
		 * */
		// finally는 try가 수행되면 무조건 수행되는 구문임. 
		// catch에서 return 을 하더라도 finally는 무조건 수행이 되서 "finally"가 출력됨.
		try {
			for(int i=0; i<=5; i++) {
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			return;
		} finally {
			System.out.println("finally");
		}
		System.out.println("end");
		
		
	}

}
