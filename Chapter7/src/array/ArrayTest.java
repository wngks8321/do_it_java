package array;

public class ArrayTest {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		int[] numbers2 = new int[] {0, 1, 2};
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
