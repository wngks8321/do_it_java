package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 기본생성자임,
	// 아래처럼 작성하지 않아도 자바 컴파일러가 알아서 디폴트 생성자를 추가해줌.
	// 클래스에 아무런 생성자가 없는 경우에는 생성해주지만 생성자가 있는 경우에는 생성해주지 않음.
	// 객체를 생성하면서 처음에 해야하는 일들을 구현하는 것.
	// public Student() {}
	
	// Student 객체가 생성될 때, id와 name을 전달받아서 생성하고 싶은 경우 아래와 같이 작성한다.
	// 아래와 같이 작성하는 경우 StudentTest.java 파일에서 new Student() 로 생성할 때, 무조건 id와 name을 추가해줘야함
	// 하지만 Student 클래스에서 디폴트생성자를 작성해준다면 id와 name을 추가하지 않아도 사용가능함. (= 13번째줄을 주석해제 한다면) 
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	
	// 메소드
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
