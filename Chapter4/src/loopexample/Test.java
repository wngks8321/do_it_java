package loopexample;

public class Test {

	public static void main(String[] args) {
		int i = 1;
		while(true) {
			if(i%2 != 0) {
				System.out.println(i);
			}
			i++;
			if(i > 7) {
				break;
			}
		}
	}

}