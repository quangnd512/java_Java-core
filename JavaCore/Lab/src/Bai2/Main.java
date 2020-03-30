package Bai2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int n,p,m=0;
		Scanner sc = new Scanner(System.in);
		QLCB ql = new QLCB();
		System.out.println("Nhap so luong can bo can nhap: ");
		p = sc.nextInt();
		do {
			System.out.println("1. Nhap thong tin cac can bo");
			System.out.println("2. Hien thi thong tin can bo");
			System.out.println("3. Tim kiem can bo.!");
			System.out.println("4. Thoat");
			
			
			System.out.print("Nhap n = ");
			n = sc.nextInt();
				switch (n) {
				case 1:
					while (m<p) {
					System.out.println("Nhap a de in Cong nhan: ");
					System.out.println("Nhap b de in Ky su: ");
					System.out.println("Nhap c de in Nhan vien: ");
					System.out.println("Nhap ma can bo: ");
					String nhap = sc.next();
					switch (nhap) {
					case "a":
						System.out.print("Ten nhan vien: ");
						String name = sc.next();
						System.out.print("Nam sinh:");
						String namSinh = sc.next();
						System.out.print("Gioi tinh: ");
						String gioiTinh = sc.next();
						System.out.print("Dia chi: ");
						String diaChi = sc.next();
						System.out.print("Bac luong (1-7): ");
						int bacLuong = sc.nextInt();
						CongNhan cn = new CongNhan(name, namSinh, gioiTinh, diaChi, bacLuong);
						ql.addArr(cn);
						break;
						
					case "b":
						System.out.print("Ten nhan vien: ");
						String name1 = sc.next();
						System.out.print("Nam sinh:");
						String namSinh1 = sc.next();
						System.out.print("Gioi tinh: ");
						String gioiTinh1 = sc.next();
						System.out.print("Dia chi: ");
						String diaChi1 = sc.next();
						System.out.print("Nganh dao tao: ");
						String nganhDaoTao = sc.next();
						KySu ks = new KySu(name1, namSinh1, gioiTinh1, diaChi1, nganhDaoTao);
						ql.addArr(ks);
						break;

					case "c":
						System.out.print("Ten nhan vien: ");
						String name2 = sc.next();
						System.out.print("Nam sinh:");
						String namSinh2 = sc.next();
						System.out.print("Gioi tinh: ");
						String gioiTinh2 = sc.next();
						System.out.print("Dia chi: ");
						String diaChi2 = sc.next();
						System.out.print("Cong viec: ");
						String congViec = sc.next();
						NVPhucVu nv = new NVPhucVu(name2, namSinh2, gioiTinh2, diaChi2, congViec);
						ql.addArr(nv);
						break;
					default: break;
					}
					m+=1;
					}
					break;
				case 2: ql.showList(); break;
				case 3: 
					String a;
					System.out.println("Nhap tu can tim kiem: ");
					a = sc.next();
					ql.search(a);
					break;
				default: System.out.println("Cam on ban da tin dung"); break;
			}
		}while(n!=4);
	}

}
