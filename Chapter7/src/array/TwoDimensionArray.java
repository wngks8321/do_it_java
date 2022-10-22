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
	}

}
