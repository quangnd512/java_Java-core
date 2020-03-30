package Bai3_II;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		TuyenSinh ts = new TuyenSinh();
		do {
			System.out.println("\n1. Nhap thong thi sinh");
			System.out.println("2. Hien thi thong thi sinh");
			System.out.println("3. Tim kiem thi sinh theo SBD.!");
			System.out.println("4. Thoat");
			
			System.out.print("Nhap lua chon: ");
			n = sc.nextInt();
				switch (n) {
				case 1:
					System.out.println("Chon a de nhap thi sinh Khoi A");
					System.out.println("Chon b de nhap thi sinh Khoi B");
					System.out.println("Chon c de nhap thi sinh Khoi C");
					System.out.print("Chon khoi thi: ");
					String nhap = sc.next();
					switch (nhap) {
					case "a":
						KhoiA ka = new KhoiA();
						ka.nhap();
						ts.add(ka);
						break;
						
					case "b":
						KhoiB kb = new KhoiB();
						kb.nhap();
						ts.add(kb);
						break;

					case "c":
						KhoiC kc = new KhoiC();
						kc.nhap();
						ts.add(kc);
						break;
					default: break;
					}
					break;
				case 2: ts.hienThi(); break;
				case 3: 
					String luaChon;
					System.out.print("Nhap SBD thi sinh: ");
					luaChon = sc.next();
					ts.search(luaChon);
					break;
				default: System.out.println("Cam on ban da tin dung"); break;
			}
		}while(n!=4);
	}

}
