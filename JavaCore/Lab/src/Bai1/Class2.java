package Bai1;

import java.util.Scanner;

public class Class2 {
	public String name;
	public Student[] students;
	public int numOfStudent;
	public Teacher advisor;
	
	public Class2(String name, Student[] students, int numOfStudent, Teacher advisor) {
		this.name = name;
		this.students = students;
		this.numOfStudent = numOfStudent;
		this.advisor = advisor;
	}
	public Class2() {
		
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thông tin lop hoc.!");
		System.out.println("Nhap ten lop hoc: ");
		name = sc.nextLine();
		System.out.println("Nhap thong tin giao vien chu nhiem: ");
		advisor = new Teacher();
		advisor.nhap();
		System.out.println("Nhap so luong sinh vien: ");
		numOfStudent = sc.nextInt();
		students = new Student[numOfStudent];
		for (int i = 0; i < students.length; i++) {
			System.out.println("Sinh vien thu "+(i+1)+": ");
			students[i] = new Student();
			students[i].nhap();
		}
	}
	
	public void hienThi() {
		System.out.println("Thong tin lop hoc.!");
		System.out.println("Ten lop hoc: "+name);
		System.out.println("Giao vien chu nhiem: ");
		advisor.hienThi();
		System.out.println("So sinh vien: "+numOfStudent);
		for (int i = 0; i < students.length; i++) {
			students[i].hienThi();
		}
	} 
}
