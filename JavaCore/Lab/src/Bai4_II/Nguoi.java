package Bai4_II;

import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private int tuoi;
	private String ngheNghiep;
	private String soCMT;
	public Nguoi(String hoTen, int tuoi, String ngheNghiep, String soCMT) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.ngheNghiep = ngheNghiep;
		this.soCMT = soCMT;
	}
	public Nguoi() {
		
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getNgheNghiep() {
		return ngheNghiep;
	}
	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}
	public String getSoCMT() {
		return soCMT;
	}
	public void setSoCMT(String soCMT) {
		this.soCMT = soCMT;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("Tuoi: ");
		tuoi = sc.nextInt();
		System.out.print("Nghe nghiep: ");
		ngheNghiep = sc.next();
		System.out.print("So CMT: ");
		soCMT = sc.next();
	}
	@Override
	public String toString() {
		return "Ho ten: " +getHoTen()+ ", Tuoi: " +getTuoi()+ ", Nghe nghiep: " +getNgheNghiep()+ ", So CMT: "+getSoCMT();
	}
	
}
