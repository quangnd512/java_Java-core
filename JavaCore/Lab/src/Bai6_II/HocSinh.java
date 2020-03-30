package Bai6_II;

import java.util.Scanner;


public class HocSinh {
	private String hoTen;
	private int tuoi;
	private String queQuan;
	public HocSinh(String hoTen, int tuoi, String queQuan) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.queQuan = queQuan;
	}
	public HocSinh() {
		
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
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho va ten: ");
		hoTen = sc.nextLine();
		System.out.print("Tuoi: ");
		tuoi = sc.nextInt();
		sc.nextLine(); //Chống trôi
		System.out.print("Que quan: ");
		queQuan = sc.nextLine();
	}
	
}
