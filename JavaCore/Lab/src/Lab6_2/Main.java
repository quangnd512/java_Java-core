package Lab6_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		QLCB ql = new QLCB();
		do {
			System.out.println("1. Nhap thong tin cac can bo");
			System.out.println("2. Hien thi thong tin can bo");
			System.out.println("3. Tim kiem can bo.!");
			System.out.println("4. Thoat");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap n = ");
			n = sc.nextInt();
			switch (n) {
				case 1: ql.nhap(); break;
				case 2: ql.hienThi(); break;
				case 3: ql.timKiem(); break;
				default: System.out.println("Ban da nhap sai"); break;
			}
		}while(n!=4);
	}

}
