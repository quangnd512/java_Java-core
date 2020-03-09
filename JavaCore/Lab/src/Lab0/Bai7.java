package Lab0;

import java.util.Scanner;

public class Bai7 {
	
	public static int giaiThua(int n) {
		if(n<2) {
			return 1;
		}else{
			return n*giaiThua(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, giaiThua = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap giai thua: ");
		n = sc.nextInt();
		System.out.println("Giai thua do la: "+giaiThua(n));
	}

}
