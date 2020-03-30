package Bai8_II;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheMuon extends SinhVien{
	private String maPhieuMuon;
	private String ngayMuon;
	private int hanTra;
	private String soHieuSach;
	public TheMuon(String hoTen, int tuoi, String lop, String maPhieuMuon, String ngayMuon, int hanTra,
			String soHieuSach) {
		super(hoTen, tuoi, lop);
		this.maPhieuMuon = maPhieuMuon;
		this.ngayMuon = ngayMuon;
		this.hanTra = hanTra;
		this.soHieuSach = soHieuSach;
	}
	public TheMuon() {
		
	}
	public String getMaPhieuMuon() {
		return maPhieuMuon;
	}

	public void setMaPhieuMuon(String maPhieuMuon) {
		this.maPhieuMuon = maPhieuMuon;
	}

	public String getNgayMuon() {
		return ngayMuon;
	}

	public void setNgayMuon(String ngayMuon) {
		this.ngayMuon = ngayMuon;
	}

	public int getHanTra() {
		return hanTra;
	}

	public void setHanTra(int hanTra) {
		this.hanTra = hanTra;
	}

	public String getSoHieuSach() {
		return soHieuSach;
	}

	public void setSoHieuSach(String soHieuSach) {
		this.soHieuSach = soHieuSach;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ma phieu muon: ");
		maPhieuMuon = sc.nextLine();
		System.out.print("Ngay muon: ");
		ngayMuon = sc.nextLine();
		System.out.print("Han tra: ");
		hanTra = sc.nextInt();
		sc.nextLine();
		System.out.print("So hieu sach: ");
		soHieuSach = sc.nextLine();
		super.nhap();
	}
	@Override
	public String toString() {
		return "Ho va ten: " +getHoTen()+ ", Tuoi: " +getTuoi()+ ", Lop: " +getLop()+ ", Ma phieu muon: "
				+getMaPhieuMuon()+ ", So hieu sach: " +getSoHieuSach()+ ", Ngay muon: " +getNgayMuon()+ ", Han tra: " +getHanTra();
	}
	
}
