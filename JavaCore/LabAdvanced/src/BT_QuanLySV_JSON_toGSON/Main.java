package BT_QuanLySV_JSON_toGSON;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;


import com.google.gson.Gson;


public class Main {
	
	public static void showMenu() {
		System.out.println("1. Nhap thong tin sinh vien tu file json");
		System.out.println("2. Hien thi thong tin sinh vien");
		System.out.println("3. Luu thong tin moi lop hoc vao trong 1 file xml.obj");
		System.out.println("4. Thoat");
	}
	
	public static ClassRom [] input() {
		ClassRom[] classRoom;
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
		
		Gson gson = new Gson();
		classRoom = gson.fromJson(builder.toString(), ClassRom[].class);
		
		return classRoom;
	}

	public static void display(ClassRom[] classRoom) {
		if (classRoom==null) {
			return;
		}
		for (int i = 0; i < classRoom.length; i++) {
			classRoom[i].display();
		}
	}

	public static void save(ClassRom[] classRoom) {
		for (int i = 0; i < classRoom.length; i++) {
			ClassRom room = classRoom[i];
			
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			try {
				fos = new FileOutputStream(room.information.name+".dat");
				oos = new ObjectOutputStream(fos);
				oos.writeObject(oos);
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
		ClassRom[] classRoom = null;
		Scanner sc = new Scanner(System.in);
		int luaChon;
		do {
			showMenu();
			luaChon = Integer.parseInt(sc.nextLine());
			switch (luaChon) {
			case 1:
				classRoom = input();
				break;

			case 2:
				display(classRoom);
				break;

			case 3:
				save(classRoom);
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
