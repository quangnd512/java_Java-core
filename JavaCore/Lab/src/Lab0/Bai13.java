package Lab0;

import java.util.Scanner;

public class Bai13 {
	static int n,m;
	static int [][] array = new int[50][50];
	
	//Nhap
	public static void nhapMT() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chieu rong cua ma tran: ");
		n = sc.nextInt();
		System.out.print("Nhap chieu dai cua ma tran: ");
		m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("Phan tu thu ["+(i+1)+"]["+(j+1)+"]: ");
				array[i][j] = sc.nextInt();
			}
		}
	}
	
	//In
	public static void inMT() {
		System.out.println("Ma tran");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	
	//Tim Min
	public static void ptMin() {
		int min = array[0][0];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (array[i][j]<min) {
					min = array[i][j];
				}
			}
		}
		System.out.println("Phan tu nho nhat la: "+min);
	}
	
	//Le max
	public static void leMax() {
		int max = array[0][0];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (array[i][j]%2!=0) {
					if(array[i][j]>max) {
						max = array[i][j];
					}
				}
			}
		}
		System.out.println("Phan tu le lon nhat la: "+max);
	}
	
	//Dong max
	public static void dongMax() {
		int tong = 0;
		for (int i = 0; i < n; i++) {
			array[i][m] = 0;
			for (int j = 0; j < m; j++) {
				array[i][m] += array[i][j];
				if(array[i][m]>tong) {
					tong = array[i][m];
				}
			}
		}
		System.out.println("Tong hang lon nhat la: "+tong);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count, yesno;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. De nhap ma tran.");
			System.out.println("2. De in ma tran.");
			System.out.println("3. Tim phan tu nho nhat cua ma tran.");
			System.out.println("4. Tim phan tu le lon nhat cua ma tran.");
			System.out.println("5. Tim dong co tong lon nhat cua ma tran.");
			System.out.println("Nhap so: ");
			count = sc.nextInt();
			switch (count) {
			case 1: nhapMT(); break;
			case 2: inMT(); break; 
			case 3: ptMin(); break;
			case 4: leMax(); break;
			case 5: dongMax(); break;
			default: 
				System.out.println("Ban da nhap sai.!"); 
				System.out.println("Ban muon nhap lai khong.?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				yesno = sc.nextInt();
				if(yesno==1) {
					count = 0;
				}else{
					break;
				}
			}
		}while(count!=6);
	}

	
}
