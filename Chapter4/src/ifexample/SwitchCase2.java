package ifexample;

public class SwitchCase2 {

	public static void main(String[] args) {
		int month = 10;
		int day;
		
		// 아래와 같이 같은 값인 경우에 case를 연달아작성할 수 있음.
		switch(month) {
			case 1: case 3: case 5:
				day = 31;
				break;
			case 2: 
				day = 28;
				break;
			case 4: case 6:
				day = 30;
				break;
				
			default:
				day = 0;
				break;
		}
	}

}
