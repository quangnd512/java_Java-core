package Lab6_2;

import java.util.Scanner;

public class NVPhucVu extends CanBo{
	private String congViec;
	
	public NVPhucVu(String hoTen, String namSinh, String gioiTinh, String diaChi, String congViec) {
		this.congViec = congViec;
	}
	public NVPhucVu() {
		
	}
	public String getCongViec() {
		return congViec;
	}
	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Cong viec: ");
		congViec = sc.nextLine();
		System.out.println();
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.print("Bac luong: "+getCongViec());
		System.out.println();
	}

}
