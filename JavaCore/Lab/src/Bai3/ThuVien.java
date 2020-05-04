package Bai3;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThuVien implements Serializable{
	String maTaiLieu;
	String tenTaiLieu;
	int soBanIn;
	public ThuVien() {
		
	}

	public ThuVien(String maTaiLieu, String tenTaiLieu, int soBanIn) {
		this.maTaiLieu = maTaiLieu;
		this.tenTaiLieu = tenTaiLieu;
		this.soBanIn = soBanIn;
	}

	public String getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getTenTaiLieu() {
		return tenTaiLieu;
	}

	public void setTenTaiLieu(String tenTaiLieu) {
		this.tenTaiLieu = tenTaiLieu;
	}

	public int getSoBanIn() {
		return soBanIn;
	}

	public void setSoBanIn(int soBanIn) {
		this.soBanIn = soBanIn;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma tai lieu: ");
		while (true) {
			maTaiLieu = sc.nextLine();
			String pStr = "";
			if (maTaiLieu.startsWith("TC")) {
				pStr = "TC[0-9]{1}[A-Z]{1}[0-9]?";
			}else if(maTaiLieu.startsWith("S")) {
				pStr = "S[0-9]{1}[A-Z]{1}";
			}else if(maTaiLieu.startsWith("B")) {
				pStr = "B[0-9]{1}[A-Z]{1}[0-9]{2}";
			}else {
				System.err.println("Nhap sai cu phap.!");
				continue;
			}
			Pattern pattern = Pattern.compile(pStr);
			Matcher matcher = pattern.matcher(maTaiLieu);
			if (matcher.find()) {
				break;
			}else {
				System.err.println("Nhap sai cu phap.!");
			}
		}
		edit();
	}
	
	public void edit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten tai lieu: ");
		tenTaiLieu = sc.nextLine();
		System.out.println("Nhap so ban in: ");
		soBanIn = Integer.parseInt(sc.nextLine());
	}
	
	public void display() {
		System.out.print("Ma tai lieu: "+getMaTaiLieu()+", Ten tai lieu: "+getTenTaiLieu()+", So ban in: "+getSoBanIn()+", ");
	}	
}
