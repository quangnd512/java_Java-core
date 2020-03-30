package ThreadEx;

public class ThreadOne extends Thread{
	@Override
	public void run() {
		System.out.println("T1 chuan bi chay");
		for (int i = 0; i < 10; i++) {
			System.out.println("i = "+(i+1));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
