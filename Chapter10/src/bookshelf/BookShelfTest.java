package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("책1");
		shelfQueue.enQueue("책2");
		shelfQueue.enQueue("책3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
