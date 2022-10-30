package classEx;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();
		
		// 두가지 방법은 classEx.Person 이 있어야됨.
		Class pClass1 = person.getClass();
		Class pClass2 = Person.class;
		
		System.out.println(pClass1.getName());
		System.out.println(pClass2.getName());

		// forName의 파라미터 값의 이름을 가진 클래스가 있으면 로딩함.
		// forName은 위의 두가지 경우와 다르게 classEx.Person 이 없어도 됨.
		// 보통 try catch로 예외처리 해서 사용한다고함. 
		Class pClass3 = Class.forName("classEx.Person");
		System.out.println(pClass3.getName());
	}

}
