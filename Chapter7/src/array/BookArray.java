package array;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		library[0] = new Book("책1", "저자1");
		library[1] = new Book("책2", "저자2");
		library[2] = new Book("책3", "저자3");
		library[3] = new Book("책4", "저자4");
		library[4] = new Book("책5", "저자5");

		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
	}

}
