package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamVsFileOutputStream {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		FileInputStream fileInput = null;
		FileOutputStream fileOutput = null; //Ham copy
		try {
			fileInput = new FileInputStream("file-01.txt");
			fileOutput = new FileOutputStream("file-01-cp.txt"); //Ham copy
			int ch;
			while ((ch = fileInput.read()) != - 1) {
				System.out.print((char)ch);
				fileOutput.write(ch);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fileInput.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fileOutput.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}