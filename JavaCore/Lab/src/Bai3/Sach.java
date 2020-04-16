package Bai3;

import java.util.Scanner;

public class Sach extends ThuVien{
	String tenTacGia;
	int soTrang;
	
	public Sach() {
		
	}

	public Sach(String tenTacGia, int soTrang) {
		super();
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	
	public void input() {
		super.input();
	}
	
	public void edit() {
		super.edit();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ten tac gia: ");
		tenTacGia = sc.nextLine();
		System.out.println("So trang: ");
		soTrang = Integer.parseInt(sc.nextLine());
	}
	
	public void display() {
		super.display();
		System.out.print("Ten tac gia: "+getTenTacGia()+", So trang: "+getSoTrang()+".");
		System.out.println();
	}
}
