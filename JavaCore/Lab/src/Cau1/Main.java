package Cau1;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		QuanLy ql = new QuanLy();
		do {
			System.out.println("1. Nhap vao N sinh vien");
			System.out.println("2. Hien thi thong tin sinh vien");
			System.out.println("3. Hien thi max va min theo diem trung binh");
			System.out.println("4. Tim kiem theo ma sinh vien");
			System.out.println("5. Sap xep ten sinh vien theo thu tu tu A-Z");
			System.out.println("6. Hien thi sinh vien duoc hoc bong va sap xep giam dan");
			System.out.println("7. Thoat");
			System.out.print("Nhap lua chon: ");
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.print("Nhap so sinh vien can them: ");
				int a = sc.nextInt();
				Studen[] ps = new Studen[a];
				for (int i = 0; i < ps.length; i++) {
					ps[i] = new Studen();
					ps[i].nhap();
					ql.add(ps[i]);
				}
				break;
			case 2:
				ql.hienThi();
				break;
			case 3:
				ql.diemTBmaxMin();
				break;
			case 4:
				System.out.print("Nhap ma sinh vien can tim: ");
				sc.nextLine();
				String search = sc.nextLine();
				ql.search(search);;
				break;
			case 5:
				ql.sapXepTenSV();
				break;
			case 6:
				ql.sapXepTenHB();
				break;
			case 7:
				System.out.println("Tam biet");
				break;
			default: System.err.println("Cam on da su dung chuong trinh.!");
				break;
			}
		}while(n<7);
	}

}
