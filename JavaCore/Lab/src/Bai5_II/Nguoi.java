package Bai5_II;

import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private int tuoi;
	private String soCMT;
	public Nguoi(String hoTen, int tuoi, String soCMT) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.soCMT = soCMT;
	}
	public Nguoi() {
		
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getSoCMT() {
		return soCMT;
	}
	public void setSoCMT(String soCMT) {
		this.soCMT = soCMT;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho va ten: ");
		hoTen = sc.nextLine();
		System.out.print("Tuoi: ");
		tuoi = sc.nextInt();
		sc.nextLine();
		System.out.print("So CMT: ");
		soCMT = sc.nextLine();
	}
	
}
