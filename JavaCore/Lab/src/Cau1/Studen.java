package Cau1;

import java.util.Scanner;

public class Studen extends Persion{
	private String maSV;
	private float diemTB;
	private String email;
	public Studen(String name, String sex, String age, String address, String maSV, float diemTB, String email) {
		super(name, sex, age, address);
		this.maSV = maSV;
		this.diemTB = diemTB;
		this.email = email;
	}
	public Studen() {
		
	}
	public String getMaSV() {
		return maSV;
	}
	public boolean setMaSV(String maSV) {
		if(maSV!= null && maSV.length()<=8) { //Ma sinh vien nho hon 8 ky tu
			this.maSV = maSV;
			return true;
		}else {
			System.err.println("Nhap lai ma SV.! Ma ban nhap phai cos 8 ky tu tro xuong.!");
			return false;
		}
	}
	public float getDiemTB() {
		return diemTB;
	}
	public boolean setDiemTB(float diemTB) {
		if (diemTB>=0&&diemTB<=10) { //Diem trung binh tu 0.0 den 10.0
			this.diemTB = diemTB;
			return true;
		} else {
			System.err.println("Diem phai tu 0 den 10");
			return false;
		}
		
	}
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email) {
		if(email!=null && email.contains("@") && !email.contains(" ")) { //email.contains("@"): Email phai chua ky tu @
			this.email = email;
			return true;
		}else {
			System.err.println("Email phai chua ky tu @ va khong duoc de khoang trang.!");
			return false;
		}
		
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Ma sinh vien: ");
		while (true) {
			String maSVInput = sc.nextLine();
			boolean ckeck = setMaSV(maSVInput);
			if (ckeck) {
				break;
			}
		}
		System.out.print("Diem trung binh: ");
		while (true) {
			float diemTBSV = sc.nextFloat();
			boolean ckeckDiem = setDiemTB(diemTBSV);
			if (ckeckDiem) {
				break;
			}
		}
		sc.nextLine();
		System.out.print("Email: ");
		while (true) {
			String addEmail = sc.nextLine();
			boolean ckeckEmail = setEmail(addEmail);
			if (ckeckEmail) {
				break;
			}
		}
	}
	public void hienThi() {
		super.hienThi();
		System.out.print(", Ma sinh vien: " +getMaSV()+ ", Diem trung binh: " +getDiemTB()+ ", Email: " +getEmail());
		System.out.println();
	}
	
	public boolean xetHocBong() {
		if(getDiemTB()>=8) {
			return true;
		}
		return false;
	}
}
