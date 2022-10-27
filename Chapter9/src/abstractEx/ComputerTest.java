package abstractEx;

public class ComputerTest {

	public static void main(String[] args) {
		// Computer는 추상 클래스라서 인스턴스화 하지 못함.
//		Computer c1 = new Computer();
		// DeskTop은 추상 클래스를 상속받은 하위 클래스이고, 추상클래스가 아니므로 선언가능.
		// 상위 추상 클래스인 Computer로 업캐스팅 가
		Computer c2 = new DeskTop();
		// NoteBook도 추상 클래스라서 인스턴스화 하지 못함.
//		Computer c3 = new NoteBook();
		// MyNoteBook은 Computer 타입, NoteBook 타입으로 업캐스팅 가능.
		NoteBook c4 = new MyNoteBook();
		
		c2.display();
		c4.display();
	}

}
