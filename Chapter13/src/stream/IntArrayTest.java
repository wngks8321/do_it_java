package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		// 아래와 같이 사용은 불가능함.
		// 스트림은 한번 쓰고 없어짐. 
		/*
		IntStream stream = Arrays.stream(arr);
		int sum = stream.sum(); // 여기까진 가능 
		System.out.println(sum); 
		int count = (int)stream.count(); // 여기는 불가능 
		System.out.println(count);
		*/
	}

}
