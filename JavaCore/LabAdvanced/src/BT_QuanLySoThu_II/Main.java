package BT_QuanLySoThu_II;

import java.util.Scanner;

public class Main {

	public static void showMenu() {
		System.out.println("1. Them chuong");
		System.out.println("2. Xoa chuong");
		System.out.println("3. Them con vat");
		System.out.println("4. Xoa con vat");
		System.out.println("5. Xem tat cac cac con vat");
		System.out.println("6. Thoat");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		Zoo zoo = new Zoo();
		do {
			showMenu();
			Chuong ch = new Chuong();
			System.out.println("Lua chon: ");
			n = Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1:
				ch.input();
				zoo.addChuong(ch);
				break;
			case 2:
				System.out.println("Nhap ma chuong can xoa: ");
				int maChuong = Integer.parseInt(sc.nextLine());
				zoo.deteleChuong(maChuong);
				break;
			case 3:
				zoo.addAnimal();
				break;
			case 4:
				System.out.println("Nhap ten dong vat can xoa: ");
				String nameAnimal = sc.nextLine();
				ch.deleteAnimal(nameAnimal);
				break;
			case 5:
				zoo.display();
				break;
			case 6:
				System.out.println("Cam on.!");
				break;

			default: System.out.println("Ban da nhap sai.!");
				break;
			}
		} while (n!=6);
	}
}
