package binary;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10; // 1바이트
		int num = bNum; // 4바이트
		// 위 경우에는 작은수에서 큰수로 가기때문에 묵시적 형변환이 일어남.
		
		System.out.println(num);
		
		long lNum = 10; // 10이라는 리터럴은 int로 상수풀에 저장되어있고 long은 8바이트라서 묵시적 형변환이 일어남
		float fNum = lNum; // lNum은 8바이트고 float는 4바이트지만 정수 -> 실수로 덜 정밀한 수에서 더 정밀한수라서 묵시적형변환이 일어남.
		
		System.out.println(fNum);
		
		double dNum = fNum + num; // 연산중에도 형변환이 일어남. (num이 실수가 됨.)
		System.out.println(dNum);
	}

}
