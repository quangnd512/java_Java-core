package Bai3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TapChi extends ThuVien{
	
	int soPhatHanh;
	String thangPhatHanh;
	
	public TapChi() {
		
	}

	public TapChi(int soPhatHanh, String thangPhatHanh) {
		super();
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public String getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(String thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	public void input() {
		super.input();
	}
	
	public void edit() {
		super.edit();
		Scanner sc = new Scanner(System.in);
		System.out.println("So phat hanh: ");
		soPhatHanh = Integer.parseInt(sc.nextLine());
		System.out.println("Thang phat hanh: ");
		while (true) {
			thangPhatHanh = sc.nextLine();
			String pStr = "";
			pStr = "^[0-9]{1,2}[-|/][0-9]{1,2}[-|/][0-9]{4}$";
			Pattern patterm = Pattern.compile(pStr);
			Matcher matcher = patterm.matcher(thangPhatHanh);
			if (matcher.find()) {
				break;
			}else {
				System.err.println("Nhap sai cu phap: Thang phai co dinh dang: 01/01/2020 or 1/2/2020");
			}
		}
	}
	
	public void display() {
		super.display();
		System.out.print("So phat hanh: "+getSoPhatHanh()+", Thang phat hanh: "+getThangPhatHanh()+".");
		System.out.println("");
	}
	
}
