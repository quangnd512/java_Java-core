package Debug;

import java.util.Random;

public class DaySo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rad = new Random();
		int [] daySo = new int[10];
		for (int i = 0; i < 10; i++) {
			int radInt = rad.nextInt(10);
			daySo[i] = radInt;
		}
		System.out.print("Day so la: ");
		for (int i : daySo) {
			System.out.print(i+" ");
		}
	}
}
