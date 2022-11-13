package stream.inputstream;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {

		FileReader fis = null;
		int i = 0;
		
		try {
			fis = new FileReader("input.txt");
			
			while( (i = fis.read()) != -1 ) {
				System.out.println((char)i);
			}
			
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
		} catch(IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		
		System.out.println("end");
	}

}
