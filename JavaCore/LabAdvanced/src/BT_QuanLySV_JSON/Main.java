package BT_QuanLySV_JSON;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import netscape.javascript.JSObject;

public class Main {

	static List<ClassRom> classList = new ArrayList<>();
	
	public static void showMenu() {
		System.out.println("1. Nhap thong tin sinh vien tu file json");
		System.out.println("2. Hien thi thong tin sinh vien");
		System.out.println("3. Luu thong tin moi lop hoc vao trong 1 file xml.obj");
		System.out.println("4. Thoat");
	}
	
	public static void input() {
		StringBuilder builder = new StringBuilder();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("xml.json");
			int ch;
			while ((ch = fis.read())!=-1) {
				builder.append((char)ch);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String source = builder.toString();
		JSONArray arr = new JSONArray(source);
		
		for (int i = 0; i < arr.length(); i++) {
			JSONObject obj = arr.getJSONObject(i);
			ClassRom classRom = new ClassRom();
			classRom.parse(obj);
			classList.add(classRom);
		}
	}

	
	
	public static void display() {
		for (ClassRom classRom : classList) {
			classRom.display();
		}
	}

	public static void save() {
		for (ClassRom classRom : classList) {
			String className = classRom.getClassName();
			
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			try {
				fos = new FileOutputStream(className+".obj");
				oos = new ObjectOutputStream(fos);
				oos.writeObject(classRom.getStudentList());
				System.out.println("Luu file thanh cong.!");
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					fos.close();
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int luaChon;
		do {
			showMenu();
			luaChon = Integer.parseInt(sc.nextLine());
			switch (luaChon) {
			case 1:
				input();
				break;

			case 2:
				display();
				break;

			case 3:
				save();
				break;

			case 4:
				System.out.println("Thoat.!");
				break;

			default:
				System.out.println("Khong chinh xac");
				break;
			}
		} while (luaChon!=4);

		
	}

}
