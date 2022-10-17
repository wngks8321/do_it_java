package test;

public class Person {
	int age;
	String name;
	boolean isMarried;
	int numChildren;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public boolean isMarried() {
		return isMarried;
	}



	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}



	public int getNumChildren() {
		return numChildren;
	}



	public void setNumChildren(int numChildren) {
		this.numChildren = numChildren;
	}
}
