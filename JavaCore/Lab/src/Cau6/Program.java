package Cau6;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CTivi ct; 
		int n;
		System.out.println("Lua con cach khoi tao TV");
		System.out.println("1. Mac dinh");
		System.out.println("2. Lua chon kenh");
		System.out.print("Lua chon: ");
		n = Integer.parseInt(sc.nextLine());
		if (n==1) {
			ct = new CTivi();
		} else {
			System.out.print("Nhap so kenh: ");
			n = Integer.parseInt(sc.nextLine());
			String [] channel = new String[n];
			for (int i = 0; i < n; i++) {
				System.out.print("Nhap kenh thu "+(i+1));
				channel[i] = sc.nextLine();
			}
			ct = new CTivi(channel);
		}
		do {
			showMenu();
			n = Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1:
				ct.Switch();
				break;
			case 2:
				System.out.print("Nhap kenh can chuyen: ");
				String setChannel = sc.nextLine();
				ct.Switch(setChannel);
				break;
			case 3:
				ct.onTV();
				break;
			case 4:
				ct.offTV();
				break;
			case 5:
				ct.nextChannel();
				break;
			case 6:
				ct.prevChannel();
				break;
			case 7:
				ct.show();
				break;
			case 8:	System.out.println("Cam on da su dung.!");
	
				break;

			default: System.out.println("Lua chon sai.! Vui long lua chon lai.!");
				break;
			}
			
		} while (n!=8);
	}
	public static void showMenu() {
		System.out.println("\n1. Chuyen trang thai (switch) ");
		System.out.println("2. Chuyen trang thai kem theo kenh ");
		System.out.println("3. Bat TV ");
		System.out.println("4. Tat TV ");
		System.out.println("5. Next Channel");
		System.out.println("6. Prev Channel");
		System.out.println("7. Xem thong tin");
		System.out.println("8. Thoat");
	}

}
