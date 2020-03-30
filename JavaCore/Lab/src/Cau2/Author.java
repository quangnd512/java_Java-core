package Cau2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Author {
	private String name;
	private int age;
	private String nickname;
	private String birthday;
	private String address;
	Scanner sc = new Scanner(System.in);
	
	public Author(String name, int age, String nickname, String birthday, String address) {
		this.name = name;
		this.age = age;
		this.nickname = nickname;
		this.birthday = birthday;
		this.address = address;
	}
	
	//Truyen doi so but danh rieng de nhap luon but danh 
	public Author(String nickname) {
		super();
		this.nickname = nickname;
	}

	public Author() {
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getNickname() {
		return nickname;
	}
	public String getBirthday() {
		return birthday;
	}
	public String getAddress() {
		return address;
	}
	
//	overloading
	public void input() {
		System.out.println("---------------------------------------");
		System.out.print("Ten tac gia: ");
		name = sc.nextLine();
		System.out.print("Tuoi: ");
		age = Integer.parseInt(sc.nextLine());
		System.out.print("Ngay sinh: ");
		birthday = sc.nextLine();
		System.out.print("Dia chi: ");
		address = sc.nextLine();
	}
	public void input(List<Author> author) {
		input();
		System.out.print("But danh: ");
		while (true) {
			nickname = sc.nextLine();
			boolean isFind = false;
			for (int i = 0; i < author.size(); i++) {
				if(author.get(i).getNickname().equalsIgnoreCase(nickname)) {
					isFind = true;
					break;
				}
			}
			if(!isFind) {
				break;
			}else {
				System.err.println("But danh da ton tai. But danh phai la duy nhat.!");
			}
		}
	}
//	overloading
	
	public void display() {
		System.out.println("Ho va ten: "+getName()+", Tuoi: "+getAge()+", But danh: "+getNickname()+", Ngay sinh: "+getBirthday()+", Dia chi: "+getAddress());
		System.out.println();
	}
}
