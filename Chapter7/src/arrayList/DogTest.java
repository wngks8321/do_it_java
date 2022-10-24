package arrayList;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[5];
		
		dogs[0] = new Dog("name1", "type1");
		dogs[1] = new Dog("name2", "type2");
		dogs[2] = new Dog("name3", "type3");
		dogs[3] = new Dog("name4", "type4");
		dogs[4] = new Dog("name5", "type5");
		
		for(int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
		
		for(Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}
	}

}
