package thisEx;

class Person {
	String name;
	int age;
	
	// new Person(); 으로 생성할 때, 생성자 안에서 다른 생성자를 호출하는데 타입이 맞는 생성자로 알아서 호출됨.
 	public Person() {
 		// 생성자에서 다른 생성자를 호출하는 this
 		this("이름없음", 1); //해당 라인 이전에 어떤 statement도 작성할 수 없음. = 가장먼저 작성되어야함. (아직 Person의 다른 값들이 초기화 되지 않았기 때문에)
 	}
 	
 	public Person(String name, int age) {
 		this.name = name;
 		this.age = age;
 	}
 	
 	// this를 return 하는 경우에 데이터타입은 클래스
 	public Person returnSelf() {
 		return this;
 	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.name);
		System.out.println(p1.returnSelf());
	}

}
