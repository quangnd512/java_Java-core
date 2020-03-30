package Bai7_II;

import java.util.Scanner;

public class CBGV extends Nguoi{
	private int luongCung;
	private int luongThuong;
	private int tienPhat;
	public CBGV(String hoTen, int tuoi, String queQuan, String maSoGiaoVien, int luongCung, int luongThuong,
			int tienPhat) {
		super(hoTen, tuoi, queQuan, maSoGiaoVien);
		this.luongCung = luongCung;
		this.luongThuong = luongThuong;
		this.tienPhat = tienPhat;
	}
	public CBGV() {
		
	}
	public int getLuongCung() {
		return luongCung;
	}
	public void setLuongCung(int luongCung) {
		this.luongCung = luongCung;
	}
	public int getLuongThuong() {
		return luongThuong;
	}
	public void setLuongThuong(int luongThuong) {
		this.luongThuong = luongThuong;
	}
	public int getTienPhat() {
		return tienPhat;
	}
	public void setTienPhat(int tienPhat) {
		this.tienPhat = tienPhat;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Luong cung: ");
		luongCung = sc.nextInt();
		System.out.print("Luong thuong: ");
		luongThuong = sc.nextInt();
		System.out.print("Tien phat: ");
		tienPhat = sc.nextInt();
		sc.nextLine();
	}
	
	@Override
	public String toString() {
		return "Ma so GV: " +getMaSoGiaoVien()+", Ho va ten: " +getHoTen()+ ", Tuoi: " +getTuoi()+ ", Que quan: " +getQueQuan();
	}
}
