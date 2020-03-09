package Lab0;

import java.util.Scanner;


public class Bai14 {

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
	
	//Tim so max va chi so 
	public static void timMax() {
		int max = 0, k = 0,h = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(array[i][j]>max) {
					max = array[i][j];
					k=i;
					h=j;
				}
			}
		}
		System.out.println("Phan tu max la phan tu array["+(k+1)+"]["+(h+1)+"]: "+max);
	}
	
	
	//So nguyen to
	//Kiem tra
	public static boolean kiemTraNT(int m) {
		if(m<=1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(m); i++) {
			if(m%i==0) {
				return false;
			}
		}
		return true;
	}
	
	//In so nguyen to
	public static void inSNT() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (kiemTraNT(array[i][j])) {
					System.out.print(array[i][j]+"\t");
				}else {
					System.out.print(0+"\t");
				}
			}
			System.out.println("");
		}
	}
	
	//Sap xep cot
	public static void sapXep() {
		int t=0;
        for(int x=0;x<n;x++)
        {
            for(int y=0;y<m;y++)
            {
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        if(array[i][j]>array[x][y])
                        {
                            t=array[x][y];
                            array[x][y]=array[i][j];
                            array[i][j]=t;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapMT();
		inMT();
		int count, yesno;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Tim phan tu lon nhat cua ma tran.");
			System.out.println("2. In ma tran nguyen to.");
			System.out.println("3. Sap xep ma tran.");
			System.out.println("Nhap so: ");
			count = sc.nextInt();
			switch (count) {
			case 1: timMax(); break;
			case 2: inSNT(); break; 
			case 3: sapXep(); break;
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
		}while(count!=4);
		
	}
}
