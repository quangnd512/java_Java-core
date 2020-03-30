package Bai2_ll;

import java.util.Scanner;

public abstract class ThuVien {

	private String maTaiLieu;
	private String tenNXB;
	private int soBan;
	
	public ThuVien(String maTaiLieu, String tenNXB, int soBan) {
		this.maTaiLieu = maTaiLieu;
		this.tenNXB = tenNXB;
		this.soBan = soBan;
	}
	
	public ThuVien() {
		
	}
	
	public String getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getTenNXB() {
		return tenNXB;
	}

	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}

	public int getSoBan() {
		return soBan;
	}

	public void setSoBan(int soBan) {
		this.soBan = soBan;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma tai lieu: ");
		maTaiLieu = sc.nextLine();
		System.out.print("Ten nha xuat ban: ");
		tenNXB = sc.nextLine();
		System.out.print("So ban phat hanh: ");
		soBan = sc.nextInt();
	}
}
