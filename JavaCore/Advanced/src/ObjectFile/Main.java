package ObjectFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		 // TODO Auto-generated method stub
		
		//Ghi du lieu vao file
		List<Student> list = new ArrayList<>();
		list.add(new Student("A", "Nam"));
		list.add(new Student("B", "Nu"));
		list.add(new Student("C", "Nam"));
		list.add(new Student("D", "Nam"));
		list.add(new Student("E", "Nu"));
		
		FileOutputStream fo = null;
		ObjectOutputStream oos = null;
		try {
			fo = new FileOutputStream("file-04.dat");
			oos = new ObjectOutputStream(fo);
			oos.writeObject(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (fo != null) {
				fo.close();
			}
			if (oos != null) {
				oos.close();
			}
		}
		
		
		//Doc du lieu
		FileInputStream fi = null;
		ObjectInputStream ois = null;
		try {
			fi = new FileInputStream("file-04.dat");
			ois = new ObjectInputStream(fi);
			list = (List<Student>) ois.readObject();
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(fi!=null) {
				fi.close();
			}
			if(ois!=null) {
				ois.close();
			}
		}
		
		//Hien thi list
		for (int i = 0; i < list.size(); i++) {
			list.get(i).display();
		}
		
		
	}

}
