package text.file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TxtFile {

	public static void main(String[] args) {
		
		String TextFile = "I am creating new text file. ";
		byte [] buff = TextFile.getBytes();
		
		try {
			RandomAccessFile raf = new RandomAccessFile("TextFile.txt","rw");
			raf.write(buff);
			raf.write(123);
			raf.seek(7);
			System.out.println("The character is:  "+ (char)raf.read());
			raf.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Nuevo");

	}

}
