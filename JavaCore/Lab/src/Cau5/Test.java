package Cau5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LuxuryCar myLuxuryCar = new LuxuryCar();
		myLuxuryCar.nhap();
		myLuxuryCar.getInfor();
		
		float totalPrice = myLuxuryCar.caculatePrite(20000); 
		System.out.print("Tong gia: "+totalPrice);
	}

}
