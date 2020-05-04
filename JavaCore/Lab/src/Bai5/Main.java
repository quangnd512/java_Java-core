package Bai5;

import java.util.Scanner;

public class Main {

	public static void showData() {
		System.out.println("1. Them ho gia dinh vao khu pho");
		System.out.println("2. Hien thi so ho gia dinh trong khu pho");
		System.out.println("3. Hien thi thong tin cac ho gia dinh");
		System.out.println("4. Sua thong tin ho gia dinh theo so nha.");
		System.out.println("5. Luu thong tin khu pho vao file KhuPho.obj");
		System.out.println("6. Doc thong tin tu file KhuPho.obj");
		System.out.println("7. Thoat");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		KhuPho kp = new KhuPho();
		do {
			showData();
			System.out.println("Lua chon: ");
			n = Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1:
				HoGiaDinh hgd = new HoGiaDinh();
				hgd.input();
				kp.addHGD(hgd);
				break;

			case 2:
				kp.displayNumberHDG();
				break;

			case 3:
				kp.displayHGD();
				break;

			case 4:
				kp.editHDG();
				break;

			case 5:
				kp.saveFile();
				break;

			case 6:
				kp.readFile();
				break;

			case 7:
				System.out.println("Thoat");
				break;

			default: System.out.println("Nhap sai.!");
				break;
			}
		} while (n!=7);
	}

}
