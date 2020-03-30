package Wait_Notify;

public class Thread2 extends Thread{
	ShareData share;
	
	public Thread2(ShareData share) {
		this.share = share;
	}
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			synchronized (share) {
				
				share.notifyAll();
				try {
					share.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int sum = share.rad*share.rad;
				System.out.println("T2["+i+"] > "+sum);
				
			}
		}
	}
}
