package lambda;

public class TestMyNumber {

	public static void main(String[] args) {

		MyNumber maxNum = (x, y) -> (x >= y)? x : y;
		int max = maxNum.getMaxNumber(10, 20);
		
		System.out.println(max);
		
		// 람다식으로 작성하면 아래와 같은 익명 클래스가 생성된다고함.
		/*
		MyNumber aaa = new MyNumber() {
			
			@Override
			public int getMaxNumber(int num1, int num2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		*/
	}

}
