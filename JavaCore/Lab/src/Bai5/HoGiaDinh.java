package Bai5;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HoGiaDinh implements Serializable
{
	int soThanhVien;
	String soNha;
	ConNguoi [] nguoi;
	public HoGiaDinh() {
		
	}

	public HoGiaDinh(int soThanhVien, String soNha, ConNguoi[] nguoi) {
		this.soThanhVien = soThanhVien;
		this.soNha = soNha;
		this.nguoi = nguoi;
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

	public ConNguoi[] getNguoi() {
		return nguoi;
	}

	public void setNguoi(ConNguoi[] nguoi) {
		this.nguoi = nguoi;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("So nha: ");
		while (true) {
			soNha = sc.nextLine();
			String strPr = "[A-Z]{2}[0-9]{3}";
			Pattern pattern = Pattern.compile(strPr);
			Matcher matcher = pattern.matcher(soNha);
			if (matcher.find()) {
				break;
			} else {
				System.err.println("Nhap sai cu phap.! Hay nhap theo cu phap AACCC voi A la chu hoa tu A-Z, C la so tu 0-9");
			}
		}
		edit();
	}
	
	public void edit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("So thanh vien: ");
		soThanhVien = Integer.parseInt(sc.nextLine());
		nguoi = new ConNguoi[soThanhVien];
		for (int i = 0; i < nguoi.length; i++) {
			nguoi[i] = new ConNguoi();
			nguoi[i].input();
		}
	}
	public void display() {
		System.out.println("So nha: "+getSoNha()+", So thanh vien: "+getSoThanhVien());
		for (int i = 0; i < nguoi.length; i++) {
			nguoi[i].display();
		}
		System.out.println();
	}
	
}
