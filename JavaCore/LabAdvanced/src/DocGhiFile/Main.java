package DocGhiFile;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void showMenu() {
		System.out.println("1. Them sinh vien");
		System.out.println("2. Sua sinh vien theo id");
		System.out.println("3. Xoa sinh vien theo id");
		System.out.println("4. Sap xep sinh vien theo diem gpa");
		System.out.println("5. Sap xep sinh vien theo ten");
		System.out.println("6. Hien thi danh sach sinh vien");
		System.out.println("7. Luu thong tin sinh vien vao file student.obj");
		System.out.println("8. Doc thong tin sinh vien tu file student.obj");
		System.out.println("9. Thoat");
	}

	public static void main(String[] args) throws IOException {
		QuanLy ql = new QuanLy();
		int n;
		do {
			showMenu();
			Scanner sc = new Scanner(System.in);
			System.out.print("Lua chon: ");
			n = Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1:
				Student st = new Student();
				st.input();
				ql.add(st);
				break;

			case 2:
				ql.editSt();
				break;

			case 3:
				ql.detele();
				break;

			case 4:
				ql.sortStGpa();
				break;

			case 5:
				ql.sortStName();
				break;

			case 6:
				ql.show();
				break;

			case 7:
				ql.writeSt();
				break;

			case 8:
				ql.readSt();
				break;

			case 9:
				System.out.print("Cam on da su dung chuong trinh.!");
				break;

			default: System.out.println("Nhap sai.!");
				break;
			}
		} while (n != 9);
	}

}
