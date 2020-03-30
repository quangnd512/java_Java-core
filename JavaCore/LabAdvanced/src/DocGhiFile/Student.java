package DocGhiFile;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable{
	String id;
	String name;
	int age;
	String address;
	float gpa;
	public Student() {
	}
	public Student(String id, String name, int age, String address, float gpa) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gpa = gpa;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ma sinh vien: ");
		id = sc.nextLine();
		edit();
	}
	public void display() {
		System.out.println("Ma sinh vien: "+getId()+", Ho va ten: "+getName()+", Tuoi: "+getAge()+", Dia chi: "+getAddress()+", Diem trung binh: "+getGpa());
	}
	
	public void edit() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho va ten: ");
		name = sc.nextLine();
		System.out.print("Tuoi: ");
		age = Integer.parseInt(sc.nextLine());
		System.out.print("Dia chi: ");
		address = sc.nextLine();
		System.out.print("Dien trung binh: ");
		gpa = Float.parseFloat(sc.nextLine());
	}
}
