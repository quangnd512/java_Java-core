package File;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderVsFileWriter {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			int ch;
			fr = new FileReader("file-02.txt");
			fw = new FileWriter("file-02-cp.txt");
			while ((ch = fr.read()) != -1) {
				System.out.print((char)ch);
				fw.write(ch);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
