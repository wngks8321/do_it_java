package stream.decorator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100); // 4바이트
		System.out.println(rf.getFilePointer());
		
		rf.writeDouble(3.14); // 8바이트 
		System.out.println(rf.getFilePointer());
		
		rf.writeUTF("안녕하세요"); // 한글 하나당 3바이트를 사용, 맨뒤에 null이 들어가서 2바이트 들어감. 3 * 5 + 2
		System.out.println(rf.getFilePointer());
		
		// file pointer를 제일 앞으로 이동시켜야함.
		rf.seek(0);
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}
