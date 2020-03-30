package Bai2_ll;

import java.util.Scanner;

public class Bao extends ThuVien{
	private String ngayPhatHanh;

	public Bao(String maTaiLieu, String tenNXB, int soBan, String ngayPhatHanh) {
		super(maTaiLieu, tenNXB, soBan);
		this.ngayPhatHanh = ngayPhatHanh;
	}
	public Bao() {
		
	}

	public String getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(String ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Ngay phat hanh: ");
		ngayPhatHanh = sc.next();
	}

	@Override
	public String toString() {
		return "Ma tai lieu: " +getMaTaiLieu()+ ", Ten nha xuat ban: "+getTenNXB()+", So ban phat hanh: " +getSoBan()+", Ngay phat hanh: " +getNgayPhatHanh();
	}
	
}
