package Cau7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeopleMgr people = new PeopleMgr();
		Zone zone = new Zone();
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			showMenu();
			n = Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1:
				people.input();
				break;

			case 2:
				zone.input();
				break;
				
			case 3:
				zone.inputVehicle();
				break;
				
			case 4:
				zone.sort();
				break;
				
			case 5:
				zone.showInfo();
				break;

			case 6:
				System.err.print("Thoat chuong trinh.!");
				break;
			default: System.err.print("Nhap sai lua chon.!");
				break;
			}
			
		} while (n!=7);
	}
	public static void showMenu() {
		System.out.println("1. Nhap thong tin N nguoi");
		System.out.println("2. Nhap thong tin N Area -> Luu vao Zone");
		System.out.println("3. Nhap thong tin N Vehicle  va tu dong tim kiem khu vuc phu hop");
		System.out.println("4. Hien thi thong tin cac xe duoc so huu boi mot nguoi theo ten");
		System.out.println("5. Sap xep theo thu tu giam dan theo dien tich cua xe trong tung khu vuc");
		System.out.println("6. Su dung ket qua 5 hien thi tong tin xe co trong Zone do");
		System.out.println("7. Thoat");
		System.out.print("Lua chon: ");
	}

}
