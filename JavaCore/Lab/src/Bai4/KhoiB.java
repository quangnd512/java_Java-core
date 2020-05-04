package Bai4;

import java.util.Scanner;

public class KhoiB extends ThiSinh{
	float toan;
	float sinh;
	float hoa;
	float tongB;
	public KhoiB() {
		
	}
	
	public KhoiB(float toan, float sinh, float hoa) {
		this.toan = toan;
		this.sinh = sinh;
		this.hoa = hoa;
	}

	public float getToan() {
		return toan;
	}

	public boolean setToan(float toan) {
		if (toan>=0&&toan<=10) {
			this.toan = toan;
			return true;
		}else {
			System.err.println("Nhap khong dung.! Diem phai tu 0->10");
			return false;
		}
	}

	public float getSinh() {
		return sinh;
	}

	public boolean setSinh(float sinh) {
		if (sinh>=0&&sinh<=10) {
			this.sinh = sinh;
			return true;
		}else {
			System.err.println("Nhap khong dung.! Diem phai tu 0->10");
			return false;
		}
	}

	public float getHoa() {
		return hoa;
	}

	public boolean setHoa(float hoa) {
		if (hoa>=0&&hoa<=10) {
			this.hoa = hoa;
			return true;
		}else {
			System.err.println("Nhap khong dung.! Diem phai tu 0->10");
			return false;
		}
	}
	
	public float getTongB() {
		return tongB;
	}

	public void setTongB(float tongB) {
		this.tongB = tongB;
	}

	public void input() {
		super.input();
	}
	
	public void edit() {
		super.edit();
		Scanner sc = new Scanner(System.in);
		System.out.println("Diem toan: ");
		while (true) {
			float toan1 = Float.parseFloat(sc.nextLine());
			boolean checkToan = setToan(toan1);
			if (checkToan) {
				break;
			}
		}
		System.out.println("Diem hoa: ");
		while (true) {
			float hoa1 = Float.parseFloat(sc.nextLine());
			boolean checkHoa = setHoa(hoa1);
			if (checkHoa) {
				break;
			}
		}
		System.out.println("Diem sinh: ");
		while (true) {
			float sinh1 = Float.parseFloat(sc.nextLine());
			boolean checkSinh = setSinh(sinh1);
			if (checkSinh) {
				break;
			}
		}
		tongB = getToan()+getHoa()+getSinh()+getMucUuTien();
	}
	
	public void display() {
		super.display();
		System.out.print("Toan: "+getToan()+", Hoa: "+getHoa()+", Sinh: "+getSinh()+" Tong diem: "+getTongB());
		System.out.println("");
	}
}