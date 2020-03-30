package Wait_Notify;

import java.util.Random;

public class Thread1 extends Thread{
	ShareData share;
	
	public Thread1(ShareData share) {
		this.share = share;
	}

	@Override
	public void run() {
		Random rd = new Random();
		for (int i = 0; i < 300; i++) {
			synchronized (share) { //Thực hiện đồng bộ dựa trên thuộc tính share
				share.rad = rd.nextInt(100);
				System.out.println("T1["+i+"] > "+share.rad);
				
				share.notifyAll(); //Tất cả các luồng có chứa thuộc tính share trong synchronized đều được đánh thức

				try {
					share.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		}
	}
}
