package array;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("책1", "저자1");
		bookArray1[1] = new Book("책2", "저자2");
		bookArray1[2] = new Book("책3", "저자3");
		
		// 얕은 복사 
		// 1. bookArray1의 내용을 bookArray2에 복사한 것이 아님.
		// bookArray1에 들어있는 주소값을 bookArray2에 복사한 것.
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		// 2. bookArray1의 값 일부 수
		bookArray1[0].setBookName("책11");
		bookArray1[0].setAuthor("저자11");

		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		// 3. 1번으로 인해서 bookArray2는 bookArray1과 같은 주소값을 바라보고 있음.
		// 2번내용으로 인해서 bookArray2[0]의 값도 "책11"과 "저자11"로 바뀜.
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}

}
