package Bai3_II;

import java.util.Scanner;

public class KhoiA extends ThiSinh{
	private int toan;
	private int ly;
	private int hoa;
	public KhoiA(String SBD, String hoTen, String diaChi, int mucUuTien, int toan, int ly, int hoa) {
		super(SBD, hoTen, diaChi, mucUuTien);
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}
	public KhoiA() {
		
	}
	public int getToan() {
		return toan;
	}
	public void setToan(int toan) {
		this.toan = toan;
	}
	public int getLy() {
		return ly;
	}
	public void setLy(int ly) {
		this.ly = ly;
	}
	public int getHoa() {
		return hoa;
	}
	public void setHoa(int hoa) {
		this.hoa = hoa;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Diem mon toan: ");
		toan = sc.nextInt();
		System.out.print("Diem mon ly: ");
		ly = sc.nextInt();
		System.out.print("Diem mon hoa: ");
		hoa = sc.nextInt();
	}
	@Override
	public String toString() {
		return "SBD: " +getSBD()+ ", Ho va ten: " +getHoTen()+ ", Dia chi: " +getDiaChi()+ ", Muc uu tien: "+getMucUuTien()+". Diem cac mon thi la: Toan: "+getToan()+", Ly: "+getLy()+", Hoa: "+getHoa();
	}
}
