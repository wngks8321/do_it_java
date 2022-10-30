package object;

class Student{
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	// equals()는 본질적으로 == 와 같지만아래 student 비교 시에는 이렇게 오버라이딩 해서 사용해야함.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(studentID == std.studentID) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// 보통 equals()를 재정의할때 사용한 값을 return해주면 됨. 
		return studentID;
	}
	
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		// 각각 생성되었기 때문에 메모리가 다른곳에 생성되어있음.
		System.out.println(str1 == str2);
		// 논리적으로 동일한지 비교, String 타입이기때문에 실제 문자열값을 비교한다고함.	
		System.out.println(str1.equals(str2));
		
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}

}
