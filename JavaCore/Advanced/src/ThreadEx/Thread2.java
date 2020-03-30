package ThreadEx;

public class Thread2 {

	public static void main(String[] args) {
		//Thread main start
		System.out.println("Start");
		
		//Thread 1
		ThreadOne thre = new ThreadOne();
		thre.start();
		
		//Thread 2
		ThreadTwo thread = new ThreadTwo();
		Thread t = new Thread(thread);
		t.start();
		
		try {
			thre.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Thread main stop
		System.out.println("End");
		
//		try {
//			Thread.sleep(2000);
//			thre.stop();
//			t.stop();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
