package Bai6_II;

import java.util.Scanner;

import Bai3_II.KhoiA;
import Bai3_II.KhoiB;
import Bai3_II.KhoiC;
import Bai3_II.TuyenSinh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		QuanLy ql = new QuanLy();
		do {
			System.out.println("1. Nhap thong tin hoc sinh");
			System.out.println("2. Hien thi thong tin hoc sinh");
			System.out.println("3. Hien danh sach hoc sinh 20 tuoi");
			System.out.println("4. So luong sinh vien 23 tuoi va o DN");
			System.out.println("5. Thoat");
			
			System.out.print("Nhap lua chon: ");
			n = sc.nextInt();
				switch (n) {
				case 1:
					Truong truong = new Truong();
					truong.nhap();
					ql.add(truong); break;
				case 2: ql.hienThi(); break;
				case 3: ql.searchHS20(); break;
				case 4: ql.timSLhocSinh(); break;
				default: System.out.println("Cam on ban da tin dung"); break;
			}
		}while(n!=5);
	}

}
