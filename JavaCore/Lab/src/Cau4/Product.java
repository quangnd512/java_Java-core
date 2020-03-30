package Cau4;

import java.util.Scanner;

public class Product {

	private String maHangHoa;
	private String tenHangHoa;
	private int soLuong;
	private float giaBan;
	
	public Product(String maHangHoa, String tenHangHoa, int soLuong, float giaBan) {
		this.maHangHoa = maHangHoa;
		this.tenHangHoa = tenHangHoa;
		this.soLuong = soLuong;
		this.giaBan = giaBan;
	}
	
	public Product() {
		
	}

	public String getMaHangHoa() {
		return maHangHoa;
	}

	public void setMaHangHoa(String maHangHoa) {
		this.maHangHoa = maHangHoa;
	}

	public String getTenHangHoa() {
		return tenHangHoa;
	}

	public void setTenHangHoa(String tenHangHoa) {
		this.tenHangHoa = tenHangHoa;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public float getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(float giaBan) {
		this.giaBan = giaBan;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu cua mang: ");
		int a = Integer.parseInt(sc.nextLine());
		Product[] pro = new Product[a];
		for (int i = 0; i < a; i++) {
			pro[i] = new Product();
			pro[i].input();
		}
		for (int i = 0; i < a; i++) {
			pro[i].display();
		}
		
		int index = 0;
		for (int i = 0; i < a; i++) {
			if(pro[i].getGiaBan()>pro[index].getGiaBan()) {
				index = i;
			}
		}
		System.out.println("San pham co gia cao nhat la: ");
		pro[index].display();
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ma hang hoa: ");
		maHangHoa = sc.nextLine();
		System.out.print("Ten hang hoa: ");
		tenHangHoa = sc.nextLine();
		System.out.print("So luong: ");
		soLuong = Integer.parseInt(sc.nextLine());
		System.out.println("Gia ban: ");
		giaBan = Float.parseFloat(sc.nextLine());
	}
	
	public void display() {
		System.out.println("Ma hang hoa: "+getMaHangHoa()+", Ten hoang hoa: "+getTenHangHoa()+", So luong: "+getSoLuong()+", Gia ban: "+getGiaBan());
	}

}
