package Cau5;

import java.util.Scanner;

public class Car implements ICar{

	private String name;
	private String product;
	private String year;
	private int seat;
	private float rootPrice;
	
	public Car(String name, String product, String year, int seat, float rootPrice) {
		super();
		this.name = name;
		this.product = product;
		this.year = year;
		this.seat = seat;
		this.rootPrice = rootPrice;
	}
	
	public Car() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public float getRootPrice() {
		return rootPrice;
	}

	public void setRootPrice(float rootPrice) {
		this.rootPrice = rootPrice;
	}

	@Override
	public float caculateTax() {
		// TODO Auto-generated method stub
		if (seat<7) {
			return (float) (rootPrice*0.6);
		}
		return (float) (rootPrice*0.7);
	}

	@Override
	public float caculatePrite() {
		// TODO Auto-generated method stub
		return rootPrice+caculateTax();
		
	}

	@Override
	public void getInfor() {
		// TODO Auto-generated method stub
		System.out.println("Car [name=" + name + ", product=" + product + ", year=" + year + ", seat=" + seat + ", rootPrice="
				+ rootPrice + "]");
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho ten: ");
		name = sc.nextLine();
		System.out.print("Nha san xuat: ");
		product = sc.nextLine();
		System.out.print("Nam san xuat: ");
		year = sc.nextLine();
		System.out.print("Nhap so ghe: ");
		try {
			seat = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			seat = 0;
		}finally {
			
		}
		System.out.println("Nhap gia: ");
		try {
			rootPrice = Float.parseFloat(sc.nextLine());
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
	}

}
