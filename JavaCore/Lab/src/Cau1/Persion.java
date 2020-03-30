package Cau1;

import java.util.Scanner;

public class Persion {
	private String name;
	private String sex;
	private String age;
	private String address;
	public Persion(String name, String sex, String age, String address) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.address = address;
	}
	public Persion() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho va ten: ");
		name = sc.nextLine();
		System.out.print("Gioi tinh: ");
		sex = sc.nextLine();
		System.out.print("Nam sinh: ");
		age = sc.nextLine();
		System.out.print("Dia chi: ");
		address = sc.nextLine();
	}
	public void hienThi() {
		System.out.print("Ho va ten: " +getName()+ ", Gioi tinh: " +getSex()+ ", Nam sinh: " +getAge()+ ", Dia chi: " +getAddress());
	}
	
}
