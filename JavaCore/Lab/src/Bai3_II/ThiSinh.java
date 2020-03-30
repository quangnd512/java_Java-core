package Bai3_II;

import java.util.Scanner;

public abstract class ThiSinh {
	
	private String SBD;
	private String hoTen;
	private String diaChi;
	private int mucUuTien;
	public ThiSinh(String SBD, String hoTen, String diaChi, int mucUuTien) {
		this.SBD = SBD;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
	}
	public ThiSinh() {
		
	}
	public String getSBD() {
		return SBD;
	}
	public void setSBD(String sBD) {
		SBD = sBD;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getMucUuTien() {
		return mucUuTien;
	}
	public void setMucUuTien(int mucUuTien) {
		this.mucUuTien = mucUuTien;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("So bao danh: ");
		SBD = sc.nextLine();
		System.out.print("Ho va ten: ");
		hoTen = sc.nextLine();
		System.out.print("Dia chi: ");
		diaChi = sc.nextLine();
		System.out.print("Muc uu tien(1-3): ");
		mucUuTien =sc.nextInt();
	}
}
