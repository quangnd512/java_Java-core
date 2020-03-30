package Cau5;

import java.util.Scanner;

public class LuxuryCar extends Car{
	private float specialRate;

	public LuxuryCar(String name, String product, String year, int seat, float rootPrice, float specialRate) {
		super(name, product, year, seat, rootPrice);
		this.specialRate = specialRate;
	}
	public LuxuryCar() {
		
	}
	public float getSpecialRate() {
		return specialRate;
	}
	public void setSpecialRate(float specialRate) {
		this.specialRate = specialRate;
	}
	
	public float caculatePrite(){
		return getRootPrice()+caculateTax()+getRootPrice()*specialRate;
	}
	
	public float caculatePrite(float transport) {
		return caculatePrite()+transport;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ty gia: ");
		try {
			specialRate = Float.parseFloat(sc.nextLine());
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
	}
}
