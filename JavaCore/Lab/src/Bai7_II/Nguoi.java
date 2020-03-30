package Bai7_II;

import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private int tuoi;
	private String queQuan;
	private String maSoGiaoVien;
	public Nguoi(String hoTen, int tuoi, String queQuan, String maSoGiaoVien) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.queQuan = queQuan;
		this.maSoGiaoVien = maSoGiaoVien;
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
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public String getMaSoGiaoVien() {
		return maSoGiaoVien;
	}
	public void setMaSoGiaoVien(String maSoGiaoVien) {
		this.maSoGiaoVien = maSoGiaoVien;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho va ten: ");
		hoTen = sc.nextLine();
		System.out.print("Tuoi: ");
		tuoi = sc.nextInt();
		sc.nextLine();
		System.out.print("Que quan: ");
		queQuan = sc.nextLine();
		System.out.print("Ma so GV: ");
		maSoGiaoVien = sc.nextLine();
	}
	
}
