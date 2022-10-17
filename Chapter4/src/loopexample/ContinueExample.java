package loopexample;

public class ContinueExample {
	
	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			// 홀수인 경우 아래 조건문 이후의 코드는 실행하지 않음.
			if(num % 2 == 1) {
				continue;
			}
			
			total += num;
		}
		
		System.out.println(total);
	}
	
}
