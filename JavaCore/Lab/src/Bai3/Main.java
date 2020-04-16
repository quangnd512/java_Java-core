package Bai3;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void showMenu() {
		System.out.println("1. Add thong tin sach.");
		System.out.println("2. Hien thi thong tin sach.");
		System.out.println("3. Tim kiem sach theo Ma tai lieu");
		System.out.println("4. Xoa sach theo Ma tai lieu");
		System.out.println("5. Sua thong tin sach theo ma tai lieu");
		System.out.println("6. Sap xep sach theo ten");
		System.out.println("7. Sap xep sach theo so ban in");
		System.out.println("8. Luu thong tin vao file ThuVien.dat");
		System.out.println("9. Doc thong tin tu file ThuVien.dat");
		System.out.println("10. Thoat");
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		QuanLy ql = new QuanLy();
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			showMenu();
			System.out.println("Nhap lua chon: ");
			n = Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1:
				ql.addInfo();
				break;
				
			case 2:
				ql.displayInfo();
				break;

			case 3:
				ql.searchTaiLieu();
				break;

			case 4:
				ql.deleteTaiLieu();
				break;

			case 5:
				ql.editTaiLieu();
				break;

			case 6:
				ql.sortName();
				break;

			case 7:
				ql.sortSoBanIn();
				break;

			case 8:
				ql.saveThuVien();
				break;

			case 9:
				ql.readThuVien();
				break;

			case 10:
				System.out.println("Tam biet.!");
				break;

			default: System.out.println("Nhap sai. Xin moi nhap lai.!");
				break;
			}
		} while (n!=10);
		
	}

}
