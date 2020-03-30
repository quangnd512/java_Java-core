package Cau7;

import java.util.Scanner;

public class Vehicle {
	String nhaSX;
	String bienSoXe;
	String namSX;
	String id;
	int width;
	int height;
	public Vehicle(String nhaSX, String bienSoXe, String namSX, String id, int width, int height) {
		this.nhaSX = nhaSX;
		this.bienSoXe = bienSoXe;
		this.namSX = namSX;
		this.id = id;
		this.width = width;
		this.height = height;
	}
	public Vehicle() {
	}
	
	public Vehicle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public String getNhaSX() {
		return nhaSX;
	}
	public void setNhaSX(String nhaSX) {
		this.nhaSX = nhaSX;
	}
	public String getBienSoXe() {
		return bienSoXe;
	}
	public void setBienSoXe(String bienSoXe) {
		this.bienSoXe = bienSoXe;
	}
	public String getNamSX() {
		return namSX;
	}
	public void setNamSX(String namSX) {
		this.namSX = namSX;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nha san xuat: ");
		nhaSX = sc.nextLine();
		System.out.print("Bien so xe: ");
		bienSoXe = sc.nextLine();
		System.out.print("Nam san xuat: ");
		namSX = sc.nextLine();
		System.out.print("Chu so huu: ");
		nhaSX = sc.nextLine();
		System.out.print("Chieu dai: ");
		width = Integer.parseInt(sc.nextLine());
		System.out.print("Chieu cao: ");
		height = Integer.parseInt(sc.nextLine());
	}
	public void showInfo() {
		System.out.print("Nha san xuat: "+getNhaSX()+", Bien so xe: "+getBienSoXe()+", Nam san xuat: "+getNamSX()+", Chu so huu: "+getNhaSX()+", Chieu dai: "+getWidth()+", Chieu cao: "+getHeight());
	}
	public int getS() {
		return width * height;
		
	}
}
