package Lab6_2;

import java.util.Scanner;

public class CongNhan extends CanBo{
	private int bacLuong;
	
	public CongNhan(String hoTen, String namSinh, String gioiTinh, String diaChi, int bacLuong) {
		super(hoTen, namSinh, gioiTinh, diaChi);
		this.bacLuong = bacLuong;
	}
	public CongNhan() {
		
	}
	public int getBacLuong() {
		return bacLuong;
	}
	public void setBacLuong(int bacLuong) {
		this.bacLuong = bacLuong;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Bac luong (1-7): ");
		bacLuong = sc.nextInt();
		System.out.println();
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.print("Bac luong: "+getBacLuong());
		System.out.println();
	}
}
