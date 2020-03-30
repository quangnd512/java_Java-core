package ThreadEx3;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void showMenu() {
		System.out.println("1. Nhap thong tin n chuyen bay");
		System.out.println("2. Luu thong tin vao file DuLieuBay.txt");
		System.out.println("3. Doc thong tin tu file DuLieuBay.txt va hien thi ra man hinh");
		System.out.println("4. Sap xep giam dan theo gia ve");
		System.out.println("5. In thong tin cac chuyen bay theo cac hang bay ra cac file");
		System.out.println("6. Thoat");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		QuanLy ql = new QuanLy();
		int n;
		do {
			showMenu();
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap lua chon: ");
			n = Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1:
				ql.addAir();
				break; 

			case 2:
				ql.saveAir(ql.vmb, "DuLieuBay.txt");
				break;

			case 3:
				ql.readAir(ql.vmb, "DuLieuBay.txt");
				break;

			case 4:
				ql.sortAir();
				break;

			case 5:
				ql.saveAirId();
				break;

			default:
				System.out.println("Nhap sai.!");
				break;
			}
		} while (n != 6);

	}

}
