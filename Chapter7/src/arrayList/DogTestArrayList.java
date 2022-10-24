package arrayList;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		
		dogs.add(new Dog("name1", "type1"));
		dogs.add(new Dog("name2", "type2"));
		dogs.add(new Dog("name3", "type3"));
		dogs.add(new Dog("name4", "type4"));
		dogs.add(new Dog("name5", "type5"));
		
		for(int i = 0; i < dogs.size(); i++) {
			System.out.println(dogs.get(i).showDogInfo());
		}
	}

}
