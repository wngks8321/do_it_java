package test;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날아다닙니다.");
	}	
}

public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		// 2. 1번의 코드 한줄을 호출했지만 결과는 3개가 나
		test.moveAnimal(new Human()); //사람이 두발로 걷습니다.
		test.moveAnimal(new Tiger()); // 호랑이가 네발로 뜁니다.
		test.moveAnimal(new Eagle()); //독수리가 하늘을 날아다닙니다.
		
		
	}

	public void moveAnimal(Animal animal) {
		// 1. 아래 animal.move() 코드 한줄로 결과가 다양하게 나타남.
		animal.move();
	}
}
