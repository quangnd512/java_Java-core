package DaLuong;

import java.util.Random;

public class Thread1 extends Thread{
	ShareData shareData;
	
	
	public Thread1(ShareData shareData) {
		this.shareData = shareData;
	}


	@Override
	public void run() {
		Random rd = new Random();
		for (int i = 0; i < 10; i++) {
			int rd1 = rd.nextInt(5);
			shareData.add(rd1);
		}
	}
}
