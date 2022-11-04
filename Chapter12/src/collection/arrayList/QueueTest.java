package collection.arrayList;

import java.util.ArrayList;

class MyQueue {
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int length = arrayQueue.size();
		if(length == 0) {
			System.out.println("큐가 비어있습니다.");
			return null;
		}
		
		return arrayQueue.remove(0);
	}
	
}

public class QueueTest {

	public static void main(String[] args) {

		
	}

}
