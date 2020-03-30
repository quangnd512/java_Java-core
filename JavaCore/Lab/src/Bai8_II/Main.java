package Bai8_II;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		QuanLy ql = new QuanLy();
		do {
			System.out.println("\n1. Nhap thong tin muon sach");
			System.out.println("2. Hien thi thong tin nhung sach da muon");
			System.out.println("3. Xoa thong tin muon sach");
			System.out.println("4. Thoat");
			
			System.out.print("Nhap lua chon: ");
			n = sc.nextInt();
				switch (n) {
				case 1:
					TheMuon tm = new TheMuon();
					tm.nhap();
					ql.add(tm);
					break;
				case 2: ql.hienThi(); break;
				case 3: 
					System.out.print("Nhap ma phieu muon sach: ");
					sc.nextLine();
					String maSo = sc.next();
					ql.remove(maSo);
					break;
				default: System.out.println("Cam on ban da tin dung"); break;
			}
		}while(n<4);
	}

}
