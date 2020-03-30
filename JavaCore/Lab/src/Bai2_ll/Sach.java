package Bai2_ll;

import java.util.Scanner;

public class Sach extends ThuVien{

	private String tenTacGia;
	private int soTrang;
	
	public Sach(String maTaiLieu, String tenNXB, int soBan, String tenTacGia, int soTrang) {
		super(maTaiLieu, tenNXB, soBan);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}
	
	public Sach() {
		
	}
	
	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Ten tac gia: ");
		tenTacGia = sc.next();
		System.out.print("So trang: ");
		soTrang = sc.nextInt();
	}
	
	@Override
	public String toString() {
		return "Ma tai lieu: " +getMaTaiLieu()+ ", Ten nha xuat ban: "+getTenNXB()+", So ban phat hanh: " +getSoBan()+", Ten tac gia: " +getTenTacGia()+ ", So trang: " +getSoTrang();
	}
	
}
