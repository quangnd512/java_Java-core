package Bai4;

import java.util.Scanner;

public class Main {

	public static void showMenu() {
		System.out.println("1. Add thong tin thi sinh.");
		System.out.println("2. Hien thi thong tin thi sinh");
		System.out.println("3. Sua thong tin thi sinh theo so bao danh");
		System.out.println("4. Xoa thong tin thi sinh theo so bao danh");
		System.out.println("5. Sap xep theo ten thi sinh");
		System.out.println("6. Sap xep theo tong diem tung khoi");
		System.out.println("7. Tim kiem theo so bao danh");
		System.out.println("8. Hien thi nhung thi sinh do DH cua tung khoi voi tong diem 3 mon la 18. Rieng khoi A mon Toan phai tren 7 diem");
		System.out.println("9. Luu thong tin sinh vien vao file sinhVien.dat");
		System.out.println("10. Doc thong tin sinh vien tu file sinhVien.dat");
		System.out.println("11. Thoat.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		QuanLy ql = new QuanLy();
		do {
			showMenu();
			System.out.print("Lua chon: ");
			n = Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1:
				ql.addSV();
				break;

			case 2:
				ql.displaySV();
				break;

			case 3:
				ql.edit();
				break;

			case 4:
				ql.detete();
				break;

			case 5:
				ql.sortName();
				break;

			case 6:
				ql.sortPoint();
				break;

			case 7:
				ql.search();
				break;

			case 8:
				ql.displaySVpass();
				break;

			case 9:
				ql.saveFileTS();
				break;

			case 10:
				ql.readFile();
				break;

			case 11:
				System.out.println("Thank you.!");
				break;

			default:
				System.out.println("Ban da nhap sai.!");
				break;
			}
		} while (n !=11);
	}

}
