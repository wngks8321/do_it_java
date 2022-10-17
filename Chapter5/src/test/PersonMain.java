package test;

public class PersonMain {

	public static void main(String[] args) {
		Person personJames = new Person(40, "james");
		personJames.setMarried(true);
		personJames.setNumChildren(3);
		
		System.out.println(personJames.getAge());
		System.out.println(personJames.getName());
		System.out.println(personJames.isMarried());
		System.out.println(personJames.getNumChildren());
	}

}
