package ThreadEx;

public class ThreadTwo implements Runnable{
	ThreadOne threadOne;
	
	public ThreadTwo() {
		
	}

	public ThreadTwo(ThreadOne threadOne) {
		this.threadOne = threadOne;
	}

	@Override
	public void run() {
		System.out.println("T2 chuan bi chay");
		try {
			System.out.println("Join T1 vao T2");
			threadOne.join();
			System.out.println("T1 finished");
			for (int i = 0; i < 10; i++) {
				System.out.println("i2 = "+(i+1));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
