package Cau4;

import java.util.Scanner;

public class Employee {
	String fullname;
	String gender;
	String address;
	String position;
	double salary;
	public Employee(String fullname, String gender, String address, String position, double salary) {
		this.fullname = fullname;
		this.gender = gender;
		this.address = address;
		this.position = position;
		this.salary = salary;
	}
	public Employee() {
		
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho ten: ");
		fullname = sc.nextLine();
		System.out.print("Gioi tinh: ");
		gender = sc.nextLine();
		System.out.print("Dia chi: ");
		address = sc.nextLine();
		System.out.print("Chuc vu: ");
		position = sc.nextLine();
		System.out.print("Luong: ");
		salary = Float.parseFloat(sc.nextLine());
	}
	public void display() {
		System.out.println("Ho ten: "+getFullname()+", Gioi tinh: "+getGender()+", Dia chi: "+getAddress()+", Chuc vu: "+getPosition()+", Luong: "+getSalary());
	}
	
	
}
