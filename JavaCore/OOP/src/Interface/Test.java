package Interface;

import java.util.Scanner;

public class Test extends Persion implements IPersion{
	
	
	public Test(String name, int age, float height) {
		super(name, age, height);
		// TODO Auto-generated constructor stub
	}
	
	// Định nghĩa lại phương thức trong interface
	@Override
	public void soThich() { 
		Test t = new Test(name, age, height); 
		System.out.println(name+" Thích chơi game va doc sach "+book+".!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tname;
		int tage;
		float theight;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		tname = sc.nextLine();
		System.out.print("Nhap tuoi: ");
		tage = sc.nextInt();
		System.out.print("Nhap chieu cao: ");
		theight = sc.nextFloat();
		Test t = new Test(tname, tage, theight);
		t.getInfo();
		t.soThich();
	}

}
