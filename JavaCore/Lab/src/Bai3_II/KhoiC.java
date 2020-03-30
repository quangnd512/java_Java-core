package Bai3_II;

import java.util.Scanner;

public class KhoiC extends ThiSinh{
	private int van;
	private int su;
	private int dia;
	public KhoiC(String SBD, String hoTen, String diaChi, int mucUuTien, int van, int su, int dia) {
		super(SBD, hoTen, diaChi, mucUuTien);
		this.van = van;
		this.su = su;
		this.dia = dia;
	}
	public KhoiC() {
		
	}
	public int getVan() {
		return van;
	}
	public void setVan(int van) {
		this.van = van;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Diem mon van: ");
		van = sc.nextInt();
		System.out.print("Diem mon su: ");
		su = sc.nextInt();
		System.out.print("Diem mon dia: ");
		dia = sc.nextInt();
	}
	@Override
	public String toString() {
		return "SBD: " +getSBD()+ ", Ho va ten: " +getHoTen()+ ", Dia chi: " +getDiaChi()+ ", Muc uu tien: "+getMucUuTien()+". Diem cac mon thi la: Van: "+getVan()+", Su: "+getSu()+", Dia: "+getDia();
	}
}
