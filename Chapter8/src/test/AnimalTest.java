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
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날아다닙니다.");
	}	
	
	public void flying() {
		System.out.println("독수리가 날아다닙니다.");
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
		
		// 다운캐스팅을 위해서 형태를 체크하는 조건문 
		if(animal instanceof Human) {
			// moveAnimal의 매개면수로 들어온 Animal타입의 animal을 Human타입으로 다운캐스팅해서 human 변수에 대입. 
			Human human = (Human)animal;
			human.readBook();
		} else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		} else if(animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.flying();
		} else {
			System.out.println("지원되지 않는 기능입니다.");
		}
	}
}
