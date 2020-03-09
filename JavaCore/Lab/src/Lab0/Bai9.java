package Lab0;

import java.util.Scanner;

public class Bai9 {
	/**
	 * 1 1 2 3 5 8 13 21 34 55 89
	 * 1 2 3 4 5 6 7  8  9  10 11
	 */
	public static int fibo(int n) {
		if(n==0||n==1) {
			return 1;
		}else {
			return fibo(n-1)+fibo(n-2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dem = 0, n;
		int i=0;
		Scanner sc = new Scanner(System.in);
		Bai9 poniter = new Bai9();
		System.out.print("Nhap so thu tu cua day fibo: ");
		n = sc.nextInt();
		while(dem<n) {
			fibo(i);
			i++;
			dem++;
		}
		if(dem==n) {
			System.out.println("So fibonacci thu "+n+" la: "+poniter.fibo(i-1));
		}
	}

}
