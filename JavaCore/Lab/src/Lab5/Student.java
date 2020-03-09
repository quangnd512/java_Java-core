package Lab5;

import java.util.Scanner;

public class Student extends Persion{

	public String class1;
	
	public Student(String name, String address, String deparment, String class1) {
		super(name, address, deparment);
		this.class1 = class1;
	}
	
	public Student() {
		//Tạo phương thức trắng để khởi tạo class
	}
	
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Lop: ");
		class1 = sc.nextLine();
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.print(", Lop: "+class1);
		System.out.println();
	}

}
