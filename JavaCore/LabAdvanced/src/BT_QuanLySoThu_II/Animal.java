package BT_QuanLySoThu_II;

import java.util.Scanner;

public abstract class Animal {
	String ten;
	int tuoi;
	String moTa;
	
	public Animal() {
	}
	
	public Animal(String ten) {
		this.ten = ten;
	}

	public Animal(String ten, int tuoi) {
		this.ten = ten;
		this.tuoi = tuoi;
	}
	
	public Animal(String ten, int tuoi, String moTa) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.moTa = moTa;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public void xemThongTin() {
		System.out.println("Ten: "+getTen()+", Tuoi: "+getTuoi()+", Dac trung: "+getMoTa());
	}
	
	public abstract void tiengKeu();
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten dong vat: ");
		ten = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		tuoi = Integer.parseInt(sc.nextLine());
		System.out.println("Mo ta: ");
		moTa = sc.nextLine();
	}
}