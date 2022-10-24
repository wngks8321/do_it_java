package arrayList;

public class Q3 {

	public static void main(String[] args) {
		int[] array = new int[5];
		int num = 1;
		int index = 0;
		int total = 0;
		
		for(int i = 0; i < 10; i++) {
			if(num > 0 && num%2 == 0) {
				array[index] = num;
				total += array[index];
				index++;
			}
			num++;
		}
		System.out.println(total);
	}

}
