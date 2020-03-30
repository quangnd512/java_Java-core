package ThreadEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Thread1 extends Thread{
	List<Integer> listData = new ArrayList<>();
	@Override
	public void run() {
		Random ran = new Random();
		for (int i = 0; i < 10; i++) {
			int rand = ran.nextInt(100);
			System.out.println("T1 > "+rand);
			
			listData.add(rand);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
