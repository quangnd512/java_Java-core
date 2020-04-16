package Bai3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class QuanLy {
	private static final int Comparator = 0;
	List<ThuVien> listThuVien = new ArrayList<>();

	public QuanLy() {
		
	}
	
	//add
	public void addInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong tai lieu can them: ");
		int soLuong = Integer.parseInt(sc.nextLine());
		int n = 0;
		do {
			n++;
			System.out.println("Loai tai lieu can them: ");
			System.out.println("1. Sach");
			System.out.println("2. Bao");
			System.out.println("3. Tap chi");
			System.out.print("Nhap lua chon: ");
			int luaChon = Integer.parseInt(sc.nextLine());
			switch (luaChon) {
			case 1:
				ThuVien thuVien = new Sach();
				thuVien.input();
				listThuVien.add(thuVien);
				break;
				
			case 2:
				ThuVien thuVien2 = new Bao();
				thuVien2.input();
				listThuVien.add(thuVien2);
				break;

			case 3:
				ThuVien thuVien3 = new TapChi();
				thuVien3.input();
				listThuVien.add(thuVien3);
				break;

			default: System.out.println("Lua chon sai");
				break;
			}
		} while (n<soLuong);
		
	}
	
	//display
	public void displayInfo() {
		for (ThuVien thuVien : listThuVien) {
			thuVien.display();
		}
	}
	
	//search MaTaiLieu
	public void searchTaiLieu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma tai lieu can tim kiem: ");
		String name = sc.nextLine();
		for (int i = 0; i < listThuVien.size(); i++) {
			if (listThuVien.get(i).maTaiLieu.equals(name)) {
				listThuVien.get(i).display();
			}
		}
	}

	//Delete MaTaiLieu
	public void deleteTaiLieu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma tai lieu can xoa: ");
		String name = sc.nextLine();
		for (int i = 0; i < listThuVien.size(); i++) {
			if (listThuVien.get(i).maTaiLieu.equals(name)) {
				listThuVien.remove(i);
			}
		}
	}

	//Edit MaTaiLieu
	public void editTaiLieu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma tai lieu can sua: ");
		String name = sc.nextLine();
		for (int i = 0; i < listThuVien.size(); i++) {
			if (listThuVien.get(i).maTaiLieu.equals(name)) {
				listThuVien.get(i).edit();
			}
		}
	}

	//Sort Name
	public void sortName() {
		Collections.sort(listThuVien, new Comparator<ThuVien>() {

			@Override
			public int compare(ThuVien o1, ThuVien o2) {
				// TODO Auto-generated method stub
				int cmp = o1.getTenTaiLieu().compareToIgnoreCase(o2.getTenTaiLieu());
				if (cmp>0) {
					return 1;
				}
				return -1;
			}
		});
		for (int i = 0; i < listThuVien.size(); i++) {
			listThuVien.get(i).display();
		}
	}

	//Sort So ban in
	public void sortSoBanIn() {
		Collections.sort(listThuVien, new Comparator<ThuVien>() {

			@Override
			public int compare(ThuVien o1, ThuVien o2) {
				// TODO Auto-generated method stub
				if (o1.soBanIn>o2.soBanIn) {
					return -1;
				}
				return 1;
			}
		});
		for (int i = 0; i < listThuVien.size(); i++) {
			listThuVien.get(i).display();
		}
	}

	//Luu thuVien.dat
	public void saveThuVien() throws IOException {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("thuVien.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(listThuVien);
			System.out.println("Da tao file.!");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			fos.close();
			oos.close();
		}
	}
	
	//Read thuVien.dat
	public void readThuVien() throws IOException {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("thuVien.dat");
			ois = new ObjectInputStream(fis);
			listThuVien = (List<ThuVien>) ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			fis.close();
			ois.close();
		}
		for (int i = 0; i < listThuVien.size(); i++) {
			listThuVien.get(i).display();
		}
	}
}
