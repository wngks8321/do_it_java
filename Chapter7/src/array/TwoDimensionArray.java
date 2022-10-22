package array;

public class TwoDimensionArray {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {4,5,6}};
		
		System.out.println(arr.length); //2
		System.out.println(arr[0].length); //3
		
		// 모든 값 출력 
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		// 221 페이지 연습문제 
		char[][] alphabets = new char[13][2];
		char alphabet = 97;
		for(int i = 0; i < alphabets.length; i++) {
			for(int j = 0; j < alphabets[i].length; j++) {
				alphabets[i][j] = alphabet;
				alphabet++;
				System.out.println(alphabets[i][j]);
			}
		}		

		
	}

}
