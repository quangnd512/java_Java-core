package Bai1;

import java.util.Scanner;

public abstract class Persion {
	private String name;
	private String address;
	private String deparment;
	
	public Persion(String name, String address, String deparment) {
		this.name = name;
		this.address = address;
		this.deparment = deparment;
	}
	public Persion() {
		
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho va ten: ");
		name = sc.nextLine();
		System.out.print("Dia chi: ");
		address = sc.nextLine();
		System.out.print("Bo mon: ");
		deparment = sc.nextLine();
	}
	
	public void hienThi() {
		System.out.print("Ho va ten: "+getName()+", Noi o: "+getAddress()+", Bo mon: "+getDeparment());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDeparment() {
		return deparment;
	}

	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	
	
}
