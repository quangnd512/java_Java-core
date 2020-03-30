package Bai5_II;

import java.util.Scanner;

public class KhachSan extends Nguoi{
	private int soNgayThue;
	private String loaiPhong;
	public KhachSan(String hoTen, int tuoi, String soCMT, int soNgayThue, String loaiPhong) {
		super(hoTen, tuoi, soCMT);
		this.soNgayThue = soNgayThue;
		this.loaiPhong = loaiPhong;
	}
	public KhachSan() {
		
	}
	public int getSoNgayThue() {
		return soNgayThue;
	}
	public void setSoNgayThue(int soNgayThue) {
		this.soNgayThue = soNgayThue;
	}
	public String getLoaiPhong() {
		return loaiPhong;
	}
	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Loai phong thue: ");
		loaiPhong = sc.nextLine(); 
		System.out.print("So ngay thue: ");
		soNgayThue = sc.nextInt();
	}
	@Override
	public String toString() {
		return "Ho va ten: " +getHoTen()+ ", Tuoi: " +getTuoi()+ ", So CMT: " +getSoCMT()+", Loai phong: " +getLoaiPhong()+ ", So ngay thue: " +getSoNgayThue();
	}
	
	
}
