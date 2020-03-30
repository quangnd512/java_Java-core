package Bai5_II;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		QuanLy ql = new QuanLy();
		do {
			System.out.println("\n1. Nhap thong tin khach thue");
			System.out.println("2. Hien thi thong tin khach thue");
			System.out.println("3. Tinh tien cho khach");
			System.out.println("4. Xoa thong tin khach thue");
			System.out.println("5. Thoat");
			
			System.out.print("Nhap lua chon: ");
			n = sc.nextInt();
				switch (n) {
				case 1:
					KhachSan ks = new KhachSan();
					ks.nhap();
					ql.add(ks);
					break;
				case 2: ql.hienThi(); break;
				case 3: 
					System.out.print("Nhap so CMT khach hang: ");
					sc.nextLine();
					String maSo = sc.next();
					ql.tienPhong(maSo);
					break;
				case 4: 
					System.out.print("Nhap so CMT khach hang: ");
					sc.nextLine();
					String soCMT = sc.next();
					ql.remove(soCMT);
					break;
				default: System.out.println("Cam on ban da tin dung"); break;
			}
		}while(n<5);
	}

}
