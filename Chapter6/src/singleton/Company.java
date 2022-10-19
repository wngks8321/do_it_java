package singleton;

public class Company {
	
	// instance는 하나만 이 클래스 내부에서 하나만 선언되어 있음.
	// private기 떄문에 외부에서 사용이 불가능함. 그래서 메소드를 하나 만들어줌.
	private static Company instance = new Company();
	
	private Company() {}
	
	// 위에서 생성된 instance를 외부에서 가져다 사용할 수 있음. 아래 getter를 통해
	public static Company getInstance() {
		// 혹시나 instance가 null인 경우를 대응하는 방어코드
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
