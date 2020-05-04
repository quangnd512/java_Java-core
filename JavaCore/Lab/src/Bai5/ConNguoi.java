package Bai5;

import java.io.Serializable;
import java.util.Scanner;

public class ConNguoi implements Serializable{
	String hoTen;
	int tuoi;
	String ngheNghiep;
	int soCMT;
	public ConNguoi() {
	}
	
	public ConNguoi(String hoTen, int tuoi, String ngheNghiep, int soCMT) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.ngheNghiep = ngheNghiep;
		this.soCMT = soCMT;
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

	public String getNgheNghiep() {
		return ngheNghiep;
	}

	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}

	public int getSoCMT() {
		return soCMT;
	}

	public void setSoCMT(int soCMT) {
		this.soCMT = soCMT;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("Tuoi: ");
		tuoi = Integer.parseInt(sc.nextLine());
		System.out.println("Nghe nghiep: ");
		ngheNghiep = sc.nextLine();
		System.out.println("So CMT: ");
		soCMT = Integer.parseInt(sc.nextLine());
	}
	
	public void display() {
		System.out.println("Ho ten: "+getHoTen()+", tuoi: "+getTuoi()+", nghe nghiep: "+getNgheNghiep()+", so CMT: "+getSoCMT());
		
	}
	
	
}

