package Lab6_2;

import java.util.Scanner;

public abstract class CanBo {
	private String hoTen;
	private String namSinh;
	private String gioiTinh;
	private String diaChi;
	
	public CanBo(String hoTen, String namSinh, String gioiTinh, String diaChi) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
		this.namSinh = namSinh;
	}
	
	public CanBo() {
		
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("Nam sinh: ");
		namSinh = sc.nextLine();
		System.out.print("Gioi tinh: ");
		gioiTinh = sc.nextLine();
		System.out.print("Dia chi: ");
		diaChi = sc.nextLine();
	}
	
	public void hienThi() {
		System.out.print("Ho ten: "+getHoTen()+", Nam sinh: "+getNamSinh()+", Gioi tinh: "+getGioiTinh()+", Dia chi: "+getDiaChi()+", ");
	}
	
}
