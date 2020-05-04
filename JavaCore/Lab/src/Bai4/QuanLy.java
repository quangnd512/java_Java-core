package Bai4;

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
	List<ThiSinh> thiSinh = new ArrayList<>();
	List<KhoiA> listA = new ArrayList<>();
	List<KhoiB> listB = new ArrayList<>();
	List<KhoiC> listC = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public QuanLy() {
		super();
	}
	
	public void add(ThiSinh thiSinh) {
		this.thiSinh.add(thiSinh);
	}
	
	public void addA(ThiSinh thiSinh2) {
		this.listA.add((KhoiA) thiSinh2);
	}
	
	public void addB(ThiSinh thiSinh2) {
		this.listB.add((KhoiB) thiSinh2);
	}
	
	public void addC(ThiSinh thiSinh3) {
		this.listC.add((KhoiC) thiSinh3);
	}
	
	//add sinh vien
	public void addSV() {
		System.out.println("Nhap khoi thi: ");
		System.out.println("1. Khoi A");
		System.out.println("2. Khoi B");
		System.out.println("3. Khoi C");
		System.out.print("Lua chon: ");
		int luaChon = Integer.parseInt(sc.nextLine());
		switch (luaChon) {
		case 1:
			ThiSinh thiSinh = new KhoiA();
			thiSinh.input();
			add(thiSinh);
			addA(thiSinh);
			break;

		case 2:
			ThiSinh thiSinh2 = new KhoiB();
			thiSinh2.input();
			add(thiSinh2);
			addB(thiSinh2);
			break;

		case 3:
			ThiSinh thiSinh3 = new KhoiC();
			thiSinh3.input();
			add(thiSinh3);
			addC(thiSinh3);
			break;
		default:
			System.out.println("Nhap sai.!");
			break;
		}
	}
	
	//hien thi sinh vien
	public void displaySV() {
		System.out.println("Danh sach thi sinh");
		for (ThiSinh thiSinh2 : thiSinh) {
			thiSinh2.display();
		}
	}
	
	//Sua thong tin theo so bao danh
	public void edit() {
		System.out.println("Nhap so bao danh muon sua: ");
		String sbd = sc.nextLine();
		for (int i = 0; i < thiSinh.size(); i++) {
			if (thiSinh.get(i).getsBD().equals(sbd)) {
				thiSinh.get(i).edit();
			}
		}
	}
	
	//Xoa thong tin theo so bao danh
	public void detete() {
		System.out.println("Nhap so bao danh muon xoa: ");
		String sbd1 = sc.nextLine();
		for (ThiSinh thiSinh2 : new ArrayList<>(thiSinh)) {
			if (thiSinh2.getsBD().equals(sbd1)) {
				this.thiSinh.remove(thiSinh2);
			}
		}
	}
	
	//Sap xep theo ten
	public void sortName() {
		Collections.sort(thiSinh, new Comparator<ThiSinh>() {

			@Override
			public int compare(ThiSinh o1, ThiSinh o2) {
				// TODO Auto-generated method stub
				if (o1.getHoTen().compareTo(o2.getHoTen())>0) {
					return 1;
				}
				return -1;
			}
		});
		for (int i = 0; i < thiSinh.size(); i++) {
			this.thiSinh.get(i).display();
		}
	}
	
	//Sap xep theo tong diem tung khoi
	public void sortPoint() {
		System.out.println("Chon khoi can xem: ");
		System.out.println("1. Khoi A");
		System.out.println("2. Khoi B");
		System.out.println("3. Khoi C");
		System.out.print("Lua chon: ");
		int luaChon = Integer.parseInt(sc.nextLine());
		switch (luaChon) {
		case 1:
			Collections.sort(listA, new Comparator<KhoiA>() {

				@Override
				public int compare(KhoiA o1, KhoiA o2) {
					// TODO Auto-generated method stub
					if (o1.getTongA()>o2.getTongA()) {
						return -1;
					}
					return 1;
				}
			});
			for (int i = 0; i < listA.size(); i++) {
				this.listA.get(i).display();
			}
			break;

		case 2:
			Collections.sort(listB, new Comparator<KhoiB>() {

				@Override
				public int compare(KhoiB o1, KhoiB o2) {
					// TODO Auto-generated method stub
					if (o1.getTongB()>o2.getTongB()) {
						return -1;
					}
					return 1;
				}
			});
			for (int i = 0; i < listB.size(); i++) {
				this.listB.get(i).display();
			}
			break;

		case 3:
			Collections.sort(listC, new Comparator<KhoiC>() {

				@Override
				public int compare(KhoiC o1, KhoiC o2) {
					// TODO Auto-generated method stub
					if (o1.getTongC()>o2.getTongC()) {
						return -1;
					}
					return 1;
				}
			});
			for (int i = 0; i < listC.size(); i++) {
				this.listC.get(i).display();
			}
			break;
		default:
			System.out.println("Nhap sai.!");
			break;
		}
	}
	
	//Tim kiem theo so bao danh
	public void search() {
		System.out.println("Nhap so bao danh can tim kiem: ");
		String sbd2 = sc.nextLine();
		for (ThiSinh thiSinh2 : new ArrayList<>(thiSinh)) {
			if (thiSinh2.getsBD().equals(sbd2)) {
				thiSinh2.display();
			}
		}
	}
	
	//Hien thi sinh vien do dai hoc cua tung khoi
	public void displaySVpass() {
		System.out.println("Nhap khoi thi: ");
		System.out.println("1. Khoi A");
		System.out.println("2. Khoi B");
		System.out.println("3. Khoi C");
		System.out.print("Lua chon: ");
		int luaChon = Integer.parseInt(sc.nextLine());
		switch (luaChon) {
		case 1:
			for (KhoiA khoiA : listA) {
				if (khoiA.getTongA()>=18&&khoiA.getToan()>=7) {
					khoiA.display();
				}
			}
			break;

		case 2:
			for (KhoiB khoiB : listB) {
				if (khoiB.getTongB()>=18) {
					khoiB.display();
				}
			}
			break;

		case 3:
			for (KhoiC khoiC : listC) {
				if (khoiC.getTongC()>=18) {
					khoiC.display();
				}
			}
			break;
		default:
			System.out.println("Nhap sai.!");
			break;
		}
	}
	
	//Luu thong tin vao sinhVien.dat
	public void saveFile(String a, List<ThiSinh> thiSinh2) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(a);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(thiSinh2);
			System.out.println("Da ghi thanh cong.!");
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
	public void saveFileTS() {
		String a = "sinhVien.dat";
		saveFile(a, this.thiSinh);
	}
	
	//Doc thong tin cua sinhVien.dat
	public void readFile() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("sinhVien.dat");
			ois = new ObjectInputStream(fis);
			thiSinh = (List<ThiSinh>) ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (int i = 0; i < thiSinh.size(); i++) {
			this.thiSinh.get(i).display();
		}
	}
}
