package arrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		
		// 향상된 for문 사용
		for(String s : list) {
			System.out.println(s);
		}
		
		// 직접 ArrayList의 메소드 사용시 
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}