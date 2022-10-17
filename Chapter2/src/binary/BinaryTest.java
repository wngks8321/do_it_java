package binary;

public class BinaryTest {

	public static void main(String[] args) {
		int num = 10;
		int bNum = 0B1010; //0B 가 앞에있으면 2진수 
		int oNum = 012; //0이 앞에 있으면 8진수
		int hNum = 0XA; //0X가 앞에 있으면 16진수
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
	}

}
