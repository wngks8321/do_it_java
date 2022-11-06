package treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		return str1.compareTo(str2) * -1;
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {

		// 기존에 있는 정렬방식을 바꾸어 쓸 때, Comparator를 사용한다.
		// 매개변수에 new MyCompare()를 사용한 것 = 비교방식을 MyCompare를 사용한다는 뜻.  
		TreeSet<String> tree = new TreeSet<String>(new MyCompare());
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		
		System.out.println(tree);
	}

}
