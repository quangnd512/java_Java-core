package Bai3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bao extends ThuVien{
	String ngayPhatHanh;

	public Bao() {
		
	}

	public Bao(String ngayPhatHanh) {
		super();
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public String getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(String ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}
	
	public void input() {
		super.input();
	}
	
	public void edit() {
		super.edit();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ngay phat hanh: ");
		while (true) {
			ngayPhatHanh = sc.nextLine();
			String pStr = "";
			pStr = "^[0-9]{1,2}[-|/][0-9]{1,2}[-|/][0-9]{4}$";
			Pattern pattern = Pattern.compile(pStr);
			Matcher matcher = pattern.matcher(ngayPhatHanh);
			if (matcher.find()) {
				break;
			}else {
				System.err.println("Nhap sai cu phap: Thang phai co dinh dang: 01/01/2020 or 1/2/2020");
			}
		}
	}
	
	public void display() {
		super.display();
		System.out.print("Ngay phat hanh: "+getNgayPhatHanh()+".");
		System.out.println();
	}
}
