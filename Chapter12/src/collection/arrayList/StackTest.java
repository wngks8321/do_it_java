package collection.arrayList;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {

		int length = arrayStack.size();
		if(length == 0) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		
		return arrayStack.remove(length - 1);
	}
}

public class StackTest {

	public static void main(String[] args) {

		MyStack myStack = new MyStack();
		myStack.push("stack1");
		myStack.push("stack2");
		myStack.push("stack3");
		
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	}

}
