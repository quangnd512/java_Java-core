package Bai4;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThiSinh implements Serializable{
	String sBD;
	String hoTen;
	String diaChi;
	String email;
	float mucUuTien;
	
	public ThiSinh() {
	}

	public ThiSinh(String sBD, String hoTen, String diaChi, String email, float mucUuTien) {
		this.sBD = sBD;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.email = email;
		this.mucUuTien = mucUuTien;
	}

	public String getsBD() {
		return sBD;
	}

	public void setsBD(String sBD) {
		this.sBD = sBD;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getMucUuTien() {
		return mucUuTien;
	}

	public boolean setMucUuTien(float mucUuTien) {
		if (mucUuTien>=0&&mucUuTien<=3) {
			this.mucUuTien = mucUuTien;
			return true;
		}else {
			System.err.println("Nhap khong dung.! Muc uu tien phai tu 0->3");
			return false;
		}
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("So bao danh: ");
		while (true) {
			sBD = sc.nextLine();
			String pStr = "";
			if (sBD.startsWith("DHA")) {
				pStr = "DHA[0-9]{2}[a-zA-Z0-9]?";
			}else if(sBD.startsWith("DHB")) {
				pStr = "DHB[0-9]{2}[a-zA-Z0-9]?";
			}else if(sBD.startsWith("DHC")) {
				pStr = "DHC[0-9]{2}[a-zA-Z0-9]?";
			}else {
				System.err.println("Nhap sai cu phap.!");
				continue;
			}
			Pattern pattern = Pattern.compile(pStr);
			Matcher matcher = pattern.matcher(sBD);
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
		System.out.println("Ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("Dia chi: ");
		diaChi = sc.nextLine();
		System.out.println("Email: ");
		while (true) {
			email = sc.nextLine();
			String pStr = "^[a-zA-Z]+[-]?[\\w-]+[@]{1}(gmail)[.]{1}(com)$";
			Pattern pattern = Pattern.compile(pStr);
			Matcher matcher = pattern.matcher(email);
			if (matcher.find()) {
				break;
			}else {
				System.err.println("Nhap sai cu phap.!");
			}
		}
		System.out.println("Muc uu tien: ");
		while (true) {
			float mucUuTien1 = Float.parseFloat(sc.nextLine());
			boolean checkMucUuTien = setMucUuTien(mucUuTien1);
			if (checkMucUuTien) {
				break;
			}
		}
	}
	
	public void display() {
		System.out.print("SBD: "+getsBD()+", Ho va ten: "+getHoTen()+", Dia chi: "+getDiaChi()+", Email: "+getEmail()+", Muc uu tien: "+getMucUuTien()+", ");
	}
	
}
