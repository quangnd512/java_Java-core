package Bai4;

import java.util.Scanner;

public class KhoiA extends ThiSinh{
	float toan;
	float ly;
	float hoa;
	float tongA;
	
	public KhoiA() {
		
	}
	
	public KhoiA(float toan, float ly, float hoa) {
		this.toan = toan;
		this.ly = ly;
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

	public float getLy() {
		return ly;
	}

	public boolean setLy(float ly) {
		if (ly>=0&&ly<=10) {
			this.ly = ly;
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

	public float getTongA() {
		return tongA;
	}

	public void setTongA(float tongA) {
		this.tongA = tongA;
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
		
		System.out.println("Diem ly: ");
		while (true) {
			float ly1 = Float.parseFloat(sc.nextLine());
			boolean checkLy = setLy(ly1);
			if (checkLy) {
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
		tongA = getHoa()+getLy()+getToan()+getMucUuTien();
	}
	
	public void display() {
		super.display();
		System.out.print("Toan: "+getToan()+", Ly: "+getLy()+", Hoa: "+getHoa()+" Tong diem: "+getTongA());
		System.out.println("");
	}
}
