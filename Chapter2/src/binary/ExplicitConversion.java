package binary;

public class ExplicitConversion {

	public static void main(String[] args) {
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14;
		iNum = (int)dNum; //int는 소수점을 표현할 수 없기때문에 3이 됨.
		
		System.out.println(iNum);
		
		float fNum = 0.9F;
		int num1 = (int)dNum + (int)fNum; // 3 + 0 = 3
		int num2 = (int)(dNum + fNum); // 3.14 + 0.9 를 하고 int로 형변환 4.23 = 4
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
