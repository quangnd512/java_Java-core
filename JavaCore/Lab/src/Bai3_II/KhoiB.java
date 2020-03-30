package Bai3_II;

import java.util.Scanner;

public class KhoiB extends ThiSinh
{
	private int toan;
	private int hoa;
	private int sinh;
	public KhoiB(String SBD, String hoTen, String diaChi, int mucUuTien, int toan, int hoa, int sinh) {
		super(SBD, hoTen, diaChi, mucUuTien);
		this.toan = toan;
		this.hoa = hoa;
		this.sinh = sinh;
	}
	public KhoiB() {
		
	}
	public int getToan() {
		return toan;
	}
	public void setToan(int toan) {
		this.toan = toan;
	}
	public int getHoa() {
		return hoa;
	}
	public void setHoa(int hoa) {
		this.hoa = hoa;
	}
	public int getSinh() {
		return sinh;
	}
	public void setSinh(int sinh) {
		this.sinh = sinh;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Diem mon toan: ");
		toan = sc.nextInt();
		System.out.print("Diem mon hoa: ");
		hoa = sc.nextInt();
		System.out.print("Diem mon sinh: ");
		sinh = sc.nextInt();
	}
	@Override
	public String toString() {
		return "SBD: " +getSBD()+ ", Ho va ten: " +getHoTen()+ ", Dia chi: " +getDiaChi()+ ", Muc uu tien: "+getMucUuTien()+". Diem cac mon thi la: Toan: "+getToan()+", Hoa: "+getHoa()+", Sinh: "+getSinh();
	}
}
