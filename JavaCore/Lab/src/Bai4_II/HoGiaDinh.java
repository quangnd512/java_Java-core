package Bai4_II;

import java.util.Scanner;

public class HoGiaDinh {
	private int soThanhVien;
	private String soNha;
	Nguoi [] nguoi;
	public HoGiaDinh(int soThanhVien, String soNha, Nguoi [] nguoi) {
		this.soThanhVien = soThanhVien;
		this.soNha = soNha;
		this.nguoi = nguoi;
	}
	public HoGiaDinh() {
		
	}
	public int getSoThanhVien() {
		return soThanhVien;
	}
	public void setSoThanhVien(int soThanhVien) {
		this.soThanhVien = soThanhVien;
	}
	public String getSoNha() {
		return soNha;
	}
	public void setSoNha(String soNha) {
		this.soNha = soNha;
	}
	public Nguoi[] getNguoi() {
		return nguoi;
	}
	public void setNguoi(Nguoi[] nguoi) {
		this.nguoi = nguoi;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("So thanh vien trong gia dinh: ");
		soThanhVien = sc.nextInt();
		System.out.print("So nha: ");
		soNha = sc.next();
		nguoi = new Nguoi[soThanhVien];
		for (int i = 0; i < nguoi.length; i++) {
			nguoi[i] = new Nguoi();
			nguoi[i].nhap();
		}
	}
	public void hienThi() {
		System.out.print("So nha: " +getSoNha()+ ", So thanh vien: " +getSoThanhVien()+":\n");
		for (int i = 0; i < nguoi.length; i++) {
			System.out.println(nguoi[i].toString());
		}
	}
	
	
}
