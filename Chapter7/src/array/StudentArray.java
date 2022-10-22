package array;

import java.util.ArrayList;

public class StudentArray {

	public static void main(String[] args) {
		
		Student[] studentArray = new Student[3];
		ArrayList<Student> studentArray1 = new ArrayList<Student>();
		
		studentArray[0] = new Student(1001, "James");
		studentArray[1] = new Student(1002, "Tomas");
		studentArray[2] = new Student(1003, "Edward");
		
		studentArray1.add(new Student(1001, "James"));
		studentArray1.add(new Student(1002, "Tomas"));
		studentArray1.add(new Student(1003, "Edward"));
		
		for(Student s : studentArray) {
			s.showStudentInfo();
		}
		
		System.out.println("====================");
		for(int i = 0; i < studentArray1.size(); i++) {
			studentArray1.get(i).showStudentInfo();
		}
		
		
	}

}
