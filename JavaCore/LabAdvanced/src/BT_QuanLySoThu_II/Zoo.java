package BT_QuanLySoThu_II;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
	ArrayList<Chuong> danhSachChuong = new ArrayList<>();
	
	public void addChuong(Chuong chuong) {
		danhSachChuong.add(chuong);
	}
	
	public void deteleChuong(int maChuong) {
		for (Chuong chuong : danhSachChuong) {
			if (chuong.getMaChuong()==maChuong) {
				danhSachChuong.remove(chuong);
				break;
			}
		}
	}
	
	public void addAnimal() {
		Scanner sc = new Scanner(System.in);
		Chuong ch = new Chuong();
		System.out.println("Chon chuong con vat can them: ");
		for (int i = 0; i < danhSachChuong.size(); i++) {
			System.out.print(" : "+danhSachChuong.get(i).getMaChuong()+" : ");
		}
		int roomNow = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap so luong con vat can them: ");
		int animalNumber = Integer.parseInt(sc.nextLine());
		Animal [] animal = new Animal[animalNumber];
		for (int i = 0; i < animal.length; i++) {
			System.out.println("Nhap con vat muon them");
			System.out.println("1. Tiger");
			System.out.println("2. Dog");
			System.out.println("3. Car");
			System.out.println("Lua chon: ");
			int luaChon = Integer.parseInt(sc.nextLine());
			switch (luaChon) {
			case 1:
				animal[i] = new Tiger();
				animal[i].input();
				ch.addAnimal(animal[i]);
				break;

			case 2:
				animal[i] = new Dog();
				animal[i].input();
				ch.addAnimal(animal[i]);
				break;
				
			case 3:
				animal[i] = new Cat();
				animal[i].input();
				ch.addAnimal(animal[i]);
				break;

			default: System.out.println("Nhap sai.!");
				break;
			}
		}
	}
	
	public void display() {
		for (int i = 0; i < danhSachChuong.size(); i++) {
			danhSachChuong.get(i).display();
		}
	}
	
}