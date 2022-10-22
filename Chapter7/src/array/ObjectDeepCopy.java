package array;

public class ObjectDeepCopy {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("책1", "저자1");
		bookArray1[1] = new Book("책2", "저자2");
		bookArray1[2] = new Book("책3", "저자3");
		
		// 깊은 복사
		// 1. 디폴트 생성자로 타겟 객체 배열 값에 생
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();  
		
		// 2. 반복문을 통해 타겟 객체 배열에 각각 getter에서 받아온 값을 setter를 통해 set해줌.
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		
		bookArray1[0].setBookName("책11");
		bookArray1[0].setAuthor("저자11");

		/*
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		*/
		
		// 향상된 for
		String[] strArr = {"Java", "Android", "C"};
		
		//기존에 사용하던 방법 
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		// 향상된 for문, strArr의 처음부터 끝까지 사용하는 경우에 사용함. (여기서는 String s 인데, 각 배열 타입에 맞게 선언하면 됨.)
		// String으로 선언된 s에 strArr의 값들이 들어감. s = strArr[i];
		for(String s : strArr) {
			System.out.println(s);
		}
		
	}

}
