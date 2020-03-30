package File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Doc file
		FileInputStream fileInput = null;
		BufferedInputStream bf = null;
		try {
			fileInput = new FileInputStream("file-03.txt");
			bf = new BufferedInputStream(fileInput);
			int ch;
			while((ch=bf.read())!=-1) {
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fileInput.close();
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
