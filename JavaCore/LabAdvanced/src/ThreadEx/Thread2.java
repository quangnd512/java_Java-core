package ThreadEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Thread2 extends Thread{
	List<Character> list2 = new ArrayList<>();
	@Override
	public void run() {
//		97-122
		int min = (int)'a';
		int max = (int)'z';
		int limit = max-min;
		Random ran = new Random();

		for (int i = 0; i < 10; i++) {
			int random = ran.nextInt(limit)+min;
			char c = (char)random;
			System.out.println("T2 > "+c);
			
			list2.add(c);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
