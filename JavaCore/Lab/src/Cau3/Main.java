package Cau3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		ManagerCat mc = new ManagerCat();
		ColorManager color = new ColorManager();
		do {
			System.out.println("\n0. Nhap danh sach ma mau");
			System.out.println("1. Nhap thong tin N con meo"); 
			System.out.println("2. Hien thi tat ca so meo");
			System.out.println("3. Sap xep danh sach theo mau");
			System.out.println("4. Tim kiem thong tin theo loai");
			System.out.println("5. Sap xep theo bang mau");
			System.out.println("6. Thoat");
			System.out.print("Nhap lua chon: ");
			n = sc.nextInt();
			switch (n) {
			case 0:
				color.input();
				break;
			case 1:
				mc.add(color);
				break;
			case 2:
				mc.hienThi();
				break;
			case 3:
				mc.soft();
				break;
			case 4:
				mc.find();
				break;
			case 5:
				mc.sortByTableColor();
				break;
			case 6:
				System.out.println("Tam biet");
				break;
			default: System.err.println("Nhap sai.!");
				break;
			}
		}while(n<6);
	}

}
