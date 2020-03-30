package Bai1;

import java.util.Scanner;

public class Teacher extends Persion{

	public String rank;
	
	public Teacher(String name, String address, String deparment, String rank) {
		super(name, address, deparment);
		this.rank = rank;
	}
	
	public Teacher() {
		//Tạo phương thức trắng để khởi tạo class
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Cap bac: ");
		rank = sc.nextLine();
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.print(", Cap bac: "+rank);
		System.out.println();
	}
	
}
