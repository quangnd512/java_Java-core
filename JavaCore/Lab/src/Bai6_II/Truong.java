package Bai6_II;

import java.util.Scanner;

public class Truong extends HocSinh{
	private String lop;

	public Truong(String hoTen, int tuoi, String queQuan, String lop) {
		super(hoTen, tuoi, queQuan);
		this.lop = lop;
	}
	public Truong() {
		
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Lop hoc: ");
		lop = sc.nextLine();
	}
	@Override
	public String toString() {
		return "Ho va ten: " +getHoTen()+ ", Tuoi: " +getTuoi()+ ", Que quan: " +getQueQuan()+ ", Lop: " +getLop();
	}
	
}
