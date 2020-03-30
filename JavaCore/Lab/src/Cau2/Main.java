package Cau2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		QuanLy ql = new QuanLy();
		do {
			System.out.println("\n1. Nhap thong tin sach");
			System.out.println("2. Hien thi tat ca sach ra man hinh");
			System.out.println("3. Nhap thong tin tac gia");
			System.out.println("4. Tim kiem sach theo but danh");
			System.out.println("5. Thoat");
			System.out.print("Nhap lua chon: ");
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("Nhap so sach can them: ");
				int b = sc.nextInt();
				for (int i = 0; i < b; i++) {
					Book book = new Book();
					book.input();
					boolean isAutherBook = false;
					for (int j = 0; j < ql.author.size(); j++) {
						if(ql.author.get(j).getNickname().equalsIgnoreCase(book.getNickname())) {
							isAutherBook = true;
							break;
						}
					}
					if(!isAutherBook) {
						Author author = new Author(book.getBookName());
						author.input(ql.author);
						ql.addNameAuthor(author);
					}
					ql.addBook(book);
				}
				break;
			case 2:
				ql.displayBook();
				System.out.println();
				break;
			case 3:
				System.out.println("Nhap so tac gia can them: ");
				int a = sc.nextInt();
				for (int i = 0; i < a; i++) {
					Author author = new Author();
					author.input(ql.author);
					ql.addNameAuthor(author);
				}
				break;
			case 4:
				System.out.println("Nhap but danh tac gia can tim: ");
				sc.nextLine();
				String c = sc.nextLine();
				ql.findBookInNick(c);
				break;
			case 5:
				System.out.println("Tam biet");
				break;
			default: System.err.println("Nhap sai.!");
				break;
			}
		}while(n<5);
	}

}
