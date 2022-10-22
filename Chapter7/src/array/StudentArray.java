package array;

public class StudentArray {

	public static void main(String[] args) {
		
		Student[] studentArray = new Student[3];
		
		studentArray[0] = new Student(1001, "James");
		studentArray[1] = new Student(1002, "Tomas");
		studentArray[2] = new Student(1003, "Edward");
		
		for(Student s : studentArray) {
			s.showStudentInfo();
		}
	}

}
