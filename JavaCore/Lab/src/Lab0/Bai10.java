package Lab0;

import java.util.Scanner;

public class Bai10 {
	
	public static int Sum(int a) {
		int b,tong = 0;
		while(a>0) {
			b = a%10;
			a = a/10;
			tong =tong + b;
		}
		return tong;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so muon tinh: ");
		a = sc.nextInt();
		System.out.println("Tong cua "+a+" la: "+Sum(a));
	
	}

}
