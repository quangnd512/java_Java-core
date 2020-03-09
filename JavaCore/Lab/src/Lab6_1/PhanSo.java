package Lab6_1;

import java.util.Scanner;


public class PhanSo {

	private int tuSo;
	private int mauSo;
	
	public PhanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
	
	public PhanSo() {
		
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tu so: ");
		tuSo = sc.nextInt();
		System.out.print("Nhap mau so: ");
		mauSo = sc.nextInt();
	}
	
	public void hienThi() {
		int tong = 0;
		if(mauSo==0) {
			System.out.println("Phan so khong dung.!");
		}else {
			System.out.println("Phan so vua nhap la: "+tuSo+" / "+mauSo);
		}
	}
	
	public void tinhPS(float c, float d) {
		float a;
		float b;
		float tong = 0, hieu = 0, tich = 1, thuong = 1, phanSo1 = 0, phanSo2 = 0;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Cac phep tinh phan so.!");
		System.out.print("Nhap tu so cua phan so thu hai: ");
		a = sc.nextFloat();
		System.out.print("Nhap mau so cua phan so thu hai: ");
		b = sc.nextFloat();
		if(b==0) {
			System.out.println("Phan so nay khong dung.!");
		}else {
			phanSo2 = a/b;
		}
		phanSo1 = c/d;
		tong = phanSo1+phanSo2;
		hieu = phanSo1-phanSo2;
		tich = phanSo1*phanSo2;
		thuong = phanSo1/phanSo2;
		System.out.println("Tong cua hai phan so la: "+tong);
		System.out.println("Hieu cua hai phan so la: "+hieu);
		System.out.println("Tich cua hai phan so la: "+tich);
		System.out.println("Thuong cua hai phan so la: "+thuong);
	}
	
	public boolean ktToiGian(int a, int b) {
		int hcf = 0;
		for (int i = 1; i <=a || i<=b; i++) {
			if (a%i==0&&b%i==0) {
				hcf++;
			}
		}
		if(hcf<=1) {
			return true;
		}else {
			return false;
		}
	}
	
	public void timToiGian(int a, int b) {
		int toiGian = 0;
		int tuSo1, mauSo1;
		for (int i = 1; i <= a||i<=b; i++) {
			if(a%i==0&&b%i==0) {
				toiGian=i;
			}
		}
		tuSo1 = a/toiGian;
		mauSo1 = b/toiGian;
		System.out.println("Phan so duoi dang rut gon la: "+tuSo1+" / "+mauSo1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhanSo ps = new PhanSo();
		ps.nhap();
		ps.hienThi();
		if(ps.ktToiGian(ps.tuSo, ps.mauSo)==true) {
			System.out.println("Phan so la toi gian.!");
		}else {
			System.out.println("Phan so chua toi gian.!");
		}
		ps.timToiGian(ps.tuSo, ps.mauSo);
		System.out.println();
		ps.tinhPS(ps.tuSo, ps.mauSo);
	}

}
