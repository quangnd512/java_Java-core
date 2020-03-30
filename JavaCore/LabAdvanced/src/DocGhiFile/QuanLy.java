package DocGhiFile;

import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QuanLy {
	List<Student> listStudent;

	public QuanLy() {
		this.listStudent = new ArrayList<>();
	};
	
	//Add
	public void add(Student student2) {
		listStudent.add(student2);
	}
	
	//Edit
	public void editSt() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap id sinh vien muon sua: ");
		String idSt = sc.nextLine();
		for (int i = 0; i < listStudent.size(); i++) {
			if(listStudent.get(i).getId().equalsIgnoreCase(idSt)) {
				listStudent.get(i).edit();
			}
		}
	}
	
	//Show
	public void show() {
		for (Student student : listStudent) {
			student.display();
		}
	}
	
	//Delete
	public void detele() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap id sinh vien: ");
		String idStudent = sc.nextLine();
		for (int i = 0; i < listStudent.size(); i++) {
			if (listStudent.get(i).getId().equalsIgnoreCase(idStudent)) {
				listStudent.remove(listStudent.get(i));
			}
		}
	}
	
	
	//Sort int
	public void sortStGpa() {
		Collections.sort(listStudent, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if (o1.getGpa()>o2.getGpa()) {
					return -1;
				}
				return 1;
			}
		});
		for (int i = 0; i < listStudent.size(); i++) {
			listStudent.get(i).display();
		}
	}
	
	
	//Sort String
	public void sortStName() {
		Collections.sort(listStudent, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				int cmp = o1.getName().compareToIgnoreCase(o2.getName());
				if (cmp>0) {
					return 1;
				}
				return -1;
			}
		});
		for (int i = 0; i < listStudent.size(); i++) {
			listStudent.get(i).display();
		}
	}
	
	//Write file student.obj
	public void writeSt() throws IOException {
		FileOutputStream fo = null;
		ObjectOutputStream oos = null;
		try {
			fo = new FileOutputStream("student.obj");
			oos = new ObjectOutputStream(fo);
			oos.writeObject(listStudent);
			System.out.print("Da tao file thanh cong. ");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}finally {
			fo.close();
			oos.close();
		}
	}
	
	//Read file student.obj
	public void readSt() throws IOException {
		FileInputStream fi = null;
		ObjectInputStream ois = null;
		try {
			fi = new FileInputStream("student.obj");
			ois = new ObjectInputStream(fi);
			listStudent = (List<Student>) ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			fi.close();
			ois.close();
		}
		for (int i = 0; i < listStudent.size(); i++) {
			listStudent.get(i).display();
		}
	}
	
	
}
