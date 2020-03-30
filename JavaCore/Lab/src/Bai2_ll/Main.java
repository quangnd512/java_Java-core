package Bai2_ll;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		QuanLySach ql = new QuanLySach();
		do {
			System.out.println("1. Nhap thong tin sach");
			System.out.println("2. Hien thi thong tin sach");
			System.out.println("3. Tim kiem sach.!");
			System.out.println("4. Xoa sach.!");
			System.out.println("5. Thoat");
			
			
			System.out.print("Nhap n = ");
			n = sc.nextInt();
				switch (n) {
				case 1:
					System.out.println("Nhap a de nhap sach: ");
					System.out.println("Nhap b de nhap tap chi: ");
					System.out.println("Nhap c de nhap bao: ");
					System.out.println("Nhap ma phan loai sach: ");
					String nhap = sc.next();
					switch (nhap) {
					case "a":
						Sach book = new Sach();
						book.nhap();
						ql.add(book);
						break;
						
					case "b":
						TapChi tc = new TapChi();
						tc.nhap();
						ql.add(tc);
						break;

					case "c":
						Bao newspaper = new Bao();
						newspaper.nhap();
						ql.add(newspaper);
						break;
					default: break;
					}
					break;
				case 2: ql.hienThi(); break;
				case 3: 
					String luaChon;
					System.out.println("Nhan a de tim sach: ");
					System.out.println("Nhan b de tim tap chi: ");
					System.out.println("Nhan c de tim bao: ");
					System.out.print("Phap lua chon: ");
					luaChon = sc.next();
					switch (luaChon) {
					case "a":
						ql.searchSach();
						break;
					case "b":
						ql.searchTapChi();
						break;
					case "c":
						ql.searchBao();
						break;
					default: System.out.println("Failse");
						break;
					}
					break;
				case 4: 
					System.out.println("Nhap ma sach can xoa: ");
					String id = sc.next();
					System.out.println(ql.delete(id)?"Thanh cong.!":"That bai.!");
					break;
				default: System.out.println("Cam on ban da tin dung"); break;
			}
		}while(n!=5);
	}

}
