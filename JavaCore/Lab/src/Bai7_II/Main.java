 package Bai7_II;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		QuanLy ql = new QuanLy();
		do {
			System.out.println("\n1. Nhap thong tin giao vien");
			System.out.println("2. Hien thi thong tin giao vien");
			System.out.println("3. Tien luong giao vien");
			System.out.println("4. Xoa giao vien");
			System.out.println("5. Thoat");
			
			System.out.print("Nhap lua chon: ");
			n = sc.nextInt();
				switch (n) {
				case 1:
					CBGV cb = new CBGV();
					cb.nhap();
					ql.add(cb);
					break;
				case 2: ql.hienThi(); break;
				case 3:
					System.out.print("Nhap ma so giao vien: ");
					sc.nextLine();
					String maSoGV = sc.nextLine();
					ql.thucLinh(maSoGV); break;
				case 4: 
					System.out.print("Nhap ma so giao vien: ");
					sc.nextLine();
					String maSo = sc.next();
					ql.remove(maSo); break;
				default: System.out.println("Cam on ban da tin dung"); break;
			}
		}while(n!=5);
	}

}
