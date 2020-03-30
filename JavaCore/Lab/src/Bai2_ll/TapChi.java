package Bai2_ll;

import java.util.Scanner;

public class TapChi extends ThuVien{
	private int soPhatHanh;
	private String thangPhatHanh;
	public TapChi(String maTaiLieu, String tenNXB, int soBan, int soPhatHanh, String thangPhatHanh) {
		super(maTaiLieu, tenNXB, soBan);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}
	public TapChi() {
		
	}
	public int getSoPhatHanh() {
		return soPhatHanh;
	}
	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}
	public String getThangPhatHanh() {
		return thangPhatHanh;
	}
	public void setThangPhatHanh(String thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("So phat hanh: ");
		soPhatHanh = sc.nextInt();
		System.out.print("Thang phat hanh: ");
		thangPhatHanh = sc.next();
	}
	@Override
	public String toString() {
		return "Ma tai lieu: " +getMaTaiLieu()+ ", Ten nha xuat ban: "+getTenNXB()+", So ban phat hanh: " +getSoBan()+", So phat hanh: " +getSoPhatHanh()+ ", Thang phat hanh: " +getThangPhatHanh();
	}
	
	
}
