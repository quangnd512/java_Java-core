package Cau2;

import java.util.Scanner;

public class Book {
	private String bookName;
	private String creatAt;
	private String nickname;
	public Book(String bookName, String creatAt, String nickname) {
		this.bookName = bookName;
		this.creatAt = creatAt;
		this.nickname = nickname;
	}
	public Book() {
		
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getCreatAt() {
		return creatAt;
	}
	public void setCreatAt(String creatAt) {
		this.creatAt = creatAt;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------------------------");
		System.out.print("Ten sach: ");
		bookName = sc.nextLine();
		System.out.print("Ngay xuat ban: ");
		creatAt = sc.nextLine();
		System.out.println("But danh: ");
		nickname = sc.nextLine();
	}
	public void display() {
		System.out.print("Ten sach: "+getBookName()+", Ngay xuat ban: "+getCreatAt()+", But danh: "+getNickname());
		System.out.println();
	}
}
