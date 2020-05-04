package Bai4;

import java.util.Scanner;

public class KhoiC extends ThiSinh{
	float van;
	float su;
	float dia;
	float tongC;
	public KhoiC() {
		
	}
	
	public KhoiC(float van, float su, float dia) {
		this.van = van;
		this.su = su;
		this.dia = dia;
	}

	public float getVan() {
		return van;
	}

	public boolean setVan(float van) {
		if (van>=0&&van<=10) {
			this.van = van;
			return true;
		}else {
			System.err.println("Nhap khong dung.! Diem phai tu 0->10");
			return false;
		}
	}

	public float getSu() {
		return su;
	}

	public boolean setSu(float su) {
		if (su>=0&&su<=10) {
			this.su = su;
			return true;
		}else {
			System.err.println("Nhap khong dung.! Diem phai tu 0->10");
			return false;
		}
	}

	public float getDia() {
		return dia;
	}

	public boolean setDia(float dia) {
		if (dia>=0&&dia<=10) {
			this.dia = dia;
			return true;
		}else {
			System.err.println("Nhap khong dung.! Diem phai tu 0->10");
			return false;
		}
	}
	
	public float getTongC() {
		return tongC;
	}

	public void setTongC(float tongC) {
		this.tongC = tongC;
	}

	public void input() {
		super.input();
	}
	public void edit() {
		super.edit();
		Scanner sc = new Scanner(System.in);
		System.out.println("Diem van: ");
		while (true) {
			float van1 = Float.parseFloat(sc.nextLine());
			boolean checkVan = setVan(van1);
			if (checkVan) {
				break;
			}
		}
		System.out.println("Diem su: ");
		while (true) {
			float su1 = Float.parseFloat(sc.nextLine());
			boolean checkSu = setSu(su1);
			if (checkSu) {
				break;
			}
		}
		System.out.println("Diem dia: ");
		while (true) {
			float dia1 = Float.parseFloat(sc.nextLine());
			boolean checkDia = setDia(dia1);
			if (checkDia) {
				break;
			}
		}
		tongC = getVan()+getSu()+getDia()+getMucUuTien();
	}
	
	public void display() {
		super.display();
		System.out.print("Van: "+getVan()+", Su: "+getSu()+", Dia: "+getDia()+" Tong diem: "+getTongC());
		System.out.println("");
	}
}