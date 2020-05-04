package Bai5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhuPho {
	List<HoGiaDinh> listKhuPho = new ArrayList<>();

	public KhuPho() {
		
	}
	
	//them ho gia dinh
	public void addHGD(HoGiaDinh hoGiaDinh) {
		this.listKhuPho.add(hoGiaDinh);
	}
	
	//Hien so ho gia dinh trong khu pho
	public void displayNumberHDG() {
		System.out.println("So ho gia dinh trong khu pho: "+listKhuPho.size());
	}
	
	
	//Hien thi thong tin cac ho gia dinh
	public void displayHGD() {
		for (HoGiaDinh hoGiaDinh : listKhuPho) {
			hoGiaDinh.display();
		}
	}
	
	//Sua thong tin ho gia dinh
	public void editHDG() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nha can sua: ");
		String soNha = sc.nextLine();
		for (HoGiaDinh hoGiaDinh : listKhuPho) {
			if (hoGiaDinh.getSoNha().equals(soNha)) {
				hoGiaDinh.edit();
			}
		}
	}
	
	//Luu thong timn khu pho vao KhuPho.obj
	public void saveFile() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("KhuPho.obj");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(listKhuPho);
			System.out.println("Da luu thanh cong.!");
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
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
	
	//Doc thong tin o file KhuPho.obj
	public void readFile() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("KhuPho.obj");
			ois = new ObjectInputStream(fis);
			listKhuPho = (List<HoGiaDinh>) ois.readObject();
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
		for (HoGiaDinh hoGiaDinh : listKhuPho) {
			hoGiaDinh.display();
		}
	}
}
