package stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 데이터가 외부로 나가는 것일 때는 Serializable을 implements 해야함. = 직렬화가 가능하다.
// Externalizable은 쓰고 내보낼 때의 동작을 오버라이딩 해야함.
class Person implements Serializable {
	private static final long serialVersionUID = 3670827529889526333L;
	String name;
	// transient 는 직렬화 할 때, 해당 멤버변수를 저장하지 않겠다는 뜻.
 	transient String title;
 	
	
	public Person() {
		
	}
	
	public Person(String name, String title) {
		this.name = name;
		this.title = title;
	}
	
	public String toString() {
		return name + ", " + title;
	}
}

public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person personLee = new Person("Lee", "Manager");
		try( FileOutputStream fos = new FileOutputStream("serial.dat"); 
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(personLee);
		} catch(IOException e) {
			System.out.println(e);
		}
		
		
		try( FileInputStream fis = new FileInputStream("serial.dat"); 
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Object obj = ois.readObject();
			if( obj instanceof Person ) {
				Person p = (Person)obj;
				System.out.println(p);
			}
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
