package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		boolean a = set.add("aaa"); //true
		System.out.println(a);
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set);
		
		boolean b = set.add("aaa"); //false,왜냐면 중복 허용하지 않기때문에 
		System.out.println(b);
		
		System.out.println(set);
	}

}
