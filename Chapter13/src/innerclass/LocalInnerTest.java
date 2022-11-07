package innerclass;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("runnable");
		}
	};
	
	public Runnable getRunnable(int i) {
		
		int localNum = 100;
		//지역 내부 클래스
		/*
		class MyRunnable implements Runnable {

			@Override
			public void run() {
				// 아래는 안됨. 
				//메서드의 로컬변수와 매개변수는 스택에 자리잡고, 메서드 호출이 끝나면 없어짐. 
				// getRunnable()이 호출이 끝나서 getRunnable의 로컬변수와 매개변수가 스택에서 사라질 수 있어서 컨트롤은 불가능함.
//				localNum += 100;
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
		}
		
		return new MyRunnable();
		*/
		//익명 내부 클래스
		return new Runnable() {
			@Override
			public void run() {
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
		};
	}
}
public class LocalInnerTest {

	public static void main(String[] args) {

		Outer outer = new Outer();
		outer.getRunnable(20).run();
		
		outer.runnable.run();
	}

}
